package SoalNo1;

import java.util.Scanner;

public class DemoSuhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Celsius: ");
        int c = scanner.nextInt();
        System.out.print("Masukan Farenheit: ");
        int f = scanner.nextInt();
        System.out.print("Masukan Kelvin: ");
        int k = scanner.nextInt();
        System.out.print("Masukan Reamur: ");
        int r = scanner.nextInt();

        System.out.println();

        Suhu suhu = new Suhu(c,f,k,r);
        System.out.println("Nilai Sebelum di Konversi ");
        System.out.println("Celsius\t\t: "+suhu.celsius);
        System.out.println("Farenheit\t: "+suhu.farenheit);
        System.out.println("Kelvin\t\t: "+suhu.kelvin);
        System.out.println("Reamur\t\t: "+suhu.reamur);

        suhu.konversi(suhu);
        System.out.println("Nilai Sesudah di Konversi ");
        System.out.println("C -> F : "+ suhu.celsius+"F");
        System.out.println("F -> K : "+ suhu.farenheit+"K");
        System.out.println("K -> R : "+ suhu.kelvin+"R");
        System.out.println("R -> C : "+ suhu.reamur+"C");
    }
}
