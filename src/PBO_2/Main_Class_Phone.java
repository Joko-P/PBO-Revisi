package PBO_2;
import java.util.*;
import java.io.*;
public class Main_Class_Phone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        Handphone Merk_Samsung = new Handphone();
        Samsung Model_Galaxy = new Samsung();
                
        try {
            do {
                System.out.println("\n--- MENU TEST ---");
                System.out.println("1. Isi Data HP");
                System.out.println("2. Beli HP");
                System.out.println("3. Keluar aplikasi");
                System.out.print("Pilih menu : ");
                int choice = Integer.parseInt(br.readLine());
                
                switch(choice){
                    case 1 :
                        System.out.println("\n--- ISI DATA ---");
                        System.out.print("Tipe : ");
                        Merk_Samsung.setTipe(sc.nextLine());
                        System.out.print("Warna : ");
                        Merk_Samsung.setWarna(sc.nextLine());
                        System.out.print("Kapasitas : ");
                        Merk_Samsung.setKapasitas(sc.nextLine());
                        System.out.print("Harga : ");
                        Model_Galaxy.setHarga(sc.nextInt());
                        sc.nextLine();
                        break;
                    case 2 :
                        System.out.println("\n--- BELI HP ---");
                        System.out.print("Jumlah beli : ");
                        Model_Galaxy.setJumlah(sc.nextInt());
                        sc.nextLine();
                        System.out.println("Total Bayar :");
                        System.out.println("Rp "+Model_Galaxy.getBeli());
                        break;
                    case 3 :
                        System.out.println("\nGood Bye!\n");
                        System.exit(0);
                        break;
                    default :
                        System.out.println("\nMohon masukkan pilihan yang sesuai!");
                }
            } while (true);
        } catch (Exception e) {
            System.out.println("Inputan salah!");
        }
    }
    
}
