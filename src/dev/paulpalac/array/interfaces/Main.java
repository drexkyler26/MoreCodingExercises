package dev.paulpalac.array.interfaces;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player paul = new Player("Paul", 100, 50);
        System.out.println(paul.toString());
        savedObject(paul);

        paul.setHitPoint(77);
        System.out.println(paul);
        paul.setWeapon("Arbalest");
        savedObject(paul);
        System.out.println(paul);
        loadObject(paul);
        System.out.println(paul);

    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;

        System.out.println("Choose\n" +
                "\t0 to quit\n" +
                "\t1 to Enter a string");

        while(!quit){
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void savedObject(ISave objectToSave){
        for(int i = 0; i < objectToSave.write().size(); i++){
            System.out.println("Saving " +objectToSave.write().get(i) +" to memory device");
        }
    }

    public static void loadObject(ISave objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
 }
