package collectionAndGenerics.ComparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyComparable {

    public static void main(String[] args) {
        List<LaptopComparable> laptopComparableList = new ArrayList<>();

        laptopComparableList.add(new LaptopComparable("HP",8,75000));
        laptopComparableList.add(new LaptopComparable("APPLE",16,175000));
        laptopComparableList.add(new LaptopComparable("LENOVO",8,65000));
        laptopComparableList.add(new LaptopComparable("MI",32,50000));

        Collections.sort(laptopComparableList);
        for (LaptopComparable l : laptopComparableList) {
            System.out.println(l);
        }
    }
}
