package PBO_2_Praktikum;
public class Luas_Lingkaran {
    private double rusuk;
    final private double phi = 3.14;

    public Luas_Lingkaran(double rusuk){
        this.rusuk = rusuk;
    }
    
    public void setRusuk(double rusuk) {
        this.rusuk = rusuk;
    }
    
    public double LuasLingkaran(){
        return (rusuk*rusuk*phi);
    }
}
