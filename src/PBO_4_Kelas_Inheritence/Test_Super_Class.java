package PBO_4_Kelas_Inheritence;
public class Test_Super_Class {
    
    private String nama, keterangan;

    public Test_Super_Class(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }
    
    public void printAtt() {
        System.out.println("\nNama : " + getNama());
        System.out.println("Keterangan : " + getKeterangan());
    }

    public String getNama() {
        return nama;
    }

    public String getKeterangan() {
        return keterangan;
    }
    
    public void cetak() {
        System.out.println("Ini dari super class");
    }
    
    public void halo() {
        System.out.println("Hello world!");
    }
}
