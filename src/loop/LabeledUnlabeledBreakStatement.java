package loop;

public class LabeledUnlabeledBreakStatement {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Unlabeled break statement
        System.out.println("-----------------------");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i==2)
                    break;

                System.out.print("* ");
            }
            System.out.println();
        }

        // Labeled break statement
        System.out.println("-----------------------");
        ankan:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i==2)
                    break ankan;

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
