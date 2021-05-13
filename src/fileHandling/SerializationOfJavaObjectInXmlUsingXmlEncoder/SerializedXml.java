package fileHandling.SerializationOfJavaObjectInXmlUsingXmlEncoder;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializedXml {
    public static void main(String[] args) throws FileNotFoundException {

        Student student1 = new Student();
        student1.setName("Ankan Mukherjee");
        student1.setRollNo(1828049);

        Student student2 = new Student();
        student2.setName("Abhiskek Raj");
        student2.setRollNo(1828043);

        Student student3 = new Student();
        student3.setName("Anubhav Mishra");
        student3.setRollNo(1828054);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        College kiit = new College();
        kiit.setStudentList(studentList);

        XMLEncoder xmlEncoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("myCollege.xml")));
        xmlEncoder.writeObject(kiit);
        xmlEncoder.close();
    }
}
