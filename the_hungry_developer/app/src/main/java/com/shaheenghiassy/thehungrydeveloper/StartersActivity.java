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

        Dish[] dishez = {
                new Dish("Starters", "", 4),
                new Dish("Mains", "", 4),
                new Dish("A", "", 4),
                new Dish("B", "", 4),
                new Dish("C", "", 4),
                new Dish("D", "", 4),
                new Dish("E", "", 4),
                new Dish("F", "", 4),
                new Dish("G", "", 4),
                new Dish("H", "", 4),
                new Dish("I", "", 4),
                new Dish("J", "", 4),
                new Dish("K", "", 4),
                new Dish("L", "", 4),
                new Dish("M", "", 4),
                new Dish("N", "", 4),
                new Dish("O", "", 4),
                new Dish("P", "", 4),
                new Dish("Q", "", 4),
                new Dish("R", "", 4),

        };
        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishez);
        startersList.setAdapter(dishesAdapter);

    }
}