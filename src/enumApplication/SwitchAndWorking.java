package enumApplication;


enum C{
    VAR1,VAR2,VAR3;
}


//Behind the seen of enum(substitute of enum)
//class Mobile{
//    static final Mobile APPLE = new Mobile();
//    static final Mobile SAMSUNG = new Mobile();
//    static final Mobile MI = new Mobile();
//    static final Mobile REALMI = new Mobile();
//}


//enum Mobile{
//    APPLE,SAMSUNG,MI,REALMI;
//
//    //We can also declare variable and method inside enum
//    int price;
//    public int getPrice(){
//        return price;
//    }
//}

interface DemoInterface{

}

class DemoClass{

}
enum Mobile{
//enum Mobile extends DemoClass{//enum cannot extend any other class
//enum Mobile implements DemoInterface{//enum can implement any other interface
    APPLE(100),SAMSUNG,MI(78),REALMI;

    //We can also declare variable and method inside enum
    int price;

    public int getPrice(){
        return price;
    }

    //Once enum initialize all constructor will be called accordingly
    Mobile(int price) {
        this.price = price;
        System.out.println("Price: "+this.price);
    }

    Mobile() {
        System.out.println("No price available");
    }
}


public class SwitchAndWorking {
    public static void main(String[] args) {
        C c = C.VAR1;


        switch (c){
            case VAR1:
                System.out.println("VAR1 is selected");
                break;

            case VAR2:
                System.out.println("VAR2 is selected");
                break;

            case VAR3:
                System.out.println("VAR3 is selected");
        }

        Mobile m = Mobile.APPLE;
        System.out.println("Mobile.APPLE.getPrice(): "+Mobile.APPLE.getPrice());
        System.out.println("m.getPrice(): "+m.getPrice());

        //we can fetch all enum in this way
        Mobile mobile[] = Mobile.values();
        for (Mobile mobile1:mobile){
            System.out.println(mobile1);
        }
    }
}
