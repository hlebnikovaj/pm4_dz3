package ru.julia.com.example.pm4dz3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AnimalAdaptor extends RecyclerView.Adapter<AnimalAdaptor.ViewHolder>{


    private final List<Animal> animals;
    private final LayoutInflater inflater;

    public AnimalAdaptor(List<Animal> animals, Context context) {
        this.animals = animals;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
         Animal animal = animals.get(position);
         holder.animalView.setImageResource(animal.getAnimalRes());
         holder.nameView.setText(animal.getName());
         holder.animalDesView.setText(animal.getAnimalDescription());
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        final ImageView animalView;
        final TextView nameView, animalDesView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            animalView = itemView.findViewById(R.id.imageView);
            nameView = itemView.findViewById(R.id.name);
            animalDesView = itemView.findViewById(R.id.descr);

        }
    }
}
