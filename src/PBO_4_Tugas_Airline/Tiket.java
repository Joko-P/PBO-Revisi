package PBO_4_Tugas_Airline;
import java.util.Date;
public class Tiket {
    private String bookingID, nik, nama, asal;
    private char sex;
    private Date depart, arrival;

    public Tiket(String bookingID, String nik, String nama, char sex, Date depart, Date arrival, String asal) {
        this.bookingID = bookingID;
        this.nik = nik;
        this.nama = nama;
        this.sex = sex;
        this.depart = depart;
        this.arrival = arrival;
        this.asal = asal;
    }
    
    public void getData() {
        System.out.println("Booking ID : " + this.getBookingID());
        System.out.println("NIK : " + this.getNik());
        System.out.println("Nama / Sex : " + this.getNama() + " / " + this.getSex());
        System.out.println("Kota Asal : " + this.getAsal());
        System.out.println("Tanggal Berangkat : " + this.getDepart());
        System.out.println("Tanggal Kembali : " + this.getArrival());
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