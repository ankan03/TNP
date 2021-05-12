package staticKeyword.StaticImport;
import static java.lang.System.out;
import static staticKeyword.StaticImport.Sample2.show;

public class Sample1 {
    public static void main(String[] args) {
//        System.out.println("Hello"); //without static import
        out.println("Hello"); // we have statically imported the System class

//        Sample2.show(); //without static import
        show(); //with static import
    }
}
