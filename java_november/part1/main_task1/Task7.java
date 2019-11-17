package com.primisen.java_november.part1.main_task1;

// Разработайте небольшую цельную программу, которая меняет местами содержимое двух целочисленных переменных a и b, не используя для этого дополнительных переменных.

public class Task7 {

    public static void main(String[] args) {

        int firstNumber = 50;
        int secondNumber = 82;

        //(firstNumber^secondNumber)^firstNumber) = secondNumber;

        firstNumber = firstNumber^secondNumber;
        secondNumber = firstNumber^secondNumber;
        firstNumber = firstNumber^secondNumber;

        System.out.println("Reversed: " + firstNumber + ", " + secondNumber);
    }
}
