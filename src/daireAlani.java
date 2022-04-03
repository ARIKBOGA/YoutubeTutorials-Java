import java.util.Scanner;

public class daireAlani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin çapını giriniz :");
        double alan , cap = input.nextDouble();
        alan = 2*3.14*(cap/2);
        System.out.print("Dairenin Alanı : "+ alan);
        input.close();


    }
}
