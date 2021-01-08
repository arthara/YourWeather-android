package com.kimi.tenki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class CustomInfoWindowActivity implements GoogleMap.InfoWindowAdapter{
    private View view;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomInfoWindowActivity(Context context) {
        this.context = context;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.custom_info_window, null);
    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {
        TextView title = view.findViewById(R.id.cityTitle);
        title.setText(marker.getTitle());

        TextView morecityinfo = (TextView) view.findViewById(R.id.moreCityInfo);
        //morecityinfo.setText(marker.getSnippet());
        return view;
    }
}
