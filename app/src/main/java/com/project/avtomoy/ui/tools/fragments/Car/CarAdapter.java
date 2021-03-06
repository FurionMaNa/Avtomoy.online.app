package com.project.avtomoy.ui.tools.fragments.Car;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.project.avtomoy.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarAdapter extends RecyclerView.Adapter<CarViewHolder> {
    public ArrayList<Car> cars;

    public CarAdapter(ArrayList<Car> cars) {
        this.cars = cars;
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_for_car,parent,false);
        return  new CarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        holder.bindData(cars.get(position));
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }
}

