package staticKeyword;

public class CountNumberOfObjectsOfClass {
    public static void main(String[] args) {
        myClass obj1 = new myClass();
        myClass obj2 = new myClass();
        myClass obj3 = new myClass();
        myClass obj4 = new myClass();
        System.out.println("count = "+myClass.i);
    }
}

class myClass{
    public static int i = 0;
    public myClass(){
        i++;
    }
}
