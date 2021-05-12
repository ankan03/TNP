package oop.interfaceUse;

public class FunctionalInterface {
    public static void main(String[] args) {

        //Normal interface
        Bike bike = new Bike() {
            public void speed(){
                System.out.println("Speed: 60 km/h");
            }
            public void modelName(){
                System.out.println("Model: Bajaj Discover");
            }
        };

        bike.speed();
        bike.modelName();
        System.out.println();


        // Functional interface | LAMBDA function (applied for interfaces having only one function)
        Car car = new Car() {
            public void modelName() {
                System.out.println("Model: Scorpio ");
            }
        };
        car.modelName();
        System.out.println();

        Car car1 = ()->{
                System.out.println("Model: Maruti Suzuki ");
        };
        car1.modelName();
        System.out.println();

        Car car2 = ()-> System.out.println("Model: Bolero");
        car2.modelName();
        System.out.println();

    }
}

interface Car{
    void modelName();
}