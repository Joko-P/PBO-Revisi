package PBO_5_Praktikum_Polymorphism;
public class MainClass {
    public static void main(String[] args) {
        A item = new B();
        
        item.Angka();
        item.Bilang();
        
        B items = new B();
        
        items.Angka();
        items.Bilang();
        items.Test();
    }
    
}
