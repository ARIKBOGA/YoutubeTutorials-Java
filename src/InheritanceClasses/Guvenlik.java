package InheritanceClasses;

public class Guvenlik extends Memurlar{
    String document;

    public Guvenlik(String name, String lastName, String email, String phoneNumber) {
        super(name, lastName, email, phoneNumber);
    }

    void duty(){}
}
