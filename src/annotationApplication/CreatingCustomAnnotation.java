package annotationApplication;

import java.lang.annotation.*;

//Marker annotation(no method declaration is available)
@interface Smartphone{

}

//Functional annotation(1 method declaration is available)
@interface Smartphone1{
    int button();
}

//Functional annotation(more than 1 method declaration is available)
@interface Smartphone2{
    int button();
    String keypad();
}

//We can provide default value
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Smartphone3{
    String os() default "Android";
    int version() default 1;
}

@Smartphone
class MiSeries{

}

@Smartphone2(button = 27,keypad = "popup")
class NokiaSeries{

}

//will use default value
@Smartphone3
class SamsungSeries{

}

//will override default value
@Smartphone3(os = "Apple",version =3)
class AppleSeries{
    int screenSize;

    public AppleSeries(int screenSize) {
        this.screenSize = screenSize;
    }
}
public class CreatingCustomAnnotation {
    public static void main(String[] args) {

        //We can fetch annotation parameter value
        AppleSeries appleSeries = new AppleSeries(5);
        Class c = appleSeries.getClass();
        Annotation annotation = c.getAnnotation(Smartphone3.class);
        Smartphone3 smartphone3 = (Smartphone3)annotation;
        System.out.println("os: "+smartphone3.os());
        System.out.println("version: "+smartphone3.version());
    }
}
