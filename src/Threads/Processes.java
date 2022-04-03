package Threads;

public class Processes implements Runnable {
    String name;

    public Processes(String name) {
        this.name = name;
        System.out.println(name + " is created.");
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(this.name + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Error detected !");
            //e.printStackTrace();
        }

        System.out.println(this.name + " is over");
    }
}
