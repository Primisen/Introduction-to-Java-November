package com.primisen.java_november.part1.maint_task2;

/*
На прямоугольной декартовой системе координат на плоскости заданы три точки с соответствующими координатами в виде
пары значений (x,y). Определить, являются ли данные точки вершинами треугольника. И если да, то дополнительно
определить, является ли данный треугольник прямоугольным.
 */

public class Task1 {

    public static void main(String[] args) {

        double x1, x2, x3, y1, y2, y3;

        x1 = 1;
        y1 = 1;

        x2 = 5;
        y2 = 1;

        x3 = 5;
        y3 = 5;

        if (isTriangle(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points make a triangle");

            double firstSide = getSide(x1, y1, x2, y2);
            double secondSide = getSide(x2, y2, x3, y3);
            double thirdSide = getSide(x3, y3, x1, y1);


            if (isRectangular(firstSide, secondSide, thirdSide)) {
                System.out.println("Triangle is rectangular.");

            } else {
                System.out.println("Triangle is not rectangular");
            }

        } else {
            System.out.println("Not a triangle! ");
        }
    }

    public static boolean isTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        if ((y1 - y2) / (y3 - y2) == (x1 - x2) / (x3 - x2)) {
            return false;

        } else if (x1 == x2 && x2 == x3) { //выходит вертикальная прямая, где х1 = х2 = х3
            return false;

        } else if (y1 == y2 && y2 == y3) { //горизонтальная прямая, где y1 = y2 = y3
            return false;

        } else {
            return true;
        }
    }

    public static double getSide(double x1, double y1, double x2, double y2) {

        double x = Math.abs(x1 - x2);
        double y = Math.abs(y1 - y2);

        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static boolean isRectangular(double firstSide, double secondSide, double thirdSide) {

        if (checkPythagoreanTheorem(firstSide, secondSide, thirdSide)) {
            return true;

        } else if (checkPythagoreanTheorem(firstSide, thirdSide, secondSide)) {
            return true;

        } else if (checkPythagoreanTheorem(thirdSide, secondSide, firstSide)) {
            return true;

        } else {
            return false;
        }
    }

    public static boolean checkPythagoreanTheorem(double firstCathet, double secondCathet, double hypotenuse) {

        if (Math.sqrt(Math.pow(firstCathet, 2) + Math.pow(secondCathet, 2)) == hypotenuse) {
            return true;
        } else {
            return false;
        }
    }
}
