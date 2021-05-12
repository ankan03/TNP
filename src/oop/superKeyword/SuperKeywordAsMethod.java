package oop.superKeyword;

public class SuperKeywordAsMethod {
    public static void main(String[] args) {
        B b = new B();
        B b1 = new B(1);
    }
}

class A{
    public A(){
        System.out.println("In default constructor A");
    }

    public A(int i){
        System.out.println("In parameterize constructor A");
    }
}

class B extends A{
    public B(){
//        super();//By default when object is created then it calls default constructor of the parent class(means "super()" method is called by default .No need to mention it explicitly)
        super(1);//If we want to call constructor other than default constructor then we have to pass parameter accordingly
        System.out.println("In default constructor B");
    }

    public B(int i){
//        super();//By default when object is created then it calls default constructor of the parent class(means "super()" method is called by default .No need to mention it explicitly)
        super(1);//If we want to call constructor other than default constructor then we have to pass parameter accordingly
        System.out.println("In parameterize constructor B");
    }
}
