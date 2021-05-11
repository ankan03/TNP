package condition;

public class SwitchCase {
    public static void main(String[] args) {
        int i=2;

        switch (i){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            default:
                System.out.println("not Zero/One");
        }

//        SwitchCase for string (special for java)

        String s = "c";
        switch (s){
            case "a":
                System.out.println("A");
                break;
            case "b":
                System.out.println("B");
                break;
            default:
                System.out.println("not A/B");
        }
    }
}
