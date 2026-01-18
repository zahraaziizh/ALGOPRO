import java.util.Scanner;
public class UTSKonversiUmur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input tanggal lahir
        System.out.print("Masukkan tanggal lahir (dd/mm/yyyy): ");
        int tanggallahir = scanner.nextInt();
        int bulanlahir = scanner.nextInt();
        int tahunlahir = scanner.nextInt();
        // input tanggal sekarang
        System.out.print("Masukkan tanggal sekarang (dd/mm/yyyy): ");
        int tanggalsekarang = scanner.nextInt();
        int bulansekarang = scanner.nextInt();
        int tahunsekarang = scanner.nextInt();
        // selisih tanggal lahir dan tanggal sekarang
        int umurtanggal = tanggalsekarang - tanggallahir;
        int umurbulan = bulansekarang - bulanlahir;
        int umurtahun = tahunsekarang - tahunlahir;
        // jika umur bulan negatif
        if (umurbulan < 0) {
            umurtahun--;
            umurbulan += 12;
        }
        // jika umur tanggal negatif
        if (umurtanggal < 0) {
            umurbulan--;
            umurtanggal += 30;
            // jika umur bulan menjadi negatif
            if (umurbulan < 0) {
                umurtahun--;
                umurbulan += 12;
            }
        }
        // output umur
        System.out.println("umur anda adalah : " + umurtahun + " tahun " + umurbulan + " bulan " + umurtanggal + " hari");
        // end main
        scanner.close();
    }
}
