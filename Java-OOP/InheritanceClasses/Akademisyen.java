package InheritanceClasses;

public class Akademisyen extends Calisan{
    String branch, occupation, classes;
    void lecture(){
        System.out.println("Lectured.");
    }

    public Akademisyen(String name, String lastName, String email, String phoneNumber, String branch, String occupation, String classes) {
        super(name, lastName, email, phoneNumber);
        this.branch = branch;
        this.occupation = occupation;
        this.classes = classes;
    }
}
