package objectCloning;

public class CloneCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        b.i = 5;
        b.j = 6;

        B b1 = (B) b.clone();

        b1.j = 7;//In Clone copy we are creating 2 object instead of 2 reference of the same object
        // Here advantage is if we don't want to modify copied values they will be same as previous value(from where it was copied)
        // But  if we change any value it will be reflected on the particular REFERENCE not in both

        System.out.println("b = "+b);
        System.out.println("b1 = "+b1);
    }
}


