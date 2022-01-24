package com.learnProgramming;

public class Floor {
    //init the field
    private double width;
    private double length;

    //declare the constructor

    public Floor(double width, double length){
        if (width <= 0 || length <= 0){
            this.width = 0;
            this.length = 0;
        } else {
            this.width = width;
            this.length = length;
        }
    }

    // declare the method to find the Area
    public double getArea() {
        return this.width * this.length;
    }



}
