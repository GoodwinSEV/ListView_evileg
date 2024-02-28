package com.example.listview_evileg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        ArrayList<DataFlags> list = new ArrayList<>();
        list.clear();

        list.add(new DataFlags(R.drawable.flag_russia, R.string.russian, R.string.russianRUB));
        list.add(new DataFlags(R.drawable.flag_zambezi, R.string.africa, R.string.africaZAR));
        list.add(new DataFlags(R.drawable.flag_sg, R.string.singapore, R.string.singaporeSGD));
        list.add(new DataFlags(R.drawable.flag_tr, R.string.turkish, R.string.turkishTRY));

        MyListAdapter myListAdaptery = new MyListAdapter(this, list);
        listView.setAdapter(myListAdaptery);
    }
}