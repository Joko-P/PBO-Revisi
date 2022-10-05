package PBO_2;
public class Hewan {
    //ATTRIBUTE ATAU DATA
    private String tipe, suara;
    private int usia;
    
    //SETTER. Pasti memiliki parameter
    public void setTipe(String TipeInput){
        tipe = TipeInput;
    }
    public void setSuara(String SuaraInput){
        suara = SuaraInput;
    }
    public void setUsia(int UsiaInput){
        this.usia = UsiaInput;
    }
    
    //GETTER. Biasanya tidak memiliki parameter
    //Karena langsung mengambil data dari setter
    public String getTipe(){
        return this.tipe;
    }
    public String getSuara(){
        return suara;
    }
    public int getUsia(){
        return usia;
    }
    
}
