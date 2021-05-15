package annotationApplication;

import java.util.ArrayList;

public class DemoAnnotation {
    public static void main(String[] args) {

        C c = new C();
        c.abc();//If we call Deprecated method it will show a strike on the method name
        c.xyz();
    }
}

@FunctionalInterface//If no of declared method >1 , will throw error
interface A{
    public void show();
}


class B implements A{

    @SuppressWarnings("unchecked")
    @Override//This will check Overriding performed successfully or not
    // (For e.g if we write wrong spelling of override method it will show error)
    public void show() {
        ArrayList arrayList = new ArrayList();
    }
}

class C{
    @Deprecated
    public void abc(){

    }

    public void xyz(){

    }
}
