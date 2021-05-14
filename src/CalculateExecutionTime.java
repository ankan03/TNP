import java.util.ArrayList;

public class CalculateExecutionTime {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println("Time spend from 1st jan 1970(in milliseconds): "+start);
        System.out.println("Years: "+((((start/1000)/3600)/24)/365));

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken: "+(end-start));
    }
}
