package PBO_2;
public class Handphone {
    private String tipe, warna, kapasitas;
    
    public void setTipe(String Type){
        tipe = Type;
    }
    public void setWarna(String Colour){
        warna = Colour;
    }
    public void setKapasitas(String Capacity){
        kapasitas = Capacity;
    }
    
    public String getTipe(){
        return this.tipe;
    }
    public String getWarna(){
        return this.warna;
    }
    public String getKapasitas(){
        return this.kapasitas;
    }
}
