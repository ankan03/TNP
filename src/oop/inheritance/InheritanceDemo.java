package oop.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {

//        Add obj = new Add();
//        obj.n1 = 1;
//        obj.n2 = 2;
//        obj.sum();
//        System.out.println(obj.result);


        //single level inheritance
//        AddSub obj1 = new AddSub();
//        obj1.n1 = 5;
//        obj1.n2 = 2;
//        obj1.sum();
//        System.out.println("Add Result = "+obj1.result);
//        obj1.sub();
//        System.out.println("Sub Result = "+obj1.result);

        //multilevel level inheritance
        AddSubMul obj2 = new AddSubMul();
        obj2.n1 = 10;
        obj2.n2 = 2;
        obj2.sum();
        System.out.println("Add Result = "+obj2.result);
        obj2.sub();
        System.out.println("Sub Result = "+obj2.result);
        obj2.mul();
        System.out.println("Mul Result = "+obj2.result);

    }
}

class Add{
    int n1,n2,result;

    public void sum(){
        result = n1+n2;
    }
}

class AddSub extends Add{ //single level inheritance
    public void sub(){
        result = n1-n2;
    }
}

class AddSubMul extends AddSub{ //multilevel level inheritance
    public void mul(){
        result = n1*n2;
    }
}

class Div{
    int n1,n2,result;
    public void division(){
        result = n1/n2;
    }
}

//class AddDiv extends Add,Div{//JAVA doesn't support multiple inheritance
//
//}
