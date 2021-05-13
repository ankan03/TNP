package objectCloning;

public class DeepCopy {
    public static void main(String[] args) {
        A a = new A();
        a.i = 5;
        a.j = 6;

        A a1 = new A();

        a1.j = 3;
        a1.j = 7;//In deep copy we are creating 2 object instead of 2 reference of the same object
        // that's why if we change any value it will be reflected on the particular REFERENCE not in both
        // It is good but we have to copy each value manually which is boring

        System.out.println("a = "+a);
        System.out.println("a1 = "+a1);
    }
}

