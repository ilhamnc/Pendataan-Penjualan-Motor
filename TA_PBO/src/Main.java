import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Deklarasi Variabel
        String[] email = new String[50];
        String[] nama_pembeli = new String[50];
        String[] no_hp = new String[50];
        String[] alamat = new String[50];
        int[] id_motor = new int[50];
        String[] merk_motor = new String[50];
        String[] produser = new String[50];
        int[] harga = new int[50];

        //Deklarasi Input
        Scanner inputString = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);

        //Input Tanggal Saat Menggunakan Aplikasi
        System.out.println("Hari/Tanggal : ");
        String tgl = inputString.nextLine();
        System.out.println();

        //Input Data Pegawai
        System.out.println("DATA PEGAWAI SEBAGAI ADMIN");
        System.out.print("NIP    : ");
        int nip = inputInt.nextInt();
        System.out.print("Nama   : ");
        String nama_pegawai = inputString.nextLine();
        System.out.print("Divisi : ");
        String divisi = inputString.nextLine();
        System.out.println();
        int j = 0;
        String pilih;
        System.out.print("Isi penjualan hari ini ? (Y/N) ");

        System.out.println("PEMBELIAN MOTOR");
        System.out.println("============================================");
        pilih = inputString.nextLine().toUpperCase();
        while (pilih.equals("Y")){
            System.out.println();

            //Input Data Pembeli
            System.out.println("DATA PEMBELI");
            System.out.print("Email      : ");
            email[j] = inputString.nextLine();
            System.out.print("Nama       : ");
            nama_pembeli[j] = inputString.nextLine();
            System.out.print("No HP      : ");
            no_hp[j] = inputString.nextLine();
            System.out.print("Alamat     : ");
            alamat[j] = inputString.nextLine();
            System.out.println();

            //Input Data Motor Yang Dibeli
            System.out.println("DATA MOTOR");
            System.out.print("ID Motor   : ");
            id_motor[j] = inputInt.nextInt();
            System.out.print("Merk Motor : ");
            merk_motor[j] = inputString.nextLine();
            System.out.print("Produser   : ");
            produser[j] = inputString.nextLine();
            System.out.print("Harga      : ");
            harga[j] = inputInt.nextInt();
            System.out.println();
            System.out.println();

            j++;
            System.out.println("Lanjut (Y)  ||  Simpan(N)");
            System.out.print("=> ");
            pilih = inputString.nextLine().toUpperCase();
        }
        System.out.println();
        System.out.println("============================================");

        //Deklarasi Konstruktor
        Penjualan date = new Penjualan(tgl);
        Pegawai pg = new Pegawai(nip, nama_pegawai, divisi);
        ArrayList<Pembeli> pembeliList = new ArrayList<>();
        ArrayList<Motor> motorList = new ArrayList<>();

        //Input Array Data Ke Class Pembeli, Pegawai, Dan Motor
        for(int i = 0; i < j; i++) {
            pembeliList.add(new Pembeli(email[i], nama_pembeli[i], no_hp[i], alamat[i]));
            motorList.add(new Motor(id_motor[i], merk_motor[i], produser[i], harga[i]));
        }
        date.input(pembeliList, pg, motorList);
        System.out.println();

        //Menampilkan Dan Menampilkan Data Penjualan
        date.displayData();
        date.cetakData();
    }
}