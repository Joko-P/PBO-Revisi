package PBO_6_Airline_Poly_Rombak_Total;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
public class Tiket {
    String bookingID, nik, nama, asal;
    char sex;
    Date depart, arrival;

    public Tiket(String bookingID, String nik, String nama, char sex, Date depart, Date arrival, String asal) {
        this.bookingID = bookingID;
        this.nik = nik;
        this.nama = nama;
        this.sex = sex;
        this.depart = depart;
        this.arrival = arrival;
        this.asal = asal;
    }
    
    public String NIKGenerator() {
        Random ran = new Random();
        int a = ran.nextInt(89999999) + 10000000;
        int b = ran.nextInt(89999999) + 10000000;
        String NIK = String.valueOf(a) + String.valueOf(b);
        return(NIK);
    }
    
    public String IDGenerator(String prefix, Date a) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String strDate = dateFormat.format(a);  
        String final_id = prefix + strDate;
        return(final_id);
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