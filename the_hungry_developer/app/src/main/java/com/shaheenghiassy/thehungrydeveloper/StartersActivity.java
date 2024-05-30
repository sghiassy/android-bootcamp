package com.shaheenghiassy.thehungrydeveloper;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class StartersActivity extends AppCompatActivity {

    ListView startersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);


        startersList = findViewById(R.id.list_view_starters);


        String[] dishes = {"Starters", "Mains", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T"};
        ArrayAdapter<String> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
        startersList.setAdapter(dishesAdapter);

    }
}