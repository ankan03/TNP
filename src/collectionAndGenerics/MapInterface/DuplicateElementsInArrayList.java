package collectionAndGenerics.MapInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementsInArrayList {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Ankan");
        stringList.add("Abhishek");
        stringList.add("Anubhav");
        stringList.add("Ankan");
        stringList.add("Anubhav");


        Set<String> stringSet = new HashSet<>();
        for (String s : stringList) {
            if (stringSet.add(s) == false)//if we try to add previously added value in Set it will return false
                System.out.println(s);
        }

    }
}
