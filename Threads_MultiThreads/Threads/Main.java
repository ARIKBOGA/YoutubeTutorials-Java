package Threads;

public class Main {
    public static void main(String[] args) {
        Processes p1 = new Processes("Developing");
        Processes p2 = new Processes("Testing");

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);

        t1.start();
        t2.start();
    }
}