package Interfaces;

public class Test {
    public static void main(String[] args) {
        MountainBike b1 = new MountainBike();
        b1.speedUp(120);
        System.out.println(b1.getSpeed());

        MountainBike.printStuff();
    }
}
