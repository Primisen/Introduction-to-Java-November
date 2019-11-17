package com.primisen.java_november.part1.main_task1;

//На плоскости даны два круга с общим центром и радиусами R1 и R2 (R1 > R2).
// Разработайте программу нахождения площади кольца, внешний радиус которого равен R1, а внутренний радиус равен R2.

public class Task3 {
    public static void main(String[] args) {

        double r1 = 5.1;
        double r2 = 4.1;

        System.out.println("Area of ring = " + getAreaOfRing(r1, r2));
    }

    public static double getAreaOfRing(double outsideRadius, double insideRadius){
        if(outsideRadius > insideRadius) {
            return Math.pow(outsideRadius, 2) - Math.pow(insideRadius, 2);
        } else{
            return -1;
        }
    }
}
