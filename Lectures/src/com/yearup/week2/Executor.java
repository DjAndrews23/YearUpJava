package com.yearup.week2;

import java.util.Scanner;

public class Executor {
    static Scanner scanner = new Scanner(System.in);
    static SolarSystemPlanet newPlanet = new SolarSystemPlanet("newPlanet", 5, "newStar");


    public static void displayArea(double planetArea) {
        System.out.println("Area of the planet is" + " " + planetArea);
    }

    public void plantStar() {
        System.out.println("The planet's star is the " + newPlanet.star);
    }


    public static void planetPosition(String planetName) {
        int position = newPlanet.planetPosition(planetName);
        System.out.println("The position of the planet is: " + position);
    }


    public static String getPlantName() {
        System.out.println("Enter the planet name:");
        Scanner Input1 = new Scanner(System.in);
        String planetName = Input1.nextLine();
        return planetName;
    }

    public static double getPlantRadius() {
        System.out.println("Enter the planet radius:");
        Scanner Input2 = new Scanner(System.in);
        double planetRadius = Input2.nextDouble();
        return planetRadius;
    }

    public static void main(String[] args) {


        /*boolean checkAgain = false;

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
            } else {
                System.out.println("Thanks for using our planet application. Goodbye!");
            }

        } while (checkAgain);
         */


        int moons = getNumberOfMoons(PlanetName.JUPITER);
        System.out.println(moons);


        int y = displayNumberOfMoons("neptune");
        System.out.println(y);


    }


    interface CelestialObject {
        void displayCelestialObject();
    }



    CelestialObject celestialObject = new CelestialObject() {
        @Override
        public void displayCelestialObject() {
            System.out.println("Comet is a celestial object");

        }
    };

    public static class Milkyway {

        void displaysText() {
            System.out.println("Your planet belongs to Milky way galaxy");
        }
    }

    public static enum PlanetName {
        MERCURY(0),
        VENUS(0),
        EARTH(1),
        MARS(2),
        JUPITER(80),
        SATURN(83),
        URANUS(27),
        NEPTUNE(14);

        int numberOfMoons;

        PlanetName(int numberOfMoons) {
            this.numberOfMoons = numberOfMoons;
        }
    }


    public static int getNumberOfMoons(PlanetName PlanetName) {

        switch (PlanetName) {
            case MERCURY:
                return PlanetName.MERCURY.numberOfMoons;
            case VENUS:
                return PlanetName.VENUS.numberOfMoons;
            case EARTH:
                return PlanetName.EARTH.numberOfMoons;
            case MARS:
                return PlanetName.MARS.numberOfMoons;
            case JUPITER:
                return PlanetName.JUPITER.numberOfMoons;
            case SATURN:
                return PlanetName.SATURN.numberOfMoons;
            case URANUS:
                return PlanetName.URANUS.numberOfMoons;
            case NEPTUNE:
                return PlanetName.NEPTUNE.numberOfMoons;
            default:
                return 0;
        }
    }

    public static int displayNumberOfMoons(String planetName) {

        for (PlanetName planet : PlanetName.values()) {
            if (planet.name().equalsIgnoreCase(planetName)) {
                int moons = getNumberOfMoons(planet);
                return moons;
            }
        }
        return 0;
    }
}

