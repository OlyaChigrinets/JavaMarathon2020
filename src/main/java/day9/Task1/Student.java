package day9.Task1;

public class Student extends Human {
    private int group;

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Student(String name, int group) {
        super(name);
        this.group = group;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем" + super.getName());
    }

}
