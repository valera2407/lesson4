package com.ALevel;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {2, 5, 4, 1, 10, 7};
        int leught = array.length;
       /* boolean j = true;
        while (j) {
            j = false;
            for (int i = 0; i < leught-1; i++) {
                int x = array[i];
                int y = array[i + 1];
                if (x > y) {
                    int z = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = z;
                    j = true;
                }
            }
        }String mass = Arrays.toString(array);
        System.out.println(mass);*/
        //пузрьковый метод
        for (int j = 0; j < leught; j++) {
            for (int i = 0; i < leught; i++) {
                if (array[j] < array[i]) {
                    int z = array[j];
                    array[j] = array[i];
                    array[i] = z;
                }
            }
        }String mass = Arrays.toString(array);
        System.out.println(mass);
        //сортировка выбора
    }
}
