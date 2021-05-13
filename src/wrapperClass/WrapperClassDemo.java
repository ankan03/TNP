package wrapperClass;

public class WrapperClassDemo {

    public static void main(String[] args) {
        Integer integer1 = new Integer(1);//boxing
        Integer integer3 = 1;// auto boxing

        Integer integer2 = Integer.valueOf(1);


        int i = integer3.intValue();//unboxing
        int j = integer2;//auto unboxing
        System.out.println("i: "+i+"\tj: "+j);

    }
}
