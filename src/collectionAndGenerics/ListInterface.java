package collectionAndGenerics;

import java.util.*;

public class ListInterface {
    public static void main(String[] args) {

        System.out.println("****************COLLECTION****************");

        Collection<Integer> integerCollection = new ArrayList<>();
        integerCollection.add(1);
        integerCollection.add(4);
        integerCollection.add(3);
//        integerCollection.add(2,9);//Doesn't Support in Collection
//        Collections.sort(integerCollection);//Doesn't Support in Collection

        //Display method
        System.out.println("Display using Iterator");
        Iterator iterator = integerCollection.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println("Display using For each");
        for (int i : integerCollection) {
            System.out.println(i);
        }

        System.out.println("*******************LIST*******************");
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(4);
        integerList.add(3);
        integerList.add(2,9);//Support in list


        //Display method
        System.out.println("Display using Iterator");
        Iterator iterator1 = integerList.iterator();
        while (iterator1.hasNext())
            System.out.println(iterator1.next());

        integerList.add(3,7);
        System.out.println("Display using For each(After adding 7 in 3rd index)");
        for (int i : integerList) {
            System.out.println(i);
        }

        Collections.sort(integerList);//Support in list
        System.out.println("Display using index(After sorting)");
        //From index
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }


        System.out.println("Display using Stream API");
        //Stream API
        integerList.forEach(System.out::println);

    }
}
