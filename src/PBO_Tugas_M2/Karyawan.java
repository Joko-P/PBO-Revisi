package PBO_Tugas_M2;
public class Karyawan {
    private String nik, bagian;
    private int kehadiran, gaji_per_hari, totalGaji;

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getBagian() {
        return bagian;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public int getGaji_per_hari() {
        return gaji_per_hari;
    }

    public void setGaji_per_hari(int gaji_per_hari) {
        this.gaji_per_hari = gaji_per_hari;
    }
    
    public int getGaji() {
        this.totalGaji = getKehadiran()*getGaji_per_hari();
        return this.totalGaji;
    }
}
