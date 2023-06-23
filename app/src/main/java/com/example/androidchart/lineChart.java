package com.example.androidchart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.Map;

public class lineChart extends AppCompatActivity {
LineChart chart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_chart);

        chart = findViewById(R.id.linechart);
        // record
        ArrayList<Entry> infor = new ArrayList<>();
        infor.add(new Entry(30 ,100 ));
        infor.add(new Entry(10 ,25 ));
        infor.add(new Entry(20 ,150 ));
        infor.add(new Entry(40 ,50 ));
        infor.add(new Entry(50,10 ));
        infor.add(new Entry(60 ,120 ));
        infor.add(new Entry(80 ,60 ));


        // Data set
        LineDataSet dataSet = new LineDataSet(infor , " line char record");
        dataSet.setValueTextSize(28f);
        dataSet.setValueTextColor(android.R.color.background_dark);
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        // data
        LineData lineData = new LineData(dataSet);
        //
        chart.setData(lineData);
        chart.setFitsSystemWindows(true);
        chart.animateXY(4000 , 4000);

    }
}