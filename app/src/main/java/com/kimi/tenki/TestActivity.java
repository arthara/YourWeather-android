package com.kimi.tenki;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import com.kimi.tenki.current.CurrentModel;
import com.kimi.tenki.current.CurrentService;
import com.kimi.tenki.current.CurrentServiceGenerator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TestActivity extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CurrentService service = CurrentServiceGenerator.createService(CurrentService.class);
        Call call = service.getByLocation(80.02f, -7.82f);
        call.enqueue(new Callback<CurrentModel>() {
            @Override
            public void onResponse(Call<CurrentModel> call, Response<CurrentModel> response) {
                if (response.isSuccessful() && response.body() != null) {
                    Log.d("Berhasil", response.body().toString());
                } else {
                    Log.d("Gagal", response.toString());
                }
            }


            @Override
            public void onFailure(Call<CurrentModel> call, Throwable t) {
                Log.d("Request Failure", t.getMessage());
            }
        });
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}
