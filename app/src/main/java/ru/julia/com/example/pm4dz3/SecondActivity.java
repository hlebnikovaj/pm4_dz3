package ru.julia.com.example.pm4dz3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
     private List<Animal> animals;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitialDate();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        AnimalAdaptor adaptor = new AnimalAdaptor(animals, this);
        recyclerView.setAdapter(adaptor);

    }

    private void setInitialDate(){
        animals = new ArrayList<>();
        animals.add(new Animal("Лиса", "хищное млекопитающее",
                "10", R.drawable.img_3));
        animals.add(new Animal("Лиса", "хищное млекопитающее",
                "10", R.drawable.img_3));

    }
}