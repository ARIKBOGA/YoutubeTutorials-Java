import java.util.Scanner;

public class wihileOrnek {
    public static void main(String[] args) {
        
        // 100 'e kadar olan çift sayıların yazdırılması programı'
        int s=0;
        while(s<=100){
            System.out.print(s+",");
            s+=2;
        }

        // Negatif bir değer girilene kadar girilen sayılardan tek sayıla olanları toplayan program
        int toplam=0;
        Scanner scan =new Scanner(System.in);
        System.out.print("Negatif bir değer girene kadar girilen sayılar toplanacaktır.\n");
        int giris;
        while(true){
            System.out.print("Sayı Giriniz :");
            giris=scan.nextInt();
            if(giris<0){
                System.out.println("Negatif sayı girildi, program bitti.");
                System.out.println("Girilen sayıların toplamı : "+toplam);
                break;
            }
            if((giris%2)==1){
                toplam+=giris;
            }
         }   

        // Girilen sayıya kadar olan 2'nin kuvvetlerini yazdıran program
        int kat;
        System.out.println();
        System.out.print("Girdiğiniz sayıya kadar olan 2'nin kuvvetlerini yazdıracağız.\nProgrmı bitirmek için '0' giriniz.\n");
        while(true){
            System.out.print("Lütfen pozitif bir sayı giriniz :");
            kat=1;
            giris=scan.nextInt();
            if(giris==0){
                System.out.println("'0' girildi progrm bitti." );
                break;
            }
            if(giris<2){
                System.out.print("Lütfen 2'den büyük bir sayı giriniz :");
                continue;
            }
            System.out.print("Girdiğiniz '"+giris+"'sayısına kadar olan 2'nin kuvvetleri:");
            while(kat<giris){
                System.out.print(kat+",");
                kat*=2;
            }
            System.out.println();
        }
        scan.close();
    }
}
