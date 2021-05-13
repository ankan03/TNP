package stringOperation;

public class StringBufferAndStringBuilder {
    public static void main(String[] args) {

        //StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Ankan");
        stringBuffer.append(" Mukherjee");
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.charAt(6));
        stringBuffer.replace(7,10,"ggg");
        System.out.println(stringBuffer);

        stringBuffer.delete(5,10);
        System.out.println(stringBuffer);


        System.out.println("--------------------");

//        StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Ankan");
        stringBuilder.append(" Mukherjee");
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.charAt(6));

        stringBuilder.replace(7,10,"ggg");
        System.out.println(stringBuilder);

        stringBuilder.delete(5,10);
        System.out.println(stringBuilder);
    }
}
