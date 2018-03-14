package studytutorial.in.barchart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main2);

        BarChart barChart = (BarChart) findViewById(R.id.barchart);

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(9.11f, 0));
        entries.add(new BarEntry(8.70f, 1));
        entries.add(new BarEntry(4.20f, 2));
        entries.add(new BarEntry(2.53f, 3));
        entries.add(new BarEntry(0.65f, 4));


        BarDataSet bardataset = new BarDataSet(entries, "Cells");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("Entertainment");
        labels.add("Music");
        labels.add("Comedy");
        labels.add("Sports");
        labels.add("Education");


        BarData data = new BarData(labels, bardataset);
        barChart.setData(data); // set the data and list of lables into chart



        bardataset.setColors(ColorTemplate.COLORFUL_COLORS);

        barChart.animateY(5000);



    }
}


