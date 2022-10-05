package PBO_4_Kelas_Inheritence;
public class Test_Subclass extends Test_Super_Class {
    
    private int angka;
    
    public Test_Subclass(String nama, String keterangan, int angka) {
        super(nama, keterangan);
        this.angka = angka;
    }

    public int getAngka() {
        return angka;
    }
    
    @Override
    public void cetak() {
        super.cetak();
    }

    @Override
    public void halo() {
        super.halo();
    }
    
    public void cetakAttv2() {
        System.out.println("\nName : " + super.getNama());
        System.out.println("Description : " + super.getKeterangan());
        System.out.println("Random number : " + this.getAngka());
    }
}
