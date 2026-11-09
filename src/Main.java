import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Mevcut Katinizi Giriniz:");
        int mkat=sc.nextInt();
        System.out.println("Hedef Katinizi Giriniz:");
        int hkat=sc.nextInt();
        
        if (hkat<1 || hkat>10 ) { System.out.println("Gecersiz hedef kat");}
        else if (mkat<1 || mkat>10 ) { System.out.println("Gecersiz mevcut kat");}
        

        else if (hkat>mkat) {int yol=(hkat-mkat);       
        String yon=("yukari");
        System.out.println(yol+" Kat "+ yon+" gideceksiniz"); }
        
        else if (mkat>hkat){int yol=(mkat-hkat); 
        String yon=("asagi");
        System.out.println(yol+" Kat "+ yon +" gideceksiniz");}
        
        else if (mkat==hkat){System.out.println("Hareket yok"); } 

        
        scanner.close();
    }
}
