package oop.interfaceUse;

public class InterfaceExample {
    public static void main(String[] args) {
        Bike bike = new Honda();
        bike.modelName();
        bike.speed();

        System.out.println("---------------");

        Honda honda = new Honda();
        honda.brake();
        honda.modelName();
        honda.speed();
    }
}

interface Bike{
    void speed();
    void modelName();
}

interface Auto{

}

class Honda implements Bike,Auto{//multiple interface is supported by java
    public void speed(){
        System.out.println("Speed: 80 km/h");
    }
    public void modelName(){
        System.out.println("Model: Honda Shine");
    }

    public void brake(){
        System.out.println("Disk Brake");
    }
}
