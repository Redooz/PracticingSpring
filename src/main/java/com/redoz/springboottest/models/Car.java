package com.redoz.springboottest.models;

public class Car {
    private String licensePlate;
    private String brand;
    private String name;
    private String color;

    public Car() {
    }

    public Car(String licensePlate, String brand, String name, String color) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.name = name;
        this.color = color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return getLicensePlate()+" "+getBrand()+" "+getName()+" "+getColor();
    }
}
