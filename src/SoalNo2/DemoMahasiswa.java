package SoalNo2;

public class DemoMahasiswa {
    public static void main(String[] args) {
    Mahasiswa arrayMahasiswa[] = new Mahasiswa[4];

    //constructor ke1
    Mahasiswa mahasiswa1 = new Mahasiswa();
    mahasiswa1.setNama("Juki");
    mahasiswa1.setAsalsekolah("MA-ALHAMID");
    mahasiswa1.setUmur(17);

    //constructor ke 2
    Mahasiswa mahasiswa2 = new Mahasiswa("Devina");

    //constructor ke 3
    Mahasiswa mahasiswa3 = new Mahasiswa("Juna","SMA 7");
    Mahasiswa mahasiswa4 = new Mahasiswa("Arnold","SMA 23",18);

    arrayMahasiswa[0] = mahasiswa1;
    arrayMahasiswa[1] = mahasiswa2;
    arrayMahasiswa[2] = mahasiswa3;
    arrayMahasiswa[3] = mahasiswa4;

        for (Mahasiswa x : arrayMahasiswa) {
            System.out.println("Pendaftar Mahasiswa Baru ");
            System.out.println("Nama\t: "+ x.getNama());
            System.out.println("Asal Sekolah\t: "+ x.getAsalsekolah());
            System.out.println("Umur\t: "+ x.getUmur());
        }
    }
}