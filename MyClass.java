package com.company;

import java.util.Random;


public class MyClass {

    public static void main(String[] args) {
        int[][][] table = new int[3][3][];
        int[][] tableNumber = {{1,2,3,4},{5,6,7,8}};


        Random randomNumber = new Random();
        int[] array = new int[20];

        System.out.println("Сумма всех элементов (до изменения): " + sumOfArrayElements(array));
        for (int counter = 0; counter < array.length; counter++){
            array[counter] = randomNumber.nextInt(100);
        }
        System.out.println("Изначальный массив:");

        for (int counter = 0; counter < array.length; counter++){
            System.out.print(array[counter] + ", ");
        }

        System.out.println();
        System.out.println("Сумма всех элементов: " + sumOfArrayElements(array));
        System.out.println("Наименьшее значение элемента в массиве: " + minimumOfArray(array));
        System.out.println("Наибольшее значение элемента в массиве: " + maximumOfArray(array));
        System.out.println("Массив после сортировки: ");
        int[] newArray = Utils.bubbleSortArray(array);

        for (int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + ", ");
        }

    }

    private static int sumOfArrayElements(int[] arrayInMethod){
        int summa = 0;

        for (int i = 0; i < arrayInMethod.length; i++){
            summa += arrayInMethod[i]; // summa += ... -> summa = summa + ...
        }

        return summa;
    }

    private static int minimumOfArray(int[] array){
        int minimum = array[0];

        for (int i = 0; i < array.length-1; i++){
            if (array[i] < minimum){
                minimum = array[i];
            }
        }

        return minimum;
    }

    private static int maximumOfArray(int[] array){
        int maximum = 0;

        for (int i = 0; i < array.length-1; i++){
            if (array[i] > maximum){
                maximum = array[i];
            }
        }

        return  maximum;
    }
}
