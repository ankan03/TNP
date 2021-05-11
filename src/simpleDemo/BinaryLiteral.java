package simpleDemo;

public class BinaryLiteral {
    public static void main(String[] args) {
        int i = 5;
        int j = 0B101;//Binary conbersion using 0B or 0b
        int k = 0B100_00_00;//We can differentiate 0's using "_"
        int l = 0b111;
        System.out.println("i = "+i);
        System.out.println("j = "+j);
        System.out.println("k = "+k);
        System.out.println("l = "+l);
    }
}
