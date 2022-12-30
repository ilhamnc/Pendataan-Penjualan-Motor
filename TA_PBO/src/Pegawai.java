public class Pegawai {
    //Deklarasi Variabel Pegawai
    private int nip;
    private String nama_pegawai;
    private String divisi;

    //Mengambil Inputan Dengan Konstruktor
    public Pegawai(int nip, String nama_pegawai, String divisi) {
        this.nip = nip;
        this.nama_pegawai = nama_pegawai;
        this.divisi = divisi;
    }

    //Mengambil Value Dari Variabel Pembeli
    public int getNip() {
        return nip;
    }

    public String getNama_pegawai() {
        return nama_pegawai;
    }

    public String getDivisi() {
        return divisi;
    }
}
