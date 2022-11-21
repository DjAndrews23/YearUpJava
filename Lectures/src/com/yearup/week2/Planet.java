package com.yearup.week2;

import java.util.Scanner;

public class Planet implements Calculator {
    String planetName;
    double planetRadius;
    protected String star;

    Planet(String name, double radius, String star){
        this.planetName = name;
        this.planetRadius = radius;
        this.star = star;
    }
    public String plantStar() {
        System.out.println("The planet's star is " + this.star);
        return this.star;
    }

    @Override
    public double getArea(double side1, double side2) {
        double planetArea = Math.PI * this.planetRadius * this.planetRadius;

        return planetArea;
    }

    @Override
    public double getSum(double side1, double side2) {
        double sum = side1 + side2;

        System.out.println("The sum is " + sum);

        return sum;
    }

    @Override
    public double getVolume(double side1, double side2, double side3) {
        double volume = side1 * side2 * side3;

        System.out.println("The volume is " + volume);

        return volume;
    }
}

