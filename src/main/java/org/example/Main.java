package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int hour) {
        if(!isBarking) {
            return false;
        }
        if ((hour >= 20 && hour <= 23) || (hour >= 0 && hour < 8) ) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {

        if(firstAge >= 13 && firstAge <= 19 )
            return true;

        if(secondAge >= 13 && secondAge <= 19 )
            return true;


        if(thirdAge >= 13 && thirdAge <= 19 )
            return true;

        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if(!isSummer && (temp >=25 && temp <=35))
            return true;
        if(isSummer && (temp >=35 && temp <=45))
            return true;
        return false;
    }

    public static double area(double width, double height) {
        if(width < 0 || height  < 0 )
            return -1.0;
        return width * height;
    }

    public static double area(double radius) {
        if(radius < 0 )
            return -1.0;
        return radius * radius * Math.PI;
    }
}
