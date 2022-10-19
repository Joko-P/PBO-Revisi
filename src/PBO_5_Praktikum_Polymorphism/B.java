package PBO_5_Praktikum_Polymorphism;
public class B extends A {
    public void Bilang () {
        System.out.println("Ini bilang \"B\"");
    }
    
    public void Angka() {
        System.out.println("Angka random B : " + (Math.random()+5));
    }
    
    public void Test () {
        System.out.println("Ini print test");
    }
}
