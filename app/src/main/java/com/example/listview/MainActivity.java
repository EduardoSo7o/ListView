package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private ListView listView;

    private String[] names = {"Samuel", "Valentina", "Santiago", "Alejandro", "Valeria", "Benjamin", "Gerardo", "Carlos", "David", "Sofia"};
    private String[] ages = {"18", "25", "32", "17", "24", "20", "27", "15", "19", "23"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tv1);
        listView = findViewById(R.id.lv1);

        //ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listview_item_eduardocarreon, names);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                textView.setText(listView.getItemAtPosition(position) +" is " + ages[position] + "years old");
            }
        });
    }
}