package by.itstep.goutor.javalesson.lesson27.task.task1.data;

public class Student extends Human {
    private double mark;

    public Student() {
        name = "no name";
        age = 0;
        mark = 4;
    }

    public Student(String name, int age, double mark) {
        super();
        mark = 4;
    }

    public Student(String name, int age, double mark) {
        super(name, age);
        this.mark = mark;
    }

    public Student(Student student) {
        this(student.name, student.age, student.mark);
    }

    public void getMark(double mark) {

    }

    public void setMark(double mark) {

    }

    public String toString() {
        return name + ": age = " + age + "mark = " + mark;
    }

}
