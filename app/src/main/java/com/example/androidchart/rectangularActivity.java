package com.example.androidchart;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class rectangularActivity extends AppCompatActivity {
   BarChart barChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangular);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN);
        barChart = findViewById(R.id.barchart);

                // Data Info Record
                ArrayList<BarEntry> barinfo = new ArrayList<>();
                barinfo.add(new BarEntry(2010 , 1000));
                barinfo.add(new BarEntry(2011 , 1200));
                barinfo.add(new BarEntry(2012 , 1805));
                barinfo.add(new BarEntry(2013 , 900));
                barinfo.add(new BarEntry(2014 , 1289));
                barinfo.add(new BarEntry(2015 , 1900));
                barinfo.add(new BarEntry(2016, 800));
                barinfo.add(new BarEntry(2017 , 1400));
                barinfo.add(new BarEntry(2018 , 200));
                barinfo.add(new BarEntry(2019 , 2000));
                barinfo.add(new BarEntry(2020 , 700));
                barinfo.add(new BarEntry(2021 , 1500));
                barinfo.add(new BarEntry(2022 , 500));
              // data set
                BarDataSet dataSet =  new BarDataSet(barinfo , "Report");
                dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
                dataSet.setValueTextColor(android.R.color.black);
                dataSet.setValueTextSize(20f);
                // data
                BarData barData = new BarData(dataSet);

                barChart.setFitBars(true);
                barChart.setData(barData);
                barChart.getDescription().setText("Rectangular bar graph");
                barChart.animateY(4000);
            }

}