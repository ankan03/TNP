package staticKeyword;

public class StaticBlock {
    public static int k;
    static {
        k=5;
    }
    static {
        System.out.println("Static Block - 1");
    }
    public static void main(String[] args) {
        System.out.println("Static Block inside main");
        System.out.println("K = "+k);
    }
    static {
        System.out.println("Static Block - 2");
    }

}
