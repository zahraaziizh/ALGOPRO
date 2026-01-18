import java.util.Scanner;

public class HitungNilaiArray {
    public static void main(String[] args) {
        //membuat objek scanner untuk membaca input
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan banyak siswa : ");
        int n = scanner.nextInt();
        double jumlah = 0, rata;
        double [] nilai = new double[n+1];
        String [] nama = new String[n+1];
        //inputan data
        for (int i = 1; i <= n; i++){
            System.out.print("input nama ke - " + i + ": ");
            nama[i] = scanner.next();}
            for (int i = 1; i <= n; i++){
            System.out.print("input nilai ke - " + i + ": ");
            nilai [i] = scanner.nextDouble();
            jumlah = jumlah + nilai[i];
        } 
        //proses hitung
        for (int i=1; i < nilai.length; i++){
            jumlah = jumlah + nilai [i];
        }
        rata = jumlah/n;
        //output hasil
        for (int i=1; i< nilai.length; i++){
            System.out.println("----------------------------------");
            System.out.println("nama siswa ke- " + i + " :" + nama[i]);
            System.out.println("nilai siswa ke- " + i + " :" + nilai[i]);
        }
        System.out.println("================================");
        System.out.println("rata rata siswa : " + rata);
    }
    
}
