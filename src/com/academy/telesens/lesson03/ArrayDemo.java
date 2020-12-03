package com.academy.telesens.lesson03;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[5];
        numbers[2] = random.nextInt(100);
        System.out.println("Origin array");
        System.out.println(Arrays.toString(numbers));

        // Вывести массив на консоль в обратном порядке
        System.out.println("Reversed");


        // 2
        double[] doubleNumbers = new double[30];
        doubleNumbers[0] = random.nextDouble(); // от [0.0 до 1.0)
        // * от 0.0 до 10.0

        // ** от 10.00 до 100.00
    }
}
