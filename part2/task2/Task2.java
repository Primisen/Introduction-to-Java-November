package com.primisen.java_november.part2.task2;

/*
Разработать наиболее эффективные алгоритмы и написать код для решения
следующих задач:
1. найти наибольшую цифру натурального числа;
2. проверить, является ли заданное натуральное число палиндромом;
3. определить является ли заданное натуральное число простым;
4. найти все простые делители заданного натурального числа;
5. найти НОД и НОК двух натуральных чисел a и b.
6. найти количество различных цифр у заданного натурального числа.
 */

public class Task2 {
    public static void main(String[] args) {

        System.out.println("Answer of task 1: " + getMaxNaturalDigitInNumber(876594));
        System.out.println("Answer of task 2: ");
        System.out.println("Answer of task 3: " + checkSimpleNumber(54));

        System.out.println("Answer of task 4: ");
        getAllSimpleDividers(65);
        System.out.println();

        System.out.println("Answer of task 5: ");
        printNod(9, 18);
        printNok(9, 18);
    }

    //task1
    //найти наибольшую цифру натурального числа;
    public static int getMaxNaturalDigitInNumber(int number) {

        int maxDigit = number % 10;
        number /= 10;

        while (number > 0) {

            int currentDigit = number % 10;

            if (maxDigit < currentDigit) {
                maxDigit = currentDigit;
            }

            number /= 10;
        }
        return maxDigit;
    }

    //task2
    //проверить, является ли заданное натуральное число палиндромом;
    public static boolean checkPalindrome(int number) {

        boolean palindrome = true;



        return palindrome;
    }

    public static int reverseNumber(int number){
        int nweNumber
    }

    //task3
    //определить является ли заданное натуральное число простым;
    public static boolean checkSimpleNumber(int number) {

        boolean simpleNumber = true;

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                simpleNumber = false;
            }
        }

        return simpleNumber;
    }

    //task4
    //найти все простые делители заданного натурального числа;
    public static void getAllSimpleDividers(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (checkSimpleNumber(i)) {
                    printSimpleDivider(i);
                }
            }
        }
    }

    public static void printSimpleDivider(int simpleNumber) {
        System.out.println("    The simple divider: " + simpleNumber); //табуляция использовона для более красивого вывода
    }

    //task5
    //найти НОД и НОК двух натуральных чисел a и b.
    public static int getNod(int firstNumber, int secondNumber) {

        int buf;

        while (firstNumber % secondNumber != 0) {
            buf = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = buf;
        }
        return secondNumber;
    }

    public static void printNod(int firstNumber, int secondNumber){
        System.out.println("Nod " + firstNumber + " and " + secondNumber + " is " + getNod(firstNumber, secondNumber));
    }

    public static int getNok(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber / getNod(firstNumber, secondNumber);
    }

    public static void printNok(int firstNumber, int secondNumber){
        System.out.println("Nok " + firstNumber + " and " + secondNumber + " is " + getNok(firstNumber, secondNumber));
    }
}
