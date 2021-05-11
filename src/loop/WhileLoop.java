package loop;

public class WhileLoop {
    public static void main(String[] args) {
        int i=0,j=0;
        while (i<10){
            System.out.println(i);
            i++;
        }

        System.out.println("******");
        while (j<=10){
            System.out.println(j);
            j++;
        }

        //do-while
        int m=-1;
        do {
            System.out.println(m+" is Greater than 0");
            m--;
        }while (m>0);
    }
}
