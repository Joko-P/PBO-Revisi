package PBO_5_Polymorphism_Airline;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Airline_Template{
    int passenger_amount, harga, total;
    String tujuan, plane_no, seat;
    String bookingID, nik, nama, asal;
    char sex;
    Date depart, arrival;

    public Airline_Template(int passenger_amount, String tujuan, String plane_no, String seat, String bookingID, String nik, String nama, char sex, Date depart, Date arrival, String asal) {
        this.passenger_amount = passenger_amount;
        this.tujuan = tujuan;
        this.plane_no = plane_no;
        this.seat = seat;
        this.bookingID = bookingID;
        this.nik = nik;
        this.nama = nama;
        this.sex = sex;
        this.depart = depart;
        this.arrival = arrival;
        this.asal = asal;
    }
    
    public void getData() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        System.out.println("\n===== PREVIEW TIKET UNKNOWN =====");
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

    public int getPassenger_amount() {
        return passenger_amount;
    }
    
    public int TentukanHarga (String asal, String tujuan) {
        this.harga = 0;
        return harga;
    }
    
    public int getHarga() {
        TentukanHarga(this.getAsal(), this.getTujuan());
        return harga;
    }
    
    public int getTotal() {
        this.total = this.getHarga()*this.getPassenger_amount();
        return total;
    }

    public String getTujuan() {
        return tujuan;
    }

    public String getPlane_no() {
        return plane_no;
    }

    public String getSeat() {
        return seat;
    }
    
    public String getBookingID() {
        return bookingID;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public char getSex() {
        return sex;
    }

    public Date getDepart() {
        return depart;
    }

    public Date getArrival() {
        return arrival;
    }

    public String getAsal() {
        return asal;
    }
}