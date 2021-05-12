package basicConcept;

public class PostPreIncrement {
    public static void main(String[] args) {
        int i=2;
        System.out.println(i);
        i++;
        System.out.println(i);
        i=i++;
        System.out.println(i);

        System.out.println("********");
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
    }
}

