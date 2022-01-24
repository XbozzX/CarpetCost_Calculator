package com.learnProgramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Floor floor = new Floor(2.75,4.0);
        Carpet carpet = new Carpet(3.5);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("Total Cost= RM" + calculator.getTotalCost());
        System.out.println("==========================================");
        Floor floor1 = new Floor(5.4,4.5);
        Carpet carpet1 = new Carpet(1.5);
        Calculator calculator1 = new Calculator(floor1, carpet1);
        System.out.println("Total Cost= RM" + calculator1.getTotalCost());
    }
}
