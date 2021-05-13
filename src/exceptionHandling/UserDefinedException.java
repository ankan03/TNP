package exceptionHandling;

public class UserDefinedException {
    public static void main(String[] args) {
        int i=5;

        //type-1
//        try {
//            if (i<10){
//                throw new Exception();
//            }
//        }catch (Exception e){
//            System.out.println(e);
//        }

        //type-2
//        try {
//            if (i<10){
//                throw new Exception("Error");
//            }
//        }catch (Exception e){
//            System.out.println(e);
//        }

        //type-3
//        try {
//            if (i<10){
//                throw new MyException("Errorrrrrrrrrrrr");
//            }
//        }catch (Exception e){
//            System.out.println(e);
//        }

        //type-4
        try {
            if (i<10){
                throw new MyException1("Error Occurred");
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}

class MyException extends Exception{
        public MyException(String str){
            System.out.println(str);
        }
}

class MyException1 extends Exception{
    public MyException1(String str){
        super(str);
    }
}
