package com.primisen.java_november.part1.maint_task2;

/*
Напишите программу, которая бы определяла, является ли введённая буква (символ)
гласной (постарайтесь сделать минимум четырьмя способами, разрешается и больше).
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter character: ");
        char character = scanner.nextLine().charAt(0);
        System.out.println("Method 2: " + isVowelFour(character));
    }

    public static boolean isVowelOne(char vowel) {
        char[] vowels = {'а', 'е', 'ы', 'о', 'э', 'я', 'и', 'ю', 'у'};

        boolean isVowel = false;

        for (int i = 0; i < vowels.length; i++) {
            if (vowel == vowels[i]) {
                isVowel = true;
            }
        }

        return isVowel;
    }

    public static boolean isVowelTwo(char vowel) {

        String vowels = "уеыаоэяию";

        boolean isVowel = false;

        for (int i = 0; i < vowels.toCharArray().length; i++) {
            if (vowel == vowels.charAt(i)) {
                isVowel = true;
            }
        }

        return isVowel;
    }

    public static boolean isVowelThree(char vowel) {
        String[] vowels = {"а", "е", "ы", "о", "э", "я", "и", "ю", "у"};

        boolean isVowel = false;

        for (int i = 0; i < vowels.length; i++) {

            if (vowels[i].equals( String.valueOf(vowel))) {
                isVowel = true;
            }
        }

        return isVowel;
    }

    public static boolean isVowelFour(char vowel) {

        String vowels = "уеыаоэяию";

        boolean isVowel = false;

        for (int i = 0; i < vowels.length(); i++) {
            if (vowels.substring(i, i + 1).equals(String.valueOf(vowel))) {
                isVowel = true;
            }
        }
        return isVowel;
    }
}
