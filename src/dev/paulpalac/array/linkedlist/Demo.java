package dev.paulpalac.array.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

    public static void main(String[] args) {

        LinkedList<String> vehicles = new LinkedList<String>();
        vehicles.add("Car");
        vehicles.add("Truck");
        vehicles.add("Train");
        vehicles.add("Bike");
        printList(vehicles);

        vehicles.add(1,"Bus");
        printList(vehicles);

        vehicles.remove("Bike");//or use index
        printList(vehicles);

        LinkedList<String> vehiclesOrder = new LinkedList<String>();

        addInOrder(vehiclesOrder, "Car");
        addInOrder(vehiclesOrder, "Truck");
        addInOrder(vehiclesOrder, "Train");
        addInOrder(vehiclesOrder, "Bike");
        printList(vehiclesOrder);

        addInOrder(vehiclesOrder, "Bus");
        addInOrder(vehiclesOrder, "Truck");
        printList(vehiclesOrder);

        vehicles.remove("Bike");//or use index
        printList(vehicles);

    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Vehicles: " +i.next());
        }
        System.out.println("end");
    }
    //better way of presenting data based on requirement e.g. alphabetical
    private static boolean addInOrder(LinkedList<String> linkedList, String newVehicle){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newVehicle);
            if(comparison == 0){
            //equal, do not add
                System.out.println(newVehicle +" is already in the list");
                return false;
            }else if(comparison > 0){
                //should first move THE POINTER to previous before add
                //e.g. newVehicle = airplane
                //airplane should be first before bike
                stringListIterator.previous();
                stringListIterator.add(newVehicle);
                return true;
            }else if(comparison < 0){
                //do nothing, move on to next
            }
        }
        stringListIterator.add(newVehicle);
        return true;
    }

}
