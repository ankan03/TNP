package fileHandling.SerializationOfJavaObjectInXmlUsingXmlEncoder;

import java.util.List;

public class College {

    public List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
