import java.util.Scanner;
public class MenampilkanAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input angka 
        System.out.print("masukkan angka pertama : ");
        int angka1 = scanner.nextInt();
        System.out.print("masukkan angka kedua : ");
        int angka2 = scanner.nextInt();
        //menetapkan nilai terkecil dan terbesar dari angka yang dimasukkan
        int start = Math.min(angka1, angka2);
        int end = Math.max(angka1, angka2);
        //output angka yang keluar antara angka terkecil dan terbesar
        System.out.println("nilai antara " + start + " dan " + end + " yaitu : ");
        int i = start;
        while (i <= end) {
            System.out.print(i + " ");
            i++; //terminasi
        }
    } 
}
