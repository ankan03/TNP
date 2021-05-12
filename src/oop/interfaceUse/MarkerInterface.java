package oop.interfaceUse;

public class MarkerInterface {
    public static void main(String[] args) {
        Q q = new Q();
        if (q instanceof P){
            q.show();
        }else {
            System.out.println("Permission Denied");
        }
    }

}

interface P{

}

//class Q {
//    public void show(){
//        System.out.println("Inside 'show()' method of class 'Q'");
//    }
//}

class Q implements P{
    public void show(){
        System.out.println("Inside 'show()' method of class 'Q'");
    }
}
