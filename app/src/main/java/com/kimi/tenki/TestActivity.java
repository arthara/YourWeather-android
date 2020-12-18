package com.kimi.tenki;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import com.kimi.tenki.current.CurrentModel;
import com.kimi.tenki.current.CurrentService;
import com.kimi.tenki.forecast.ForecastModel;
import com.kimi.tenki.forecast.ForecastService;
import com.kimi.tenki.shared.retrofit.ServiceGenerator;
import com.kimi.tenki.shared.session.CurrentRepository;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TestActivity extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //test api
//        testCurrentAPI();
        testForecastAPI();
        //test api
        //Intent intent = new Intent(this, MapsActivity.class);
//        startActivity(intent);
    }

    private void testCurrentAPI(){
        CurrentService service = ServiceGenerator.createService(CurrentService.class);
        Call call = service.getByLocation(80.02f, -7.82f);
        call.enqueue(new Callback<CurrentModel>() {
            @Override
            public void onResponse(Call<CurrentModel> call, Response<CurrentModel> response) {
                if (response.isSuccessful() && response.body() != null) {
                    Log.d("Berhasil", response.body().toString());
                    cacheCurrent(response.body());
                    logCache();
                } else {
                    Log.d("Gagal", response.toString());
                }
            }

            @Override
            public void onFailure(Call<CurrentModel> call, Throwable t) {
                Log.d("Request Failure", t.getMessage());
            }
        });
    }

    private void testForecastAPI(){
        ForecastService service = ServiceGenerator.createService(ForecastService.class);
        Call call = service.getByLocation(80.02f, -7.82f);
        call.enqueue(new Callback<ForecastModel>() {
            @Override
            public void onResponse(Call<ForecastModel> call, Response<ForecastModel> response) {
                if (response.isSuccessful() && response.body() != null) {
                    Log.d("Berhasil", response.body().toString());
                } else {
                    Log.d("Gagal", response.toString());
                }
            }

            @Override
            public void onFailure(Call<ForecastModel> call, Throwable t) {
                Log.d("Request Failure", t.getMessage());
            }
        });
    }

    private void cacheCurrent(CurrentModel currentData){
        CurrentRepository current = new CurrentRepository(this);
        current.addCurrentData(currentData);
    }

    private void logCache(){
        CurrentRepository current = new CurrentRepository(this);
        Log.d("Current Data", "" + current.getSessionData().size());
    }
}
