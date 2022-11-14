package com.yearup.week2.homework;

import java.util.Scanner;

public class Executor {
    static Scanner scanner = new Scanner(System.in);
    static SolarSystemPlanet newPlanet = new SolarSystemPlanet("newPlanet",5,"newStar");


    public static void displayArea(double planetArea) {
        System.out.println("Area of the planet is" + " " + planetArea);
    }

    public void plantStar() {
        System.out.println("The planet's star is the " + newPlanet.star);}


    public static void planetPosition(String planetName) {
        int position = newPlanet.planetPosition(planetName);
        System.out.println("The position of the planet is: " + position);
    }


    public static String getPlantName() {
        System.out.println("Enter the planet name: ");
        Scanner Input1 = new Scanner(System.in);
        String planetName = Input1.nextLine();
        return planetName;
    }

    public static double getPlantRadius() {
        System.out.println("Enter the planet radius: ");
        Scanner Input2 = new Scanner(System.in);
        double planetRadius = Input2.nextDouble();
        return planetRadius;
    }

    public static void main(String[] args) {
        boolean checkAgain = false;

        do {
            checkAgain = false;

            String planetName = getPlantName();

            double planetArea = newPlanet.getArea(5, 5);

            displayArea(planetArea);

            newPlanet.plantStar();

            newPlanet.planetPosition("earth");
            planetPosition("earth");


            System.out.println("Would you like to check another planet? ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("yes")) {
                checkAgain = true;
            }
            else{
                System.out.println("Thanks for using our planet application. Goodbye!");
            }

        }while(checkAgain);


    }

}

