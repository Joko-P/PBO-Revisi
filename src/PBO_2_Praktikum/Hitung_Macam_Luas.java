package PBO_2_Praktikum;
import java.util.*;
public class Hitung_Macam_Luas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Luas_Persegi Persegi = new Luas_Persegi();
        Luas_Persegi PersegiPanjang = new Luas_Persegi();
        Luas_Persegi Segitiga = new Luas_Persegi();
        Luas_Lingkaran Lingkaran = new Luas_Lingkaran(0);
        
        do {
        System.out.println("\n--- PILIH MENU ---");
        System.out.println("\n1. Luas Persegi");
        System.out.println("2. Luas Persegi Panjang");
        System.out.println("3. Luas Segitiga Siku - Siku");
        System.out.println("4. Luas Lingkaran");
        System.out.println("100. Exit");
        System.out.println("Masukkan pilihan");
        choice = sc.nextInt(); sc.nextLine();
        
        switch(choice){
            case 1 :
                System.out.println("--- LUAS PERSEGI ---");
                System.out.println("Masukkan panjang!");
                Persegi.setPanjang(sc.nextInt()); sc.nextLine();
                System.out.println("Luasnya adalah : "+Persegi.LuasPersegi());
                break;
            case 2 :
                System.out.println("--- LUAS PERSEGI PANJANG ---");
                System.out.println("Masukkan panjang!");
                PersegiPanjang.setPanjang(sc.nextInt()); sc.nextLine();
                System.out.println("Masukkan lebar!");
                PersegiPanjang.setLebar(sc.nextInt()); sc.nextLine();
                System.out.println("Luasnya adalah : "+PersegiPanjang.LuasPersegiPanjang());
                break;
            case 3 :
                System.out.println("--- LUAS SEGITIGA ---");
                System.out.println("Masukkan Tinggi Segitiga!");
                Segitiga.setLebar(sc.nextInt()); sc.nextLine();
                System.out.println("Masukkan Lebar Segitiga!");
                Segitiga.setPanjang(sc.nextInt()); sc.nextLine();
                System.out.println("Luasnya adalah : "+Segitiga.LuasSegitiga());
                break;
            case 4 :
                System.out.println("--- LUAS LINGKARAN ---");
                System.out.println("Masukkan jari - jari lingkaran!");
                Lingkaran.setRusuk(sc.nextInt()); sc.nextLine();
                System.out.println("Luasnya adalah : "+Lingkaran.LuasLingkaran());
                break;
            case 100 :
                System.out.println("\nGood Bye!\n");
                System.exit(0);
                break;
            default :
                System.out.println("Masukkan angka yang benar!");
        }
        } while (true);
    }
}
