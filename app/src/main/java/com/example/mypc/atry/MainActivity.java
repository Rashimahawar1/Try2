package com.example.mypc.atry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    float rainfall[]={23.4f,32.6f,89.45f,67.34f,73.90f};
    String month[]={"jan","feb","march","april","may"};

     com.github.mikephil.charting.charts.PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          setUpPieChart();

    }

         private void setUpPieChart(){

        java.util.List<com.github.mikephil.charting.data.PieEntry> pieEntries = new java.util.ArrayList<>();
        for(int i=0;i<rainfall.length;i++)
            {
                pieEntries.add(new com.github.mikephil.charting.data.PieEntry(rainfall[i],month[i]));
            }
             com.github.mikephil.charting.data.PieDataSet dataset = new com.github.mikephil.charting.data.PieDataSet(pieEntries,"Rainfall Analysis");
              com.github.mikephil.charting.data.PieData data = new com.github.mikephil.charting.data.PieData(dataset);
              com.github.mikephil.charting.charts.PieChart chart=(com.github.mikephil.charting.charts.PieChart)findViewById(R.id.chart);
              chart.setData(data);
              chart.invalidate();
        }
    }

