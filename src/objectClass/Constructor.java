package objectClass;

public class Constructor {
    public static void main(String[] args) {
        myConstructorClass obj = new myConstructorClass();

        Add add = new Add();
        Add add1 = new Add(1);
        Add add2 = new Add(1,2);
        Add add3 = new Add(1,2,3);
    }
}

//  default constructor
class myConstructorClass{
    public myConstructorClass(){
        System.out.println("Inside default  constructor");
    }
}

//  parameterize constructor

class Add{
    public Add(){
        System.out.println("Inside 'Add' class default constructor ");
    }

    public Add(int x){
        System.out.println("Addition Result = "+x);
    }

    public Add(int x, int y){
        System.out.println("Addition Result = "+(x+y));
    }

    public Add(int x, int y, int z){
        System.out.println("Addition Result = "+(x+y+z));
    }
}
