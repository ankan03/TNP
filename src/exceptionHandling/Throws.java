package exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Throws {
    public static void main(String[] args) throws IOException {//throws is used only to suppress the error not handelling the error


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter integer");
        int i = Integer.parseInt(bufferedReader.readLine());

        System.out.println("i: "+i);

//        try {
//            int a[] = new int[5];
//            a[10] = 9;
//        }catch (Exception e){
//            System.out.println("Error");
//        }

    }
}
