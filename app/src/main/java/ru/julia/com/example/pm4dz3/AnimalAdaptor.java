package ru.julia.com.example.pm4dz3;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalAdaptor {

    private List<Animal> animals;
    private final LayoutInflater inflater;

    public AnimalAdaptor(List<Animal> animals, LayoutInflater inflater) {
        this.animals = animals;
        this.inflater = inflater;
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
