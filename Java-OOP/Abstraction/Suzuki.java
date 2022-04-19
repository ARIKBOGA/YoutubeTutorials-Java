package Abstraction;

abstract class Suzuki extends Bike {
    @Override
    void run() {
        System.out.println("Suzuki is running");
    }

    @Override
    void stop() {
        System.out.println("Suzuki stopped");
    }

}