package FileOperations;

public class Student {
    protected String name;
    protected String lastName;
    protected int id;
    private static int ID = 1;

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.id = ID++;
    }
}