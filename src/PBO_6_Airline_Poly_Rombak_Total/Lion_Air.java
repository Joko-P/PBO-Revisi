package PBO_6_Airline_Poly_Rombak_Total;
import java.text.SimpleDateFormat;
import java.util.*;
public class Lion_Air extends Airline_Template {

    public Lion_Air(int passenger_amount, String tujuan, String plane_no, String seat, String bookingID, String nik, String nama, char sex, Date depart, Date arrival, String asal) {
        super(passenger_amount, tujuan, plane_no, seat, bookingID, nik, nama, sex, depart, arrival, asal);
    }
    
    public void InputData(int i, int jml, String city_1, String city_2, int panjang, Date date_1, Date date_2, int acak, String plane_no) {
        Scanner sc = new Scanner(System.in);
        boolean kondisi;
        
        bookingID = IDGenerator("LION", date_1) + String.valueOf(i+1);
        System.out.println("\nBooking ID : " + bookingID);
        nik = NIKGenerator();
        System.out.println("NIK : " + nik);
        System.out.print("Nama : ");
        nama = sc.nextLine();
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
    }
    
    public void getData() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        System.out.println("\n===== PREVIEW TIKET LION AIR =====");
        System.out.println("Booking ID : " + this.getBookingID());
        System.out.println("NIK : " + this.getNik());
        System.out.println("Nama / Sex : " + this.getNama() + " / " + this.getSex());
        System.out.println("Kota Asal : " + this.getAsal());
        System.out.println("Kota Tujuan : " + this.getTujuan());
        System.out.println("Tanggal Berangkat : " + dateFormat.format(this.getDepart()));
        if (this.getArrival() != null) {
            System.out.println("Tanggal Kembali : " + dateFormat.format(this.getArrival()));
        }
        System.out.println("Nomor Penerbangan : " + this.getPlane_no());
        System.out.println("Nomor Kursi : " + this.getSeat());
        System.out.println("Harga Tiket : Rp " + this.getHarga());
    }
    
    public int TentukanHarga (String asal, String tujuan) {
        if (asal.equalsIgnoreCase("surabaya")) {
            if (tujuan.equalsIgnoreCase("bali") || tujuan.equalsIgnoreCase("lombok")) {
                this.harga = 500000;
            } else if (tujuan.equalsIgnoreCase("jakarta") || tujuan.equalsIgnoreCase("yogyakarta")) {
                this.harga = 600000;
            } else if (tujuan.equalsIgnoreCase("balikpapan") || tujuan.equalsIgnoreCase("makassar")) {
                this.harga = 700000;
            } else {
                this.harga = 0;
            }
        } else if (asal.equalsIgnoreCase("jakarta")) {
            if (tujuan.equalsIgnoreCase("bali") || tujuan.equalsIgnoreCase("lombok")) {
                this.harga = 700000;
            } else if (tujuan.equalsIgnoreCase("surabaya") || tujuan.equalsIgnoreCase("yogyakarta")) {
                this.harga = 750000;
            } else if (tujuan.equalsIgnoreCase("balikpapan") || tujuan.equalsIgnoreCase("makassar")) {
                this.harga = 800000;
            } else {
                this.harga = 0;
            }
        } else {
            this.harga = 0;
        }
        return harga;
    }
    
}