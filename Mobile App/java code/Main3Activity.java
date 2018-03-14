package studytutorial.in.barchart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        BarChart barChart = (BarChart) findViewById(R.id.barchart);

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(5.202f, 0));
        entries.add(new BarEntry(3.638f, 1));
        entries.add(new BarEntry(3.517f, 2));
        entries.add(new BarEntry(2.731f, 3));
        entries.add(new BarEntry(2.716f, 4));


        BarDataSet bardataset = new BarDataSet(entries, "Cells");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("MNvUSfRHzdQ");
        labels.add("G2NRNSMQtro");
        labels.add("ZyFRjfDhZbk");
        labels.add("MWYi4_COZMU");
        labels.add("ZmY8Q-kVH5A");


        BarData data = new BarData(labels, bardataset);
        barChart.setData(data); // set the data and list of lables into chart



        bardataset.setColors(ColorTemplate.COLORFUL_COLORS);

        barChart.animateY(5000);



    }
}