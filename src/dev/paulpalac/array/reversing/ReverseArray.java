package dev.paulpalac.array.reversing;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    private static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = getInteger(8);
        printArray(array);
        printArray(reverseArray(array));
        printArray(array);
/*        printArray(reverseArray(array));
        printArray(array);*/
    }

    private static int[] reverseArray(int[] array) {
        int[] reverse = new int[array.length];
        for(int i = 0; i < array.length; i++){
            reverse[array.length-1-i] = array[i];
        }
        return reverse;
/*
            int[] reverse = array;
            int maxIndex = reverse.length -1;
            int halfLength = reverse.length/2;
            for(int i = 0; i < halfLength; i++){
                int temp = reverse[i];
                reverse[i] = reverse[maxIndex - i];
                reverse[maxIndex - i] = temp;
            }
            return reverse;
*/
    }

    private static int[] getInteger(int number) {
        System.out.println("Enter " +number +" integers");
        int[] array = new int[number];
        for(int i =0; i < number; i++){
            int values = scanner.nextInt();
            scanner.nextLine();
            array[i] = values;
        }
        return array;
    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

}

