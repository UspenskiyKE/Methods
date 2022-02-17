package com.company;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    //Задача 1
    public static void testLeapYear(int year) {
        if (year % 4 != 0) {
            System.out.println(year + " - не високосный год.");
        } else if (year % 100 != 0) {
            System.out.println(year + " - високосный год.");
        } else if (year % 400 == 0) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }

    }

    //Задача 2
    public static void offerOsVersion(int kindOfOs, int yearOfRelease) {
        int currentYear = LocalDate.now().getYear();
        String s = "";
        String t = "";
        if (yearOfRelease < currentYear) {
            t = " облегчённую ";
        }
        if (kindOfOs == 0) {
            s = " iOS ";
        }
        if (kindOfOs == 1) {
            s = " Android ";
        }
        System.out.println("Установите " + t + " версию приложения для " + s);
    }

    //Задача 3
    public static int calculateNumberOfDays(int deliveryDistance) {

        int deliveryDays = 0;
        if (deliveryDistance <= 20) {
            deliveryDays++;
        }
        if (deliveryDistance >= 21 && deliveryDistance <= 60) {
            deliveryDays += 2;
        }
        if (deliveryDistance >= 61 && deliveryDistance <= 100) {
            deliveryDays += 3;
        }
        return deliveryDays;
    }

    //Задача 4
    public static void testFirstDuplicate(String sortedString) {
        int number = -1;
        for (int i = 0; i < sortedString.length() - 1; i++) {
            if (sortedString.charAt(i) == sortedString.charAt(i + 1)) {
                number = i;
                break;
            }
        }
        if (number != -1) {
            System.out.println("Найдено вхождение дубля в позиции " + number);
        } else {
            System.out.println("Дубли не найдены.");
        }
    }

    //Задача 5
    public static void invertMassive(int[] massive) {
        int invert;
        int buf;

        System.out.println(Arrays.toString(massive));
        for (int i = 0; i < massive.length; i++) {
            invert = massive.length - 1 - i;
            if (invert >= i) {
                buf = massive[i];
                massive[i] = massive[i] * massive[invert] / massive[i];
                massive[invert] = buf;
            }
        }
        System.out.println(Arrays.toString(massive));

    }


    public static void main(String[] args) {
        // write your code here
        //Задача 1 вызов метода
        testLeapYear(2022);

        //Задача 2 вызов метода
        offerOsVersion(1, 2022);

        //Задача 3 вызов метода
        String s = "Потребуется дней: " + calculateNumberOfDays(95);
        System.out.println(s);

        //Задача 4 вызов метода
        testFirstDuplicate("abc");

        //Задача 5 вызов метода
        int[] m1 = {3, 2, 1, 6, 5};
        invertMassive(m1);
    }
}
