package com.primisen.java_november.part2;

import java.util.Random;
import java.util.Scanner;

/*
Необходимо написать программу «Heads or Tails?» («Орёл или решка?»),
которая бы «подбрасывала» условно монету, к примеру, 1000 раз и сообщала,
сколько раз выпал орёл, а сколько – решка.
 */
public class Task1 {
    public static void main(String[] args) {

        int flipNumber = getInt();

        int headsNumber = 0;
        int tailsNumber = 0;

        if(checkPositiveIntNumber(flipNumber)){
            headsNumber = getHeadsNumber(flipNumber);
            tailsNumber = getTailsNumber(flipNumber, headsNumber);
        }

        printHeadsOrNumber(headsNumber, tailsNumber);
    }

    public static int getHeadsNumber(int numberOfFlip) {

        //предпологается, что heads = 1, tails = 0
        int headsNumber = 0;

        int current = 0; //переименовать
        Random random = new Random();

        for (int i = 0; i < numberOfFlip; i++) {

            current = random.nextInt(2);
            if (current == 1) {
                headsNumber++;
            }
        }

        return headsNumber;
    }

    public static int getTailsNumber(int numberOfFlip, int numberOfHeads) {
        return numberOfFlip - numberOfHeads;
    }

    public static void printHeadsOrNumber(int heads, int tails) {
        System.out.println("Number of flip: " + (heads + tails));
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
    }

    public static int getInt() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number (int type): ");

        while (!scanner.hasNextInt()) {
            System.out.println("Incorrect input. Try again");
            scanner.next();
        }

        return scanner.nextInt();
    }

    public static boolean checkPositiveIntNumber(int number){

        boolean positiveIntNumber = true;

        if(number <= 0){
            positiveIntNumber = false;
        }

        return positiveIntNumber;
    }
}
