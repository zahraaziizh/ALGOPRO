import java.util.Scanner;
public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan suhu dalam Celcius: ");
        double celcius = input.nextDouble();
        System.out.println("Pilih jenis konversi:");
        System.out.println("1. Ke Kelvin");
        System.out.println("2. Ke Reamur");
        System.out.println("3. Ke Fahrenheit");
        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = input.nextInt();
        double hasil;
        if (pilihan == 1) {
            hasil = celcius + 273.15;
            System.out.println(celcius + " derajat Celcius = " + hasil + " Kelvin");
        } else if (pilihan == 2) {
            hasil = (4.0 / 5.0) * celcius;
            System.out.println(celcius + " derajat Celcius = " + hasil + " Reamur");
        } else if (pilihan == 3) {
            hasil = (9.0 / 5.0) * celcius + 32;
            System.out.println(celcius + " derajat Celcius = " + hasil + " Fahrenheit");
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}