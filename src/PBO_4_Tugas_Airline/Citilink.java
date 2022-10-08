package PBO_4_Tugas_Airline;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Citilink extends Tiket{
    private int passenger_amount, harga, total;
    private String tujuan, plane_no, seat;

    public Citilink(int passenger_amount, String tujuan, String plane_no, String seat, String bookingID, String nik, String nama, char sex, Date depart, Date arrival, String asal) {
        super(bookingID, nik, nama, sex, depart, arrival, asal);
        this.passenger_amount = passenger_amount;
        this.tujuan = tujuan;
        this.plane_no = plane_no;
        this.seat = seat;
    }
    
    @Override
    public void getData() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        System.out.println("\n===== PREVIEW TIKET CITILINK =====");
        System.out.println("Booking ID : " + this.getBookingID());
        System.out.println("NIK : " + this.getNik());
        System.out.println("Nama / Sex : " + this.getNama() + " / " + this.getSex());
        System.out.println("Kota Asal : " + this.getAsal());
        System.out.println("Kota Tujuan : " + this.getTujuan());
        System.out.println("Tanggal Berangkat : " + dateFormat.format(this.getDepart()));
        System.out.println("Tanggal Kembali : " + dateFormat.format(this.getArrival()));
        System.out.println("Nomor Penerbangan : " + this.getPlane_no());
        System.out.println("Nomor Kursi : " + this.getSeat());
        System.out.println("Harga Tiket : Rp " + this.getHarga());
    }

    public int getPassenger_amount() {
        return passenger_amount;
    }
    
    public int TentukanHarga (String asal, String tujuan) {
        if (asal.equalsIgnoreCase("surabaya")) {
            if (tujuan.equalsIgnoreCase("bali") || tujuan.equalsIgnoreCase("lombok")) {
                this.harga = 700000;
            } else if (tujuan.equalsIgnoreCase("jakarta") || tujuan.equalsIgnoreCase("yogyakarta")) {
                this.harga = 800000;
            } else if (tujuan.equalsIgnoreCase("balikpapan") || tujuan.equalsIgnoreCase("makassar")) {
                this.harga = 850000;
            } else {
                this.harga = 0;
            }
        } else if (asal.equalsIgnoreCase("jakarta")) {
            if (tujuan.equalsIgnoreCase("bali") || tujuan.equalsIgnoreCase("lombok")) {
                this.harga = 1000000;
            } else if (tujuan.equalsIgnoreCase("surabaya") || tujuan.equalsIgnoreCase("yogyakarta")) {
                this.harga = 750000;
            } else if (tujuan.equalsIgnoreCase("balikpapan") || tujuan.equalsIgnoreCase("makassar")) {
                this.harga = 900000;
            } else {
                this.harga = 0;
            }
        } else {
            this.harga = 0;
        }
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
    
}
