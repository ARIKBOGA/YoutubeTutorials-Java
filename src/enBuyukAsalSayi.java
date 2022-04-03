import java.util.Scanner;

public class enBuyukAsalSayi {
    static boolean AsalMi(int d) {
        boolean asal = true;
        for (int i = 2; i < d; i++) {
            if (d % i == 0) {
                asal = false;
                break;
            }
        }
        return asal;
    }

    public static void main(String[] args) {
        boolean b;
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Lütfen kendisinden küçük en büyük asal sayıyı bulmam için bir sayı giriniz : ");
        int d = sc.nextInt();
        for (int i = d; i > 1; i--) {
            if (i % 2 != 0){
                b = AsalMi(i);
                if (b) {
                    System.out.println("\n " + d + " sayısından küçük en büyük asal sayı : " + i + "\n");
                    break;
                }
            }
        }
        sc.close();
    }
}
