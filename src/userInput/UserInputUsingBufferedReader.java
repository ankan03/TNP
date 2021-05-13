package userInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputUsingBufferedReader {
    public static void main(String[] args) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

//        int i = Integer.parseInt(bufferedReader.readLine());
//        System.out.println("i: "+i);

//        String str = bufferedReader.readLine();
//        System.out.println("str: "+str);

        double d = Double.parseDouble(bufferedReader.readLine());
        System.out.println("d: "+d);
    }
}
