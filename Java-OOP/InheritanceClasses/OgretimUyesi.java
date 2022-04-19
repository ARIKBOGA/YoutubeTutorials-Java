package InheritanceClasses;

public class OgretimUyesi extends Akademisyen{
    String title;
    void joinMeeting(){}
    void readExams(){}

    public OgretimUyesi(String name, String lastName, String email, String phoneNumber, String branch, String occupation, String classes, String title) {
        super(name, lastName, email, phoneNumber, branch, occupation, classes);
        this.title = title;
    }
}
