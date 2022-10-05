package PBO_4_Kelas_Inheritence;
import java.util.*;
public class Test_Main_Class {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Test_Subclass Gila0 = new Test_Subclass("Budianto", "Wong Ireng", 5);
        Test_Subclass Gila1 = new Test_Subclass(null, null, 0);
        
        Gila0.printAtt();
        Gila0.cetakAttv2();
        
        System.out.println("\nMasukkan nama!");
        String n = sc.nextLine();
        System.out.println("Masukkan keterangan!");
        String k = sc.nextLine();
        System.out.println("Masukkan angka random!");
        int a = Integer.parseInt(sc.nextLine());
        
        Gila1 = new Test_Subclass(n, k, a);
        
        Gila1.printAtt();
        Gila1.cetakAttv2();
    }
    
}
