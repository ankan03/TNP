package collectionAndGenerics.ComparatorInterface.ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterfaceMain {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,79));
        studentList.add(new Student(2,56));
        studentList.add(new Student(3,97));
        studentList.add(new Student(4,66));
        studentList.add(new Student(5,84));

//        //For sorting
        Collections.sort(studentList);
//        //For displaying
        studentList.forEach(System.out::println);


    }
}
