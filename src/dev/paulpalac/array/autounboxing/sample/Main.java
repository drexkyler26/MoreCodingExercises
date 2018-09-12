package dev.paulpalac.array.autounboxing.sample;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

/*  we wrapped the myIntClassArraylist inside class IntClass
    ArrayList<IntClass> myIntClassArraylist = new ArrayList<IntClass>();
    myIntClassArraylist.add(new IntClass(54));*/


/* class wrapper isnt needed when using autoboxing
class IntClass{
    private int MyValue;

    public IntClass(int myValue) {
        MyValue = myValue;
    }

    public int getMyValue() {
        return MyValue;
    }

    public void setMyValue(int myValue) {
        MyValue = myValue;
    }
}
*/
    //line 31-37 process of autoboxing
    Integer integer = new Integer(54);//long way
    Double myDoubleValue = new Double(53.2);//long way

    ArrayList<Integer> intArrayList = new ArrayList<Integer>();
    for(int i = 0; i <= 10; i++){
        intArrayList.add(Integer.valueOf(i));
    }
    //unboxing
    for(int i = 0; i <= 10; i++){
        System.out.println(i +" --> " +intArrayList.get(i).intValue());
    }


    Integer myIntValue = 23;//autobox short way bts Integer.valueOf(23);
        int myInt = myIntValue;//unbox short way bts myIntValue.intValue();
    }
}


