package collectionAndGenerics.ComparatorInterface.ComparatorWithCustomType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorImplMainClass {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,79));
        studentList.add(new Student(2,56));
        studentList.add(new Student(3,97));
        studentList.add(new Student(4,66));
        studentList.add(new Student(5,84));

        //For sorting
        Collections.sort(studentList,(s1,s2)->{
            return s1.number>s2.number?-1:s1.number<s2.number?1:0;
        });
        //For displaying
        studentList.forEach(System.out::println);
    }
}
