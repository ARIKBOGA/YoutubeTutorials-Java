import java.util.Arrays;
import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[]{1, 2}));
     Scanner input = new Scanner(System.in);
     double fiyat, tutar, kdvOrani = 0.18;
     System.out.println("Ürün Fiyatını Giriniz ");
     fiyat = input.nextDouble();
     tutar = fiyat+(fiyat*kdvOrani);
     System.err.println("KDV Tutarı " + (fiyat*kdvOrani));
     System.out.println("Toplam Ödeme Tutarı "+ tutar);
     input.close();

    }
    
}
