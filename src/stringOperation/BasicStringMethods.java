package stringOperation;

import java.util.Scanner;

public class BasicStringMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 string");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        //concatenation
        System.out.println("After concatenation: "+s1.concat(s2));
        System.out.println("After concatenation: "+(s1+s2));

        //Uppercase Lowercase
        System.out.println("Uppercase of s1: "+s1.toUpperCase());
        System.out.println("lowercase of s2: "+s2.toLowerCase());

        //length
        System.out.println("Length of s1: "+s1.length());
        System.out.println("Length of s2: "+s2.length());
    }
}
