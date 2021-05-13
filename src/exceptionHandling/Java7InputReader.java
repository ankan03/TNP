package exceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Java7InputReader {
    public static void main(String[] args) throws Exception {
        //this is a new feature in from java-7 (It will automatically close bufferedReader)
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter a string");
            String str = bufferedReader.readLine();
            System.out.println("str: "+str);
        }
    }
}
