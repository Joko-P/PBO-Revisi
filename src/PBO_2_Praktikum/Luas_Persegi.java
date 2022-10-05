package PBO_2_Praktikum;
public class Luas_Persegi {
    private int panjang, lebar;

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
    public int LuasPersegi(){
        return (this.panjang*this.panjang);
    }
    
    public int LuasPersegiPanjang(){
        return (this.panjang*this.lebar);
    }
    
    public int LuasSegitiga(){
        Double a = new Double(this.lebar);
        Double b = new Double(this.panjang);
        return (int)(a*b*0.5);
    }
}
