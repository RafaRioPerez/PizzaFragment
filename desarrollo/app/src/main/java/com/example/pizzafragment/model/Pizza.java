package com.example.pizzafragment.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Pizza {
    public Pizza(String name, String descripcion, float price) {
        Name = name;
        this.descripcion = descripcion;
        this.price = price;
    }

    public Pizza() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        return super.equals(obj);
    }

    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public String getName() {
        return Name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrice() {
        return price;
    }

    private String Name;
    private String descripcion;
    private float price;


    public void setName(String name) {
        Name = name;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
