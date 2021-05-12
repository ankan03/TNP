package oop.abstractClass;

public class AbstractClassExample {
    public static void main(String[] args) {
        Xiaomi obj = new Xiaomi();
        Samsung obj1  = new Samsung();
        show(obj1);

    }

    public static void show(Phone phone){
        System.out.println("Model name of the phone is = "+phone.modelName());
    }
}

abstract class Phone{
    public abstract String modelName();
}

class Xiaomi extends Phone{

    @Override
    public String modelName() {
        return "Xiaomi";
    }
}

class Samsung extends Phone{

    @Override
    public String modelName() {
        return "Samsung";
    }
}
