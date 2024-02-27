package by.itstep.goutor.javalesson.lesson27.task.task1.data;

public class Human {


    protected String name;
    protected int age;

    public Human() {
        name = "no name";
        age = 0;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(Human human) {
        this(human.name, human.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
