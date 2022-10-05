package PBO_Praktikum_3_Constructor;
public class Rumus_Kubus {
    double panjang, lebar, tinggi;

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double getTinggi() {
        return tinggi;
    }
    
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public Rumus_Kubus() {
        this.lebar = 20;
        this.panjang = 30;
        this.tinggi = 50;
    }
    
    public Rumus_Kubus(double a, double b, double c) {
        this.lebar = a;
        this.panjang = b;
        this.tinggi = c;
    }
    
    public double getRumus_Kubus () {
        return(getLebar()*getPanjang()*getTinggi());
    }
}
