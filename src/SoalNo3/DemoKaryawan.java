package SoalNo3;

public class DemoKaryawan {
    private static String nama = " Muhammad Juki";
    private static String agama = "Islam";
    private static String goldar = "A";
    private static String status = "Belum Menikah";

    private static int SetMinute(){
        int minute = 10;
        return minute;
    }

    public static void main(String[] args) {
        System.out.println("Biodata Karyawan");
        System.out.println("Nama\t\t:"+ nama);
        System.out.println("Agama\t\t:"+ agama);
        System.out.println("Gol Darah\t:"+ goldar);
        System.out.println("Status\t\t:"+ status);
        System.out.println("Set Minute\t:"+ SetMinute());
    }
}
