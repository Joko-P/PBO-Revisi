package PBO_Tugas_M2;
import java.util.*;
public class Check_SPP_Gaji {
    
    private static boolean IsNumeric(String str){
        try {
        Double.parseDouble(str);
        return true;
        } catch(NumberFormatException e) {
        return false;
        }
    }
    
    private static void setSemuaNilai() {
        Universitas Dinamika = new Universitas();
        Dinamika.setNama("Universitas Dinamika");
        Dinamika.setAlamat("Jl. Raya Kedung Baruk No.98, Kedung Baruk, Kec. Rungkut, Kota SBY, Jawa Timur 60298");
        
        Mahasiswa MHS0001 = new Mahasiswa();
        MHS0001.setNim("21410100056");
        MHS0001.setAll();
        MHS0001.setSemester(3);
        Mahasiswa MHS0002 = new Mahasiswa();
        MHS0002.setNim("164201000015");
        MHS0002.setAll();
        MHS0002.setSemester(8);
        
        Karyawan EMP0001 = new Karyawan();
        EMP0001.setNik("85419685419685416");
        EMP0001.setBagian("Ndak tau bagian apa");
        EMP0001.setGaji_per_hari(150000);
        EMP0001.setKehadiran(25);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test;
        int choice;
        //setSemuaNilai();
        
        Universitas Dinamika = new Universitas();
        Dinamika.setNama("Universitas Dinamika");
        Dinamika.setAlamat("Jl. Raya Kedung Baruk No.98, Kedung Baruk, Kec. Rungkut, Kota SBY, Jawa Timur 60298");
        
        Mahasiswa MHS0001 = new Mahasiswa();
        MHS0001.setNim("21410100056");
        MHS0001.setAll();
        MHS0001.setSemester(3);
        Mahasiswa MHS0002 = new Mahasiswa();
        MHS0002.setNim("164201000015");
        MHS0002.setAll();
        MHS0002.setSemester(8);
        
        Karyawan EMP0001 = new Karyawan();
        EMP0001.setNik("85419685419685416");
        EMP0001.setBagian("Ndak tau bagian apa");
        EMP0001.setGaji_per_hari(150000);
        EMP0001.setKehadiran(25);
        
        
        do {
            System.out.println("\n--- CEK SPP DAN GAJI ---");
            System.out.println("\nAn app to check student's SPP and employee's salary."
                    + "\nSome features are currently missing/not addeed yet."
                    + "\nThose features may/may not be added in the future.");
            System.out.println("\n1. Cek SPP Mahasiswa");
            System.out.println("2. Cek Gaji Karyawan");
            System.out.println("3. Exit");
            System.out.println("\nMasukkan pilihan menu!");
            do {
                test = sc.nextLine();
                if (IsNumeric(test) == true) {
                    choice = Integer.parseInt(test);
                } else {
                    System.out.println("Harap masukkan angka!");
                    choice = 0;
                }
            } while (IsNumeric(test)==false);
            
            switch(choice) {
                case 1 :
                    System.out.println("--- CEK SPP MAHASISWA ---");
                    System.out.println("\nNIM : " + MHS0001.getNim());
                    System.out.println("Angkatan : " + MHS0001.getAngkatan());
                    System.out.println("Program Studi : " + MHS0001.getProdi());
                    System.out.println("Semester : " + MHS0001.getSemester());
                    System.out.println("SPP Dasar : Rp " + MHS0001.getSpp());
                    System.out.println("Bayar SPP Semester : Rp " + MHS0001.getSPP());
                    System.out.println("\nNIM : " + MHS0002.getNim());
                    System.out.println("Angkatan : " + MHS0002.getAngkatan());
                    System.out.println("Program Studi : " + MHS0002.getProdi());
                    System.out.println("Semester : " + MHS0002.getSemester());
                    System.out.println("SPP Dasar : Rp " + MHS0002.getSpp());
                    System.out.println("Bayar SPP Semester : Rp " + MHS0002.getSPP());
                    System.out.println("\nPress enter to continue!");
                    sc.nextLine();
                    break;
                case 2 :
                    System.out.println("--- CEK GAJI KARYAWAN ---");
                    System.out.println("NIK : " + EMP0001.getNik());
                    System.out.println("Bagian : " + EMP0001.getBagian());
                    System.out.println("Kehadiran : " + EMP0001.getKehadiran());
                    System.out.println("Gaji per hari : Rp " + EMP0001.getGaji_per_hari());
                    System.out.println("Gaji bulan ini : Rp " + EMP0001.getGaji());
                    System.out.println("\nPress enter to continue!");
                    sc.nextLine();
                    break;
                case 3 :
                    System.out.println("Good Bye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mohon masukkan pilihan yang benar!");
            }
            
        } while(true);
    }
    
}
