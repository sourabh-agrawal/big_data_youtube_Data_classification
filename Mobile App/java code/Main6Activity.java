package studytutorial.in.barchart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        BarChart barChart = (BarChart) findViewById(R.id.barchart);

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(6.534192f, 0));
        entries.add(new BarEntry(3.37546f, 1));
        entries.add(new BarEntry(2.77216f, 2));
        entries.add(new BarEntry(1.82354f, 3));
        entries.add(new BarEntry(1.8141492f, 4));


        BarDataSet bardataset = new BarDataSet(entries, "Cells");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("12Z3J1uzd0Q");
        labels.add("54DC4Rb9quKk");
        labels.add("15LU8DDYz68kM");
        labels.add("90kHmvkRoEowc");
        labels.add("63Md6rURKhZmA");


        BarData data = new BarData(labels, bardataset);
        barChart.setData(data); // set the data and list of lables into chart



        bardataset.setColors(ColorTemplate.COLORFUL_COLORS);

        barChart.animateY(5000);



    }
}
