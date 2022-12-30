public class Motor {
    //Deklarasi Variabel Motor
    private int id_motor;
    private String merk_motor;
    private String produser;
    private int harga;

    //Mengambil Inputan Dengan Konstruktor
    public Motor(int id_motor, String merk_motor, String produser, int harga) {
        this.id_motor = id_motor;
        this.merk_motor = merk_motor;
        this.produser = produser;
        this.harga = harga;
    }

    //Mengambil Value Dari Variabel Pembeli
    public int getId_motor() {
        return id_motor;
    }
    public String getMerk_motor() {
        return merk_motor;
    }

    public String getProduser() {
        return produser;
    }

    public int getHarga() {
        return harga;
    }
}
