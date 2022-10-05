package PBO_2;
public class Samsung {
    private int harga, jumlah, total;
    
    public void setHarga(int price){
        this.harga = price;
    }
    public void setJumlah(int quantity){
        this.jumlah = quantity;
    }
    
    public int getHarga(){
        return this.harga;
    }
    public int getJumlah(){
        return this.jumlah;
    }
    
    public int getBeli(){
        return (this.harga*this.jumlah);
    }
}
