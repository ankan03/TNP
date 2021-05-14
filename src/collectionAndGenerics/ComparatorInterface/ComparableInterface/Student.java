package collectionAndGenerics.ComparatorInterface.ComparableInterface;

public class Student implements Comparable<Student> {
    int roll;
    int number;

    public Student(int roll, int number) {
        this.roll = roll;
        this.number = number;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", number=" + number +
                '}';
    }


    @Override
    public int compareTo(Student student) {
        return this.number>student.number?-1:this.number<student.number?1:0;
    }
}
