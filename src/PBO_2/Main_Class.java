package PBO_2;
public class Main_Class {
    public static void main(String[] args) {
        /*
        Untuk bisa akses kelas Hewan dkk. perlu membuat object atau instance of class
        Buatnya di dalam public static void main.        
        */
        
        //Akses suara, tipe, dan usia dari class Hewan
        Hewan Animal_1 = new Hewan();
        Hewan Animal_2 = new Hewan();
        
        //Akses method dari class Burung dan Ikan
        Burung Bird = new Burung();
        Ikan Fish = new Ikan();
        
        //Cara mengisi attribute/data
        Animal_1.setTipe("Burung Merak");
        Animal_1.setSuara("Cock and Balls!");
        Animal_1.setUsia(2);
        Animal_2.setTipe("Iwak Lele");
        Animal_2.setSuara("Shidded and Cummed");
        Animal_2.setUsia(1);
        
        //Cara ambil data dari setter
        System.out.println("Aku adalah "+Animal_1.getTipe());
        System.out.println("Suaraku "+Animal_1.getSuara());
        System.out.println("Umurku "+Animal_1.getUsia());
        System.out.println("My quote :");
        Bird.terbang();
    }
    
}
