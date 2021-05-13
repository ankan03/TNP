package stringOperation;

public class ToString {
    public static void main(String[] args) {
        Student student = new Student(1,"Ankan");

//        System.out.println("Roll: "+student.roll+" Name: "+student.name);
        System.out.println(student);//It will automatically apply toString() method an print hashCode of the object (toString() )


    }


}

class Student{
    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    //We can override toString() method of Object class

//    public String toString() {
//        return "Roll: "+roll+" Name: "+name;
//    }


    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}
