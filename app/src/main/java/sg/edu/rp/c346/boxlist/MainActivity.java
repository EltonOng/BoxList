package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvBox;

    ArrayList<Box> alBox;
    CustomAdapter caBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvBox = findViewById(R.id.listViewBox);

        alBox = new ArrayList<>();
        Box b = new Box("Blue");
        Box b1 = new Box("Orange");
        Box b2 = new Box("Brown");
        alBox.add(b);
        alBox.add(b1);
        alBox.add(b2);

        caBox = new CustomAdapter(this,R.layout.box_item,alBox);
        lvBox.setAdapter(caBox);
    }
}
