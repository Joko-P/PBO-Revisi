package PBO_4_Praktikum;
import java.util.*;
public class Engine_Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Engine_Base Mesin_5K = new Engine_Base("Mesin 5K", 348, 4);
        Mesin_5K.getEngineData();
        
        Turbocharged Mesin_RB26 = new Turbocharged(14, 2, "Mesin RB26DETT", 428, 6);
        Mesin_RB26.getEngineData();
        
        /*
        System.out.println("\nIngin Mencoba menambah data?");
        char choice = sc.nextLine().charAt(0);
        if (choice == 'Y' || choice == 'y') {
            System.out.println("");
        } else {
            System.out.println("\nProgram selesai!");
        }
        */
    }
    
}
