package BidimensionalLists;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BidimensionalList {
    public static void main(String[] args) {
        int a;
        int b;
        int positionX;
        int positionY;
        int searchValue = 6;
        int[][] myBidimensionalList = {{1, 2, 3}, {4, 6, 2}, {6, 8, 3}};
        int[] mySimpleList = {1, 2, 3, 4};
        String[] myList = {"BMW", "Mercedes", "Audi"};
        System.out.println(myList);
        ArrayList cars = new ArrayList();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Audi");
        System.out.println(cars.listIterator());

        String car = "Dacia";
        String car2 = "Daewoo";
        String car3 = "Dacia";
        boolean memoryAllocationChecker = false;
        System.out.println("String car=" + car + " and it's localization on the heap memory is: " + Integer.toHexString(System.identityHashCode(car)));
        System.out.println("String car2=" + car2 + " and it's localization on the heap memory is: " + Integer.toHexString(System.identityHashCode(car2)));
        System.out.println("String car3=" + car3 + " and it's localization on the heap memory is " + Integer.toHexString(System.identityHashCode(car3)));
        if ((Integer.toHexString(System.identityHashCode(car))).equals(Integer.toHexString(System.identityHashCode(car3)))) {
            System.out.println("The two compared Strings have the same heap memory place allocated wich is: " + Integer.toHexString(System.identityHashCode(car)));
            memoryAllocationChecker = true;
        }
        if (memoryAllocationChecker == true) {
            System.out.println("It's true!");
        } else {
            System.out.println("It's false!");
        }


    }
}

