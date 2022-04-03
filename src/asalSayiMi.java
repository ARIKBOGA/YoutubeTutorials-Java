import java.util.Scanner;

public class asalSayiMi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);        
        boolean asal=true;   
        int ilkBolen=1;    
        System.out.println("-----Asal Sayı Bulma Programı-----\n");     
        System.out.println("Programı sonlandırmak için '0' giriniz :\n");   
        System.out.print("Başlangıç için '2'den büyük bir sayı giriniz : ");
        double girdi=sc.nextDouble();
        while(girdi!=0){
           while(girdi<2){
            System.out.print("'2'den büyük bir sayı giriniz : ");
            girdi=sc.nextInt();
            }
            for (int i = 2; i < girdi; i++) {
                asal=true;
                if(girdi%i==0){
                    ilkBolen=i;
                    asal=false;
                    break;
                }                
        }   
        if(asal){
            System.out.println(girdi+" asal bir sayıdır.\n");            
        }else{
            System.out.println(girdi+" asal bir sayı değildir. İlk Bölen : "+ilkBolen+"\n");          
        } 
        System.out.print("Yeni bir sayı giriniz :");
            girdi=sc.nextInt();
        }     
        System.out.println("Program sonlandırıldı.");
        sc.close();
    }
}
