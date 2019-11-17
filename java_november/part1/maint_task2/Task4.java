package com.primisen.java_november.part1.maint_task2;

/*
Заданы три целых числа, которые задают некоторую дату по Грегорианскому календарю
(https://ru.wikipedia.org/wiki/Григорианский_календарь). Определить дату следующего дня. Запрещается использовать
типы стандартной библиотеки языка для работы с датой и временем. Также необходимо учесть то, что по григорианскому
календарю (используется в настоящий момент) високосный год определяется следующим образом:
 годы, кратные 4 – високосные (например, 2008, 2012, 2016);
 годы, кратные 4 и 100 – невисокосные (например, 1700, 1800, 1900);
 годы, кратные 4, 100 и 400 – високосные (например, 1600, 2000, 2400).
 */

public class Task4 {
    public static void main(String[] args) {

        int day = 30;
        int month = 9;
        int year = 2017;

        int[] nextDay = getNextDay(day, month, year);
        System.out.println("Day: " + nextDay[0]);
        System.out.println("Month: " + nextDay[1]);
        System.out.println("Year: " + nextDay[2]);
    }

    public static int[] getNextDay(int day, int month, int year) {

        if (day == 28) {
            if (month == 2) {
                if (isLeapYear(year)) {
                    day += 1;
                } else {
                    day = 1;
                    month = 3;
                }
            } else {
                day += 1;
            }
        } else if (day == 29) {
            if (month == 2 && isLeapYear(year)) {
                day = 1;
                month = 3;
            } else {
                day += 1;
            }
        } else if (day == 30) {
            if (is30DayMonth(month)) {
                day = 1;
                month += 1;
            } else {
                day += 1;
            }
        } else if (day == 31) {
            day = 1;

            if (month == 12) {
                month = 1;
                year += 1;
            } else {
                month += 1;
            }
        }

        return new int[]{day, month, year};
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static boolean is30DayMonth(int month) {

        if (month == 4 || month == 6 || month == 9 || month == 11){
            return true;
        }

        return false;
    }
}
