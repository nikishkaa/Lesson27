package by.itstep.goutor.javalesson.lesson27.task.task1.data;

public class Student extends Human {
    private double mark;

    public Student() {
        super();
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
        super(student);
        mark = student.mark;
    }

    public double getMark(double mark) {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String toString() {
        return super.toString() + ",mark = " + mark;
    }

}
