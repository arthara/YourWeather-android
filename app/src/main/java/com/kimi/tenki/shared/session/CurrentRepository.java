package com.kimi.tenki.shared.session;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.kimi.tenki.current.CurrentModel;

import java.util.LinkedList;

public class CurrentRepository implements SessionRepository<LinkedList<CurrentModel>> {
    private static String HISTORY_WEATHER = "HistoryWeather";
    private SharedPreferences sharedPref;

    public CurrentRepository(Context context) {
        sharedPref = context.getSharedPreferences(SHARED_PREFERENCE_NAME, Context.MODE_PRIVATE);
    }

    @Override
    public LinkedList<CurrentModel> getSessionData() {
        String sessionDataJson = sharedPref.getString(HISTORY_WEATHER, null);

        if (sessionDataJson == null){
            return new LinkedList<>();
        }
        return new Gson().fromJson(sessionDataJson, LinkedList.class);
    }

    public void addCurrentData(CurrentModel data) {
        final int MAXIMUM_DATA = 5;
        SharedPreferences.Editor editor = sharedPref.edit();

        LinkedList<CurrentModel> list = getSessionData();
        if(list.size() >= MAXIMUM_DATA)
            list.removeFirst();
        list.add(data);
        editor.clear();
        editor.putString(HISTORY_WEATHER, new Gson().toJson(list));
        editor.apply();
    }
}
