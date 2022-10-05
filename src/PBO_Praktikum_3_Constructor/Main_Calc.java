package PBO_Praktikum_3_Constructor;
import java.util.*;
public class Main_Calc {
    
    public static void Jeda(int a) {
        try {
            Thread.sleep(a);
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nTAHAP 1");
        System.out.println("Konstruktor tanpa parameter");
        Rumus_Kubus Object1 = new Rumus_Kubus();
        System.out.println("Object1 telah dibuat!");
        Jeda(2500);
        System.out.println("Volume kubus dengan panjang " + Object1.getPanjang() + ", lebar " + Object1.getLebar() + 
                ", dan tinggi " + Object1.getTinggi() + " adalah " + Object1.getRumus_Kubus());
        System.out.println("\nTAHAP 2");
        System.out.println("Konstruktor dengan parameter");
        System.out.println("Masukkan Lebar, Panjang, dan Tinggi secara berurutan!");
        double a = sc.nextDouble(); sc.nextLine();
        double b = sc.nextDouble(); sc.nextLine();
        double c = sc.nextDouble(); sc.nextLine();
        Rumus_Kubus Object2 = new Rumus_Kubus(a, b, c);
        System.out.println("Object2 telah dibuat!");
        Jeda(2500);
        System.out.println("Volume kubus dengan panjang " + Object2.getPanjang() + ", lebar " + Object2.getLebar() + 
                ", dan tinggi " + Object2.getTinggi() + " adalah " + Object2.getRumus_Kubus());
    }
    
}
