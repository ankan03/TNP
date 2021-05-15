package enumApplication;

public class EnumDemo implements A {

    //We can also declare enum inside another class
    enum FRUIT {
        APPLE,BANANA,MANGO;
    }

    public static void main(String[] args) {
        //Normal
        System.out.println("VAR1: "+A.VAR1);
        System.out.println("VAR2: "+A.VAR2);

        if (A.VAR1 == 2){
            System.out.println("VAR1 = 2");
        }


        System.out.println("Enum B: "+B.VAR1);
        System.out.println("Enum C: "+ FRUIT.APPLE);


    }
}

//same as enum(Used  before introducing enum)
interface A{
    static final int VAR1=2;
    static final int VAR2=5;
}

enum B{
    VAR1,VAR2;
}
