package com.primisen.java_november.part1.main_task1;

//Масса динозавра задаётся в килограммах. Разработайте программу, которая вычисляет, сколько это миллиграмм, грамм и тонн.

public class Task2 {
    public static void main(String[] args) {

        double massOfDinosaur = 400;

        System.out.println("mass of dinosaur in milligrams = " + getMilligramFromKilogram(massOfDinosaur));
        System.out.println("mass of dinosaur in grams = " + getGramFromKilogram(massOfDinosaur));
        System.out.println("mass of dinosaur in tons = " + getTonFromKilogram(massOfDinosaur));

    }

    public static double getMilligramFromKilogram(double kilogram){
        return kilogram * 10000;
    }

    public static double getGramFromKilogram(double kilogram){
        return kilogram * 1000;
    }

    public static double getTonFromKilogram(double kilogram){
        return kilogram / 1000;
    }
}
