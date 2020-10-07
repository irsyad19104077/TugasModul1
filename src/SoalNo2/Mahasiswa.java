package SoalNo2;

public class Mahasiswa {
    private String nama,asalsekolah;
    private int umur;
    //1
    public Mahasiswa(){}
    //2
    public Mahasiswa(String nama) {
        this.nama = nama;

    }
    //3
    public Mahasiswa(String nama, String asalsekolah) {
        this.nama = nama;
        this.asalsekolah = asalsekolah;

    }
    //4
    public Mahasiswa(String nama, String asalsekolah, int umur) {
        this.nama = nama;
        this.asalsekolah = asalsekolah;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAsalsekolah() {
        return asalsekolah;
    }

    public void setAsalsekolah(String asalsekolah) {
        this.asalsekolah = asalsekolah;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
