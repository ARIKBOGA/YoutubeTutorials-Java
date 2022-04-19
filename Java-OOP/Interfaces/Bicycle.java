package Interfaces;

public interface Bicycle {
    int MAX_SPEED =100;
    void  applyBrake(int decrement);
    void speedUp(int increment);

    static void printStuff(){
        System.out.println("Bicycle stuff");
    }
}
