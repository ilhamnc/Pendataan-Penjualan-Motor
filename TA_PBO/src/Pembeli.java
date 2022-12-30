public class Pembeli {
    //Deklarasi Variabel Pembeli
    private String email;
    private String nama_pembeli;
    private String no_hp;
    private String alamat;

    //Mengambil Inputan Dengan Konstruktor
    public Pembeli(String email, String nama_pembeli, String no_hp, String alamat) {
        this.email = email;
        this.nama_pembeli = nama_pembeli;
        this.no_hp = no_hp;
        this.alamat = alamat;
    }

    //Mengambil Value Dari Variabel Pembeli
    public String getEmail() {
        return email;
    }

    public String getNama_pembeli() {
        return nama_pembeli;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public String getAlamat() {
        return alamat;
    }
}
