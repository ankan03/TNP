package collectionAndGenerics;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
    public static void main(String[] args) {

        System.out.println("\nUsing HashSet");
        //It prints only unique values but the values are NOT in sequence
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(12);
        integerSet.add(23);
        integerSet.add(13);
        integerSet.add(42);

        integerSet.add(12);
        integerSet.add(23);
        integerSet.add(13);
        integerSet.add(42);
        for (int i : integerSet) {
            System.out.println(i);
        }



        System.out.println("\nUsing TreeSet");
        //It prints only unique values and the values are in ascending order
        Set<Integer> integerSet1 = new TreeSet<>();
        integerSet1.add(12);
        integerSet1.add(23);
        integerSet1.add(13);
        integerSet1.add(42);

        integerSet1.add(12);
        integerSet1.add(23);
        integerSet1.add(13);
        integerSet1.add(42);
        for (int i : integerSet1) {
            System.out.println(i);
        }
    }
}
