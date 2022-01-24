package com.learnProgramming;

public class Calculator {
    //init the field
    private Floor floor;
    private Carpet carpet;

    //declare the constructor
    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    //Create method to get the total cost
    public  double getTotalCost(){
        double floorArea = floor.getArea();
        double carpetCost = carpet.getCost();
        return (floorArea * carpetCost);
    }

}
