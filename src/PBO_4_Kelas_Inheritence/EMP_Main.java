package PBO_4_Kelas_Inheritence;
import java.util.*;
public class EMP_Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id, name, add, dep, tit;
        
        Employee Wong1 = new Employee("K001", "Budiman", "Gensokyo", "HR", "Tukang Wawancara");
        Wong1.getData();
        
        System.out.println("\nMasukkan ID Karyawan!");
        id = sc.nextLine();
        System.out.println("Masukkan Nama Karyawan!");
        name = sc.nextLine();
        System.out.println("Masukkan Alamat Karyawan!");
        add = sc.nextLine();
        System.out.println("Masukkan Department Karyawan!");
        dep = sc.nextLine();
        System.out.println("Masukkan Job Title Karyawan!");
        tit = sc.nextLine();
        
        Employee Wong2 = new Employee(id, name, add, dep, tit);
        Wong2.getData();
    }
    
}
