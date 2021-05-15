package enumApplication;

public class EnumClass {

    public static void main(String[] args) {
        D d = D.VAR1;
    }
}

enum D{
    VAR1,VAR2,VAR3;

    int v1;
    public void show(){
        System.out.println("v1: "+v1);
    }
}
