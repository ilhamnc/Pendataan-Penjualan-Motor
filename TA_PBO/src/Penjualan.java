import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class Penjualan {
    //Deklarasi Variabel
    private String tgl_penjualan;
    private Pegawai pegawai;
    private ArrayList<Pembeli> pembeli = new ArrayList<>();
    private ArrayList<Motor> motor = new ArrayList<>();
    public int no;

    //Mengambil Inputan Dengan Konstruktor
    public Penjualan(String tgl_penjualan) {
        this.tgl_penjualan = tgl_penjualan;
    }

    //Mengambil Value Dari Class Pembeli, Pegawai, Dan Motor
    public void input(ArrayList<Pembeli> pembeli, Pegawai pegawai, ArrayList<Motor> motor) {
        this.pembeli = pembeli;
        this.pegawai = pegawai;
        this.motor = motor;
    }
    public ArrayList<Pembeli> getPembeli() {
        return pembeli;
    }
    public Pegawai getPegawai() {
        return pegawai;
    }
    public ArrayList<Motor> getMotor() {
        return motor;
    }

    //Method Untuk Menampilkan Data Penjualan
    public void displayData() {
        System.out.println("-------------------------------------------------------------");
        System.out.println("| No | Tanggal\t\t| Email Pembeli\t\t| NIP\t| ID Motor\t|");
        System.out.println("-------------------------------------------------------------");
        no = 1;
        Iterator data_pembeli = this.getPembeli().iterator();
        Iterator data_motor = this.getMotor().iterator();

        while (data_pembeli.hasNext() && data_motor.hasNext()) {
            Pembeli pb = (Pembeli)data_pembeli.next();
            Motor mt = (Motor) data_motor.next();
            System.out.println("| "+no+" | "+tgl_penjualan+"\t| "+pb.getEmail()+"\t| "+getPegawai().getNip()+"\t| "+mt.getId_motor()+"\t\t| ");
            System.out.println("-------------------------------------------------------------");
            no++;
        }
    }

    //Method Untuk Mencetak Data Penjualan
    public void cetakData() {
        try {
            FileWriter File = new FileWriter("DataPenjualan.txt");
            File.write("DATA PEMBELIAN MOTOR\n");
            File.write("-------------------------------------------------------------\n");
            File.write("| No | Tanggal\t\t| Email Pembeli\t\t| NIP\t| ID Motor\t|\n");
            File.write("-------------------------------------------------------------\n");
            no = 1;
            Iterator data_pembeli = this.getPembeli().iterator();
            Iterator data_motor = this.getMotor().iterator();

            while (data_pembeli.hasNext() && data_motor.hasNext()) {
                Pembeli pb = (Pembeli)data_pembeli.next();
                Motor mt = (Motor) data_motor.next();
                File.write("| "+no+" | "+tgl_penjualan+"\t| "+pb.getEmail()+"\t| "+getPegawai().getNip()+"\t| "+mt.getId_motor()+"\t\t|\n");
                File.write("-------------------------------------------------------------\n");
                no++;
            }
            File.close();
            System.out.println("Data Penjualan Sukses Dicetak");
        } catch (Exception e) {
            System.out.println("File belum dibuat");
        }
    }
}
