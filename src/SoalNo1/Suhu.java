package SoalNo1;

public class Suhu {
    double celsius,farenheit,kelvin,reamur;

    public Suhu(int celsius,int farenheit,int kelvin, int reamur){
        this.celsius = celsius;
        this.farenheit = farenheit;
        this.kelvin = kelvin;
        this.reamur = reamur;
    }

    //passed by reference
    void konversi (Suhu suhu){
        suhu.celsius = 1.8 + 32;
        suhu.farenheit = 0.56 *(farenheit-32)+273;
        suhu.kelvin = 0.8*(kelvin-273);
        suhu.reamur = 1.25*reamur;
    }
}
