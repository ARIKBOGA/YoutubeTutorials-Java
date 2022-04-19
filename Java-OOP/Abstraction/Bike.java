package Abstraction;

abstract class Bike {
    public Bike() {
        System.out.println("Bike started");
    }

    abstract  void run();
    abstract  void stop();
    abstract  void ABS();

    void changeGear(){
        System.out.println("Bike changed gear");
    }
}
