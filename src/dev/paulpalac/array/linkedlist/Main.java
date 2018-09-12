package dev.paulpalac.array.linkedlist;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    Customer customer = new Customer("Tim", 23123);
    Customer anotherCustomer;
    anotherCustomer = customer;
    //this method points to the same memory location
    anotherCustomer.setBalance(11111);
        System.out.println("Customer: " +customer.getName() +"Balance: " +customer.getBalance());

    // in this process arraylist moves all the memory location to insert
        // new memory w/c is inefficient for big data
    ArrayList<Integer> intList = new ArrayList<Integer>();

    intList.add(1);
    intList.add(3);
    intList.add(4);

    for(int i = 0; i < intList.size(); i++){
        System.out.println(i +": " +intList.get(i));
    }

    intList.add(1,2);

    for(int i = 0; i < intList.size(); i++){
        System.out.println(i +": " +intList.get(i));
    }

    }
}
