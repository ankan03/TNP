package userInput;

import java.io.IOException;

public class UserInputUsingSystem_in_read {
    public static void main(String[] args) throws IOException {
        //System.in.read() can read one character at a time

//        System.out.println("Enter character");
//        int i = System.in.read();
//        System.out.println("i: "+i);
//
//        System.out.println("Enter character");
//        char j = (char) System.in.read();
//        System.out.println("j: "+j);

        System.out.println("Enter string");
        String str="";
        int i ;
        while ((i = System.in.read())!=48){
            str += (char)i;
        }
        System.out.println("str: "+str);
    }
}
