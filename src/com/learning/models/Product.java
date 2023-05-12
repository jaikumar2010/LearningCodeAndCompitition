package com.learning.models;

import java.util.UUID;

public class Product {
    private UUID id;
    private String name;
    private Double ratePerKilogram;

    Product(){
    }

    public Product(String name, Double ratePerKilogram) {
        this.name = name;
        this.ratePerKilogram = ratePerKilogram;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRatePerKilogram() {
        return ratePerKilogram;
    }

    public void setRatePerKilogram(Double ratePerKilogram) {
        this.ratePerKilogram = ratePerKilogram;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ratePerKilogram=" + ratePerKilogram +
                '}';
    }
}
