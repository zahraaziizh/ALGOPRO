import java.util.Scanner;
public class Latihan1 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        //input nama pelanggan
        System.out.print("Masukkan nama pelanggan : ");
        String nama = data.nextLine();
        //input harga barang
        System.out.print("Masukkan harga barang 1 : ");
        int barang1 = data.nextInt();
        System.out.print("Masukkan harga barang 2 : ");
        int barang2 = data.nextInt();
        System.out.print("Masukkan harga barang 3 : ");
        int barang3 = data.nextInt();
        System.out.print("Masukkan harga barang 4 : ");
        int barang4 = data.nextInt();
        System.out.print("Masukkan harga barang 5 : ");
        int barang5 = data.nextInt();
        //total harga
        int total = barang1+barang2+barang3+barang4+barang5;
        //output
        System.out.println("-----------------------------------------------------");
        System.out.println("             Kharisma Agung Plaza (KAP)              ");
        System.out.println("               Promo Belanja Berhadiah               ");
        System.out.println("           Khusus Pembelian 5 Barang Pertama         ");
        System.out.println("             Dengan Harga Minimum 100000,00          ");
        System.out.println("-----------------------------------------------------");
        System.out.println("Masukkan nama pelanggan : " + nama);
        System.out.println("Masukkan harga barang ke-1 : " + barang1);
        System.out.println("Masukkan harga barang ke-2 : " + barang2);
        System.out.println("Masukkan harga barang ke-3 : " + barang3);
        System.out.println("Masukkan harga barang ke-4 : " + barang4);
        System.out.println("Masukkan harga barang ke-5 : " + barang5);
        System.out.println("Total harga pembelian atas nama " + nama + " adalah " + total);
        if (total >= 100000) {
            System.out.println("Selamat ...");
            System.out.println("Anda mendapat hadiah 1 buah mug cantik");
            System.out.println("-----------------------------------------------------");
            System.out.println("                      Terima Kasih                   ");
            System.out.println("    Anda sudah berbelanja di Kharisma Agung Plaza    ");}
        else { 
            System.out.println("-----------------------------------------------------");
            System.out.println("                      Terima Kasih                   ");
            System.out.println("    Anda sudah berbelanja di Kharisma Agung Plaza    ");} 
    }
}