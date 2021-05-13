package exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyBlock {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter a number");
            int i = Integer.parseInt(bufferedReader.readLine());
            System.out.println("i: "+i);
        }catch (Exception e){
            System.out.println("Wrong input");
        }finally {
            System.out.println("Bye");
        }

    }
}
