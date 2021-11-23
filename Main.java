package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[20];

        for(int i = 0; i < array.length; i++){
            array[i] = new Random().nextInt();
        }

        System.out.println(Arrays.toString(array));

        int sum = 0;
        for (int element : array)
            sum += element;
        System.out.println(sum);

        if( sum % 2 == 0) {
            System.out.println("четное");
        } else {
            System.out.println("нечетное");
        }
    }

}
