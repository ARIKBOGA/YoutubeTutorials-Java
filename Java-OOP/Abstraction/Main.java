package Abstraction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Bike honda1 = new Honda();
        //Honda honda2 = new Honda();

        int x = (int)Arrays.stream(Object.class.getMethods()).count();
        System.out.println(x);
        honda1.run();
        honda1.ABS();
        honda1.changeGear();
        honda1.stop();

        System.out.println("----------------------------\n");
        Suzuki s1 = new Honda();

        s1.ABS();
    }
}