import java.util.Scanner;

public class TumAsalSayilar {

    static void asalBul(int x){
        boolean asal;
        System.out.println("\n"+x+" sayısına kadar olan asal sayılar :");
        for (int i = 2; i < x; i++) {
            asal=true;
            for (int j = 2; j < i; j++) {
                if((i%j)==0){
                    asal=false;
                    break;
                }
            }
            if(asal){
                System.out.print(i+",");
            }
        }
    }
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        int input;
        do{
            System.out.print("'2' den büyük bir sayı giriniz : ");
            input=sc.nextInt();
        }while(input<=2);
        asalBul(input);
        sc.close();  
    }
}
