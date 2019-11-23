package com.primisen.java_november.part2.task3;

/*
Натуральное число называют совершенным, если оно равно сумме всех своих
делителей, не считая только его самого (например, 28=1+2+3+7+14 –
совершенное число). Напишите программу, которая проверяет, является ли
введённое натуральное число совершенным. Для проверки работоспособности
программы приводится список некоторых совершенных чисел: 6, 28, 496, 8128.
 */
public class Task3 {
    public static void main(String[] args) {

        int number = 496;

        if (checkPerfectNumber(number)) {
            printPositiveResult();
        } else {
            printNegativeResult();
        }
    }

    public static int getSumOfDividers(int number){

        int divider = 1;
        int sumOdDividers = 0;

        for (int i = 1; i < number; i++) {

            if(number % i == 0){
                sumOdDividers += i;
            }
        }
        return sumOdDividers;
    }

    public static boolean checkPerfectNumber(int number){
        return number == getSumOfDividers(number);
    }

    public static void printPositiveResult(){
        System.out.println("The number a perfect.");
    }

    public static void printNegativeResult(){
        System.out.println("The number not perfect.");
    }
}
