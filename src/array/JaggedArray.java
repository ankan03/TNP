package array;

import java.util.Random;

public class JaggedArray {
    public static void main(String[] args) {
        int a[][] = {
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };

        for (int i[]: a){
            for (int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
        int b[][] = new int[3][];
        b[0] = new int[4];
        b[1] = new int[2];
        b[2] = new int[3];
        Random random = new Random();
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = random.nextInt(9);
            }
        }

        for (int i[]: b){
            for (int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
