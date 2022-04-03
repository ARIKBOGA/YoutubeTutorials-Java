package InheritanceClasses;

public class Asistan extends Akademisyen{
    String masterDegree;
    void takeLab(){}
    void readQuiz(){}

    public Asistan(String name, String lastName, String email, String phoneNumber, String branch, String occupation, String classes, String masterDegree) {
        super(name, lastName, email, phoneNumber, branch, occupation, classes);
        this.masterDegree = masterDegree;
    }
}
