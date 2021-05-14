package collectionAndGenerics.ComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(167);
        integerList.add(231);
        integerList.add(139);
        integerList.add(425);

        System.out.println("ArrayList is: ");
        for (int i : integerList) {
            System.out.print(i+"\t");
        }

        //This will sort the whole value
//        Collections.sort(integerList);
//        System.out.println("\nAfter sorting ArrayList is: ");
//        for (int i : integerList) {
//            System.out.print(i+"\t");
//        }



        //We can customize the process of sort(Eg. We can sort numbers according to the last digit)
        //approach-1
//        Comparator comparator = new ComparatorImplementation();
//        Collections.sort(integerList,comparator);
//        System.out.println("\nAfter sorting ArrayList is: ");
//        for (int i : integerList) {
//            System.out.print(i+"\t");
//        }


        //approach-2
//        Comparator comparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if (o1%10>o2%10)
//                    return 1;
//                return -1;
//            }
//        };
//        Collections.sort(integerList,comparator);
//        System.out.println("\nAfter sorting ArrayList is: ");
//        for (int i : integerList) {
//            System.out.print(i+"\t");
//        }

        //approach-3
//        Comparator<Integer> comparator = (o1,o2)->{
//                if (o1%10>o2%10)
//                    return 1;
//                return -1;
//
//        };
//        Collections.sort(integerList,comparator);
//        System.out.println("\nAfter sorting ArrayList is: ");
//        for (int i : integerList) {
//            System.out.print(i+"\t");
//        }

        //approach-4
//        Comparator<Integer> comparator = (o1,o2)->{
//            return o1%10>o2%10?1:-1;
//        };
//        Collections.sort(integerList,comparator);
//        System.out.println("\nAfter sorting ArrayList is: ");
//        for (int i : integerList) {
//            System.out.print(i+"\t");
//        }

        //approach-5
        Collections.sort(integerList,(o1,o2)->{
            return o1%10>o2%10?1:-1;
        });
        System.out.println("\nAfter sorting ArrayList is: ");
        for (int i : integerList) {
            System.out.print(i+"\t");
        }
    }
}
