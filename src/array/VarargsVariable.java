package array;

public class VarargsVariable {
    public static void main(String[] args) {
        Display d = new Display();
        Display d1 = new Display();
        d.show(1,2,3,4);
        d1.show(1);
    }
}

class Display{
    public void show(int ...a){//Varargs Variable Arguments (same as "Arrays.asList" function in Java)
        for (int i:a){
            System.out.println(i+" ");
        }
    }

    public void show(int a){
            System.out.println(a+" Show method");
    }
}
