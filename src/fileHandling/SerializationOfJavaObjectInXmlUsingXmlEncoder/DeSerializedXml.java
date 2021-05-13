package fileHandling.SerializationOfJavaObjectInXmlUsingXmlEncoder;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class DeSerializedXml {
    public static void main(String[] args) throws FileNotFoundException {
        XMLDecoder xmlDecoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("myCollege.xml")));
        College college = (College) xmlDecoder.readObject();
        List<Student> studentList = college.getStudentList();

        for (Student student : studentList) {
            System.out.println(student);
        }

    }
}
