package dev.paulpalac.array.sortinteger;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*    int[] myInteger = getInteger(5);
    printArray(sortDescending(myInteger));
    printArray(sortAscending(myInteger));*/
        System.out.println(findMin(getInteger(5)));
    }

    private static int[] getInteger(int number) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[number];
        System.out.println("Enter " +number +" integer values:");
        for(int i = 0; i < number; i++){
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }
    private static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " +i +" contains " +array[i]);
        }
    }

    private static int[] sortDescending(int[] array){
        int[] sortedArray = new int[array.length];{
            for(int i = 0; i < array.length; i++){
            sortedArray[i] = array[i];
            }
            boolean flag = true;
            while(flag){
                flag = false;
                for(int i = 0; i < sortedArray.length-1; i++){
                    if(sortedArray[i] < sortedArray[i+1]){
                        int temp = sortedArray[i];
                        sortedArray[i] = sortedArray[i+1];
                        sortedArray[i+1] = temp;
                        flag = true;
                    }
                }
            }
        }return sortedArray;
    }

    private static int[] sortAscending(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length-1; i++){
                if(sortedArray[i] > sortedArray[i+1]){
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }return sortedArray;
    }

    private static int findMin(int[] array) {
/*        int[] minArray = Arrays.copyOf(array, array.length);
        int minimum = minArray[0];
        for(int i = 0; i < array.length; i++){
            if(minArray[i] < minimum){
                minimum = minArray[i];
            }
        }
        return minimum;*/
        int minimum = Integer.MAX_VALUE;
        for(int i =0; i < array.length; i++){
            int value = array[i];
            if(value < minimum){
                minimum = value;
            }
        }
        return minimum;
    }
}
