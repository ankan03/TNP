package oop.encapsulation;

public class MainMethod {
    public static void main(String[] args) {
        Sample1 sample1 = new Sample1();

        //we cannot access private variable/method outside the class where it has declared , it is called ENCAPSULATION
//        sample1.i = 12;
//        System.out.println(i);

        // For accessing private properties we need get/set method
        sample1.setI(12);
        System.out.println(sample1.getI());
    }
}
