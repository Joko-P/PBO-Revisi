package PBO_5_Polymorphism_Airline;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Tiket_Main {
    
    private static void Jeda(double a) {
        try {
            Thread.sleep((long)a*1000);
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
    private static boolean IsNumeric(String str){
        try {
        Double.parseDouble(str);
        return true;
        } catch(NumberFormatException e) {
        return false;
        }
    }
    
    private static boolean IsDate(String str){
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        try {
            df.parse(str);
            return true;
        } catch(ParseException e) {
            return false;
        }
    }
    
    private static String IDGenerator(String prefix, Date a) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String strDate = dateFormat.format(a);  
        String final_id = prefix + strDate;
        return(final_id);
    }
    
    private static String NIKGenerator() {
        Random ran = new Random();
        int a = ran.nextInt(89999999) + 10000000;
        int b = ran.nextInt(89999999) + 10000000;
        String NIK = String.valueOf(a) + String.valueOf(b);
        return(NIK);
    }
    
    private static String PlaneGenerator(String prefix) {
        Random ran = new Random();
        int seri = ran.nextInt(899) + 100;
        return(prefix + String.valueOf(seri));
    }
    
    public static void main(String args[]) {
        String city_1 = null;
        String city_2 = null;
        Date date_1 = null;
        Date date_2 = null;
        char yesno = 'y', maskapai, sex;
        boolean kondisi;
        Scanner sc = new Scanner(System.in);
        int jml = 0;
        String plane_no = null, seat = null;
        Random ran = new Random();
        
        do {
            System.out.println("\n===== PEMESANAN TIKET =====\n");
            
            //Memasukkan Jumlah Penumpang
            do {
                System.out.print("\nMasukkan jumlah penumpang! ");
                String jml_string = sc.nextLine();
                if (IsNumeric(jml_string) == true) {
                    jml = Integer.parseInt(jml_string);
                    if (jml < 1) {
                        System.out.println("Harap masukkan jumlah > 0");
                        kondisi = true;
                    } else {
                        kondisi = false;
                    }
                } else {
                    System.out.println("Harap masukkan angka!");
                    kondisi = true;
                }
            } while (kondisi == true);
            
            //Memilih Kota Keberangkatan
            do {
                System.out.println("\nKota Keberangkatan :");
                System.out.println("1. Surabaya");
                System.out.println("2. Jakarta");
                System.out.print("Pilih kota asal! ");
                String jml_string = sc.nextLine();
                if (IsNumeric(jml_string) == true) {
                    int pilkot = Integer.parseInt(jml_string);
                    if (pilkot == 1) {
                        city_1 = "Surabaya";
                        kondisi = false;
                    } else if (pilkot == 2) {
                        city_1 = "Jakarta";
                        kondisi = false;
                    } else {
                        System.out.println("Harap masukkan angka yang benar!");
                        kondisi = true;
                    }
                } else {
                    System.out.println("Harap masukkan angka!");
                    kondisi = true;
                }
            } while (kondisi == true);
            
            //Memilih Kota Tujuan
            if (city_1.equalsIgnoreCase("Surabaya")) {
                System.out.println("\nKota Tujuan :");
                System.out.println("Bali, Lombok, Yogyakarta, Balikpapan, Makassar, Jakarta");
                do {
                    System.out.print("Masukkan kota tujuan : ");
                    city_2 = sc.nextLine();
                    if (city_2.toLowerCase().matches("bali|lombok|yogyakarta|balikpapan|makassar|jakarta")) {
                        city_2 = city_2.substring(0,1).toUpperCase() + city_2.substring(1).toLowerCase();
                        kondisi = false;
                    } else {
                        System.out.println("Kota tidak terdaftar! Harap ulangi!");
                        kondisi = true;
                    }
                } while (kondisi == true);
            } else if (city_1.equalsIgnoreCase("Jakarta")) {
                System.out.println("\nKota Tujuan :");
                System.out.println("Bali, Lombok, Yogyakarta, Balikpapan, Makassar, Surabaya");
                do {
                    System.out.print("Masukkan kota tujuan : ");
                    city_2 = sc.nextLine();
                    if (city_2.toLowerCase().matches("bali|lombok|yogyakarta|balikpapan|makassar|surabaya")) {
                        city_2 = city_2.substring(0,1).toUpperCase() + city_2.substring(1).toLowerCase();
                        kondisi = false;
                    } else {
                        System.out.println("Kota tidak terdaftar! Harap ulangi!");
                        kondisi = true;
                    }
                } while (kondisi == true);
            } else {
                continue;
            }
            
            //Memasukkan Tanggal Keberangkatan
            do {
                SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy kk:mm");
                System.out.println("Harap Masukkan tanggal berangkat sesuai format!");
                System.out.println("Contoh format : \"31-12-2001 23:59\"");
                String dates = sc.nextLine();
                if (IsDate(dates) == true) {
                    try {
                        date_1 = df.parse(dates);
                    } catch (ParseException ex) {
                        Logger.getLogger(Tiket_Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    kondisi = false;
                } else {
                    System.out.println("Format tanggal salah!");
                    kondisi = true;
                }
            } while (kondisi == true);
            
            //Penentuan Tiket Kembali juga atau tidak
            do {
                System.out.println("Pesan pulang-pergi? (Y/N)");
                yesno = sc.nextLine().charAt(0);
                if (yesno != 'y' && yesno!= 'Y' && yesno != 'n' && yesno != 'N') {
                    System.out.println("Pilihan invalid! Harap ulangi!");
                }
            } while (yesno != 'y' && yesno!= 'Y' && yesno != 'n' && yesno != 'N');
            
            //Memasukkan Tanggal Kembali
            if (yesno == 'Y' || yesno == 'y') {
                do {
                    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy kk:mm");
                    System.out.println("Harap Masukkan tanggal kembali sesuai format!");
                    System.out.println("Contoh format : \"31-12-2001 23:59\"");
                    String dates = sc.nextLine();
                    if (IsDate(dates) == true) {
                        try {
                            date_2 = df.parse(dates);
                        } catch (ParseException ex) {
                            Logger.getLogger(Tiket_Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        //Cek Kevalidan Tanggal
                        if (date_2.after(date_1)) {
                            kondisi = false;
                        } else {
                            System.out.println("Tanggal kembali tidak bisa lebih awal dari tanngal berangkat!");
                            kondisi = true;
                        }
                    } else {
                        System.out.println("Format tanggal salah!");
                        kondisi = true;
                    }
                } while (kondisi == true);
            } else if (yesno == 'N' || yesno == 'n') {
                date_2 = null;
            } else {
                continue;
            }
            
            //Pilih Maskapai
            do {
                System.out.println("\n===== PILIH MASKAPAI =====\n");
                System.out.println("1. Lion Air");
                System.out.println("2. Citilink");
                System.out.print("Pilih Maskapai : ");
                maskapai = sc.nextLine().charAt(0);
                if (maskapai == '1' || maskapai == '2') {
                    kondisi = false;
                } else {
                    System.out.println("Harap masukkan maskapai yang tersedia!");
                    kondisi = true;
                }
            } while (kondisi == true);
            
            if (maskapai == '1') {
                System.out.println("\n===== SELAMAT DATANG DI LION AIR =====\n");
                System.out.println("Silahkan isi data penumpang!");
                Airline_Template Ticket[] = new Lion_Air[jml];
                plane_no = PlaneGenerator("JT");
                int acak = ran.nextInt(50);
                
                for (int i = 0; i < Ticket.length; i++) {
                    String bookingID = IDGenerator("LION", date_1) + String.valueOf(i+1);
                    System.out.println("\nBooking ID : " + bookingID);
                    String nik = NIKGenerator();
                    System.out.println("NIK : " + nik);
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    do {
                        System.out.print("Jenis Kelamin (L/P) : ");
                        sex = sc.nextLine().charAt(0);
                        if (sex == 'P' || sex == 'p' || sex == 'L' || sex == 'l') {
                            kondisi = false;
                        } else {
                            System.out.println("Jenis Kelamin Invalid!");
                            kondisi = true;
                        }
                    } while (kondisi == true);
                    seat = String.valueOf(i + acak);

                    Ticket[i].Insert_Data(jml, city_2, plane_no, seat, bookingID, nik, nama, sex, date_1, date_2, city_1);
                }
                
                for (int i = 0; i < Ticket.length; i++) {
                    Ticket[i].getData();
                }
                
                System.out.println("\nTotal : Rp " + Ticket[0].getTotal());
            } else if (maskapai == '2') {
                System.out.println("\n===== SELAMAT DATANG DI CITILINK =====\n");
                System.out.println("Silahkan isi data penumpang!");
                Airline_Template Ticket[] = new Citilink[jml];
                plane_no = PlaneGenerator("QG");
                int acak = ran.nextInt(50);
                
                for (int i = 0; i < Ticket.length; i++) {
                    String bookingID = IDGenerator("CITI", date_1) + String.valueOf(i+1);
                    System.out.println("\nBooking ID : " + bookingID);
                    String nik = NIKGenerator();
                    System.out.println("NIK : " + nik);
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    do {
                        System.out.print("Jenis Kelamin (L/P) : ");
                        sex = sc.nextLine().charAt(0);
                        if (sex == 'P' || sex == 'p' || sex == 'L' || sex == 'l') {
                            kondisi = false;
                        } else {
                            System.out.println("Jenis Kelamin Invalid!");
                            kondisi = true;
                        }
                    } while (kondisi == true);
                    seat = String.valueOf(i + acak);

                    Ticket[i].Insert_Data(jml, city_2, plane_no, seat, bookingID, nik, nama, sex, date_1, date_2, city_1);
                }
                
                for (int i = 0; i < Ticket.length; i++) {
                    Ticket[i].getData();
                }
                
                System.out.println("\nTotal : Rp " + Ticket[0].getTotal());
            } else {
                continue;
            }
            
            //Pesan Lagi?
            System.out.println("Pesan lagi? (Y/N)");
            yesno = sc.nextLine().charAt(0);
        } while (yesno == 'Y' || yesno == 'y');
        
        System.out.println("\nGood Bye!");
        Jeda(2.5);
    }
}