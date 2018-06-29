package com.klux.clock;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by User on 2/28/2017.
 */

public class tab1 extends Fragment {
    private static final String TAG = "Tab1Fragment";
    private TextView dateTimeDisplay;
    private Calendar calendar;
    private SimpleDateFormat dateFormat;
    private String date;
    private TextView txt;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1,container,false);
        TextView txt = (TextView) view.findViewById(R.id.simpleDigitalClock);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Product Sans Regular.ttf");
        txt.setTypeface(font);


        TextView dateTimeDisplay = (TextView)view.findViewById(R.id.text_date_display);
        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("EEE, MMM d, yyyy");
        date = dateFormat.format(calendar.getTime());
        dateTimeDisplay.setText(date);
        dateTimeDisplay.setTypeface(font);
        return view;
    }
}
