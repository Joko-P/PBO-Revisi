package PBO_4_Praktikum;
import java.util.*;
public class Engine_Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        double cc, psi, multi;
        int piston;
        
        Engine_Base Mesin_5K = new Engine_Base("Mesin 5K", 348, 4);
        Mesin_5K.getEngineData();
        
        Turbocharged Mesin_RB26 = new Turbocharged(14, 2, "Mesin RB26DETT", 428, 6);
        Mesin_RB26.getEngineData();
        
        System.out.println("\nIngin Mencoba menambah data?");
        char choice = sc.nextLine().charAt(0);
        if (choice == 'Y' || choice == 'y') {
            System.out.println("Data mesin apa yang akan dimasukkan?");
            System.out.println("A. Natural Aspirated");
            System.out.println("B. Turbocharged");
            choice = sc.nextLine().charAt(0);
            if (choice == 'A' || choice == 'a') {
                System.out.println("Masukkan nama mesin!");
                name = sc.nextLine();
                System.out.println("Masukkan besar cc satuan cylinder!");
                cc = sc.nextDouble(); sc.nextLine();
                System.out.println("Masukkan jumlah cylinder mesin!");
                piston = sc.nextInt(); sc.nextLine();
                
                Engine_Base Engine01 = new Engine_Base(name, cc, piston);
                Engine01.getEngineData();
            } else if (choice == 'B' || choice == 'b') {
                System.out.println("Masukkan nama mesin!");
                name = sc.nextLine();
                System.out.println("Masukkan besar cc satuan cylinder!");
                cc = sc.nextDouble(); sc.nextLine();
                System.out.println("Masukkan jumlah cylinder mesin!");
                piston = sc.nextInt(); sc.nextLine();
                System.out.println("Masukkan besaran psi turbocharger!");
                psi = sc.nextDouble(); sc.nextLine();
                System.out.println("Masukkan besaran multiplie power!");
                multi = sc.nextDouble(); sc.nextLine();
                
                Turbocharged Engine01 = new Turbocharged(psi, multi, name, cc, piston);
                Engine01.getEngineData();
            } else {
                System.out.println("\nProgram dilewati!");
            }
        } else {
            System.out.println("\nProgram selesai!");
        }
        
    }
    
}
