import java.util.Scanner;

public class Dongu {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
       System.out.print("Yıldız Katmanı Adedini Giriniz : ");
        int katman = input.nextInt();
        for (int index = 0; index <= katman; index++) {
            for ( int i = 0; i < index; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("Yılbaşı ağacı katman sayısını giriniz : ");
        int agacKati=input.nextInt();
        int ara=agacKati-1;
        int dolgu=1;
        for (int i = 0; i < agacKati-1; i++) {
            for (int j = 0; j <= ara; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < dolgu; j++) {
                if(j==0){
                    System.out.print("/");
                }
                System.out.print("*");
                if(j==dolgu-1){
                    System.out.print("\\");
                }
            }
            System.out.println();
            dolgu+=2;
            ara-=1;
            
        }
        for (int j = 0; j < agacKati/2+1; j++) {
            for (int j2 = 0; j2 < agacKati; j2++) {
                System.out.print(" ");
            }
            System.out.println("||");
        }
        



        System.out.print("'Tersten' Yıldız Katmanı Adedini Giriniz : ");
        int tertstenKatman = input.nextInt();
        for (int i = tertstenKatman; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }       
        
        // Diammond Şeklinde Çıktı

        int yildiz,bosluk,giris;
        System.out.print("Yıldız satırı sayısını giriniz : ");
        giris = input.nextInt();
        bosluk=giris-1;
        yildiz=1;
        for (int i = 0; i <= giris; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
        for (int i = 0; i < giris; i++) {
            for (int j = 0; j < bosluk; j++) {
                System.out.print(" ");
            }
            for (int j2 = 0; j2 < yildiz; j2++) {
                if(j2==0){
                        System.out.print("-/");
                    }
                    System.out.print("*");
                if(j2==yildiz-1){
                        System.out.print("\\-");
                    } 
            }
            System.out.println();
            yildiz+=2;
            bosluk--;
        }
        yildiz=(giris*2)-1;
        bosluk=0;
        for (int i = 0; i < giris; i++) {
           for (int j = 0; j < bosluk; j++) {
            System.out.print(" ");
           }
           for (int j = 0; j < yildiz; j++) {
               if(j==0){
                   System.out.print("-\\");
               }
               System.out.print("*");
               if(j==yildiz-1){
                   System.out.print("/-");
               }
           }
           System.out.println();
           yildiz-=2;
           bosluk++;
        }
        for (int i = 0; i <= giris; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
        input.close();
    }
}


    
