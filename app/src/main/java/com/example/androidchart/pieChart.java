package com.example.androidchart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class pieChart extends AppCompatActivity {
   PieChart pieChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN);
       pieChart = findViewById(R.id.piechart);
          /// record
        ArrayList<PieEntry> pieinfo = new ArrayList<>();
        pieinfo.add(new PieEntry(32 , "Quater1"));
        pieinfo.add(new PieEntry(18 , "Quater2"));
        pieinfo.add(new PieEntry(28 , "Quater3"));
        pieinfo.add(new PieEntry(66 , "Quater4"));
        pieinfo.add(new PieEntry(55 , "Quater5"));
         pieinfo.add(new PieEntry( 25, "Quater6"));

       // dataset
        PieDataSet pieDataSet = new PieDataSet(pieinfo , "Pie chart report ");
        pieDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        pieDataSet.setValueTextColor(android.R.color.black);
        pieDataSet.setValueTextSize(28f);

        // data
        PieData pieData = new PieData(pieDataSet);

        // now passing the data in chart
        pieChart.setData(pieData);
        pieChart.setCenterText("Quaterly revenue ");
        pieChart.getDescription().setEnabled(true);
        pieChart.animateXY(4000 ,4000);
    }
}