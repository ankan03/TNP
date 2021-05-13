package stringOperation;

public class StringSplitingFromCsv {
    public static void main(String[] args) {
        String str = "Ankan,Abhishek,Anubhav,Harsh,Abhedya";
        String a[] = str.split(",");
        for (String s:a) {
            System.out.println(s);
        }
    }
}
