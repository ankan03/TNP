package collectionAndGenerics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {

        //Here we can add values from any datatype(No type safety)
        List values = new ArrayList();
        values.add("Ankan");
        values.add(1);
        values.add(1.2);
        values.add(2.1f);
        for (Object o : values) {
            System.out.println(o);
        }
        System.out.println("----------------------------------------");

        //Here we can enter values from same datatype(Type safety)
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
//        integerList.add("aa");//Error
        integerList.add(3);
        for (int i : integerList) {
            System.out.println(i);
        }
        System.out.println("----------------------------------------");


        Generics<Object> g1 = new Generics<>();
        g1.setValue(1);
        g1.show();

        Generics<Integer> g2 = new Generics<>();
        g2.setValue(1);
        g2.show();

        Generics<Float> g3 = new Generics<>();
        g3.setValue(1.8f);
        g3.show();

        Generics<Double> g4 = new Generics<>();
        g4.setValue(1.5);
        g4.show();

        Generics<String> g5 = new Generics<>();
        g5.setValue("Ankan");
        g5.show();

        System.out.println("----------------------------------------");


        Generics1<Integer> g6 = new Generics1<>();
        g6.setValue(1);
        g6.show();
        g6.demo3(new ArrayList<Number>());// Number is SUPERCLASS of Integer

        //Error: because the generic is extending number class but String class doesn't extend number class
//        Generics1<String> g7 = new Generics1<>();
//        g7.setValue("Ankan");
//        g7.show();

        Generics1<Number> g8 = new Generics1<>();
        g8.setValue(1.1);
        g8.show();
        g8.demo(new ArrayList<Integer>());
//        g8.demo(new ArrayList<Number>());//Error: Number doesn't belongs Integer class
        g8.demo1(new ArrayList<Number>());
        g8.demo2(new ArrayList<Number>());
//        g8.demo3(new ArrayList<Integer>());//Error: Integer is SUBCLASS of Number



        Generics1<Number> g9 = new Generics1<>();
        g9.setValue(1.8f);
        g9.show();
        g9.demo(new ArrayList<Integer>());
//        g9.demo(new ArrayList<Number>());//Error: Number doesn't belongs Integer class
        g9.demo1(new ArrayList<Integer>());
        g9.demo2(new ArrayList<Integer>());

    }
}


class Generics<T>{
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void show(){
        System.out.println("Value: "+value+"\t Class: "+value.getClass().getName());
    }
}

class Generics1<T extends Number>{
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void show(){
        System.out.println("Value: "+value+"\t Class: "+value.getClass().getName());
    }

    //We can pass integer arraylist only
    public void demo(ArrayList<Integer> integerArrayList){

    }

    public void demo1(ArrayList<? extends Number> integerArrayList){

    }

    public void demo2(ArrayList<? extends T> integerArrayList){// "?" is SUBCLASS of "T"

    }

    public void demo3(ArrayList<? super T> integerArrayList){// "?" is SUPERCLASS of "T"

    }
}