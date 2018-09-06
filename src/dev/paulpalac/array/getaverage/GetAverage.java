package dev.paulpalac.array.getaverage;

import java.util.Scanner;

public class GetAverage {

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (double)sum/(double)array.length;
    }

    public static int[] getIntegers(int number) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter " +number +" integer values.\r");
        int[] values = new int[number];
        for(int i = 0; i < values.length; i++){
            values[i] = scan.nextInt();
        }
        return values;
    }

}

class Main{
    public static void main(String[] args) {
        System.out.println("Enter the number of elements.");
        Scanner scan = new Scanner(System.in);
        int number =scan.nextInt();
        int[] myIntegers = GetAverage.getIntegers(number);
        for(int i =0; i < myIntegers.length; i++){
            System.out.println("Element " +i +", typed value was " +myIntegers[i]);
        }
        System.out.println("The average is " +GetAverage.getAverage(myIntegers));

    }
}