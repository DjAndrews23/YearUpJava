package com.yearup.week2.homework;

import java.util.Scanner;

public class SquareCalculatorClass implements Calculator {
    private double area;
    private double lengthOfSide;

    @Override
    public double getArea(double side1, double side2) {
        this.area = side1 * side2;
        return this.area;
    }

    public void displayArea() {
        System.out.println("The area of the square is" + " " + area);
    }

    public void setLengthOfSide() {
        Scanner Input1 = new Scanner(System.in);
        System.out.println("Enter the length of the square's side: ");
        this.lengthOfSide = Input1.nextDouble();
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


    public static void main(String[] args) {

        SquareCalculatorClass square1 = new SquareCalculatorClass();
        square1.setLengthOfSide();
        double squareArea = square1.getArea(square1.lengthOfSide, square1.lengthOfSide);
        square1.displayArea();
    }


}
