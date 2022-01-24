package com.learnProgramming;

public class Carpet {
    //init the field
    private double cost;

    //declare the constructor
    public Carpet(double cost){
        if (cost <= 0){
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    //Create method to get the cost
    public double getCost(){
        return this.cost;
    }

}
