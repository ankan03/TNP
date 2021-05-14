package collectionAndGenerics;

import java.util.ArrayList;
import java.util.Vector;

public class VectorVsArrayList {
    public static void main(String[] args) {

        //capacity of Vector is increased by 100%(Initially it is 10, If 11 value is inserted in the vector it automatically increased to 20 )
        //Thread safe
        //Slow than Arraylist
        System.out.println("\nVECTOR");
        Vector<Integer> integerVector = new Vector<>();
        integerVector.capacity();
        System.out.println("Capacity1: "+ integerVector.capacity());
        integerVector.add(1);
        integerVector.add(2);
        integerVector.add(3);
        integerVector.add(4);
        integerVector.add(5);
        integerVector.add(6);
        integerVector.add(7);
        integerVector.add(8);
        integerVector.add(9);
        System.out.println("Capacity2: "+ integerVector.capacity());
        integerVector.add(10);
        integerVector.add(11);
        System.out.println("Capacity3: "+ integerVector.capacity());
        integerVector.add(12);
        System.out.println("Capacity4: "+ integerVector.capacity());

        System.out.println("Vector is: ");
        for (int i : integerVector) {
            System.out.print(i+"\t");
        }


        //capacity of Vector is increased by 50%
        //Not Thread safe
        //Faster than vector
        System.out.println("\n\nARRAYLIST");
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        System.out.println("Size1: "+integerArrayList.size());
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        System.out.println("Size2: "+integerArrayList.size());

        System.out.println("ArrayList is: ");
        for (int i : integerArrayList) {
            System.out.print(i+"\t");
        }
    }
}
