package com.yearup.week2.homework;

import java.util.Scanner;

public class SolarSystemPlanet extends Planet {
    private String STAR = "SUN";

    public SolarSystemPlanet(String name, double radius, String star) {
        super(name, radius, star);
    }

    @Override
    public String plantStar() {
        System.out.println("The planet's star is the " + STAR);
        return STAR;
    }

    public int planetPosition(String planetName) {

        switch (planetName.toUpperCase()){
            case "MERCURY": return 1;
            case "VENUS": return 2;
            case "EARTH": return 3;
            case "MARS": return 4;
            case "JUPITER": return 5;
            case "SATURN": return 6;
            case "URANUS": return 7;
            case "NEPTUNE": return 8;
            default: return 0;
        }
    }
}
