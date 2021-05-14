package collectionAndGenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {

        //array for particuler datatype(Fixed size)
//        int a[] = new int[5];
//        a[0] = 1;
//        a[1] = 2;
//        a[2] = 3;
//
//        for (int k : a) {
//            System.out.println(k);
//        }
//        a[1] = "aa";//error



        //array for any datatype (Fixed size)
        Object obj[] = new Object[10];
        obj[0] = "Ankan";
        obj[1] = 1;
        obj[2] = 1.2;
        obj[3] = 2.1f;
        obj[4] = 'A';
        obj[5] = "Mukherjee";
        for (Object o : obj) {
            System.out.println(o);
        }


        System.out.println("--------------------------");

//        We can add any datatype without specifying it | We can also use Object datatype for it(Dynamic size)
//        Collection collection = new ArrayList();
        Collection<Object> collection = new ArrayList<>();
        collection.add("Ankan");
        collection.add(1);
        collection.add(1.1);
        collection.add(1.2f);

        //iteration with foreach loop
//        for (Object o : collection) {
//            System.out.println(o);
//        }

        //We can iterate in this way also
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //We cannot iterate through index
//        for (int i = 0; i < collection.size(); i++) {
//            System.out.println(collection[i]);
//        }


        System.out.println("--------------------------");
        //Integer collection (We cannot add any other type)
        Collection<Integer> integerCollection = new ArrayList<>();
        integerCollection.add(1);
        integerCollection.add(2);
        integerCollection.add(3);
        integerCollection.add(4);
//        integerCollection.add("aa");//Will not work because it is a integer collection
        for (int i : integerCollection) {
            System.out.println(i);
        }
    }
}
