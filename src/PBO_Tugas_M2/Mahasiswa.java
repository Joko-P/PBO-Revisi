package PBO_Tugas_M2;
import java.util.*;
public class Mahasiswa {
    private String nim, prodi;
    private int spp, angkatan, semester, bayar_spp_semester;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi() {
        Scanner sc = new Scanner(System.in);
        String kode_prodi = getNim().substring(2, 7);
        
        if (kode_prodi.equals("41010")) {
            this.prodi = "Strata I Sistem Informasi";
        } else if (kode_prodi.equals("41020")) {
            this.prodi = "Strata I Teknik Komputer";
        } else if (kode_prodi.equals("42010")) {
            this.prodi = "Strata I Desain Komunikasi & Visual";
        } else if (kode_prodi.equals("42020")) {
            this.prodi = "Strata I Desain Produk";
        } else if (kode_prodi.equals("39010")) {
            this.prodi = "Diploma III Sistem Informasi";
        } else if (kode_prodi.equals("39015")) {
            this.prodi = "Diploma III Administrasi Perkantoran";
        } else if (kode_prodi.equals("43010")) {
            this.prodi = "Strata I Manajemen";
        } else if (kode_prodi.equals("43020")) {
            this.prodi = "Strata I Akuntansi";
        } else if (kode_prodi.equals("51016")) {
            this.prodi = "Diploma IV Produksi Film & TV";
        } else {
            System.out.println("Program Studi tidak dapat ditemukan dari NIM!");
            System.out.println("Harap masukkan Program Studi secara manual!");
            this.prodi = sc.nextLine();
        }
    }

    public int getSpp() {
        return spp;
    }

    public void setSpp() {
        Scanner sc = new Scanner(System.in);
        
        if (getAngkatan()>=17) {
            this.spp = 15000000;
        } else if (getAngkatan()<17) {
            this.spp = 12000000;
        } else {
            System.out.println("\nAngkatan tidak ditemukan!");
            System.out.println("Masukkan manual SPP mahasiswa "+getNim());
            this.spp = sc.nextInt(); sc.nextLine();
        }
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan() {
        this.angkatan = Integer.parseInt(getNim().substring(0,2));
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
        
    public void setAll() {
        setProdi();
        setAngkatan();
        setSpp();
    }
    
    public int getSPP() {
        this.bayar_spp_semester = (this.spp*this.semester);
        return this.bayar_spp_semester;
        /*
        Note :
        Angkatan >= 17 = 15.000.000
        Angkatan <  17 = 12.000.000
        */
    }
    
}
