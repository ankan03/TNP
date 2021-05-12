package oop.abstractClass;

public class AbstractClassBasics {
    public static void main(String[] args) {
        Calculator2 calculator = new Calculator2();
        calculator.add();
        calculator.sub();
        calculator.mul();
        calculator.div();
    }
}

abstract class Calculator{
    public void add(){
        System.out.println("Adding");
    }
    abstract public void sub();
    abstract public void mul();
    abstract public void div();
}

abstract class Calculator1 extends Calculator{
    public void sub(){
        System.out.println("Substructing");
    }
}

class Calculator2 extends Calculator1{
    public void mul(){
        System.out.println("Multiplying");
    }

    public void div(){
        System.out.println("Dividing");
    }
}
