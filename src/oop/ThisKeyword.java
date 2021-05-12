package oop;

public class ThisKeyword {
    public static void main(String[] args) {
        A a  = new A(10);
        a.show();
    }
}

class A{
    int x;//instance variable
//    public A(int i){// local variable
//        x = i;// assigning value to the instance variable
    public A(int x){// local variable
//        x=x;//will not able to assign value to the instance variable
        this.x = x;// current instance
    }

    public void show(){
        System.out.println("x = "+x);
    }
}
