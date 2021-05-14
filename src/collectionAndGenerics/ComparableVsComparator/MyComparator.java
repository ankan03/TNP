package collectionAndGenerics.ComparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparator {
    public static void main(String[] args) {
        List<LaptopComparator> laptopComparatorList = new ArrayList<>();

        laptopComparatorList.add(new LaptopComparator("HP",8,75000));
        laptopComparatorList.add(new LaptopComparator("APPLE",16,175000));
        laptopComparatorList.add(new LaptopComparator("LENOVO",8,65000));
        laptopComparatorList.add(new LaptopComparator("MI",32,50000));

        System.out.println("\nSort by Ram");
        Comparator<LaptopComparator> comparator = new Comparator<LaptopComparator>() {
            @Override
            public int compare(LaptopComparator o1, LaptopComparator o2) {
                return o1.getRam()>o2.getRam()?1:-1;
            }
        };
        Collections.sort(laptopComparatorList,comparator);
        for (LaptopComparator l : laptopComparatorList) {
            System.out.println(l);
        }

        System.out.println("\nSort by Price");
        Comparator<LaptopComparator> comparator1 = new Comparator<LaptopComparator>() {
            @Override
            public int compare(LaptopComparator o1, LaptopComparator o2) {
                return o1.getPrice()>o2.getPrice()?1:-1;
            }
        };
        Collections.sort(laptopComparatorList,comparator1);
        for (LaptopComparator l : laptopComparatorList) {
            System.out.println(l);
        }
    }
}
