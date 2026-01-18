import java.util.Scanner;
public class PenjumlahanAritmatika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input
        System.out.print("masukkan nilai awal (a): ");
        int a = scanner.nextInt();
        System.out.print("masukkan beda (b): ");
        int b = scanner.nextInt();
        System.out.print("masukkan jumlah suku (n): ");
        int n = scanner.nextInt();
        //variabel untuk menyimpan hasil perhitungan
        int hasil = 0; 
        //perulangan untuk menghitung penjuml1ahan deret aritmatika
        for (int i =0; i < n; i++){
            //menghitung suku ke-i
            int suku = a + (i*b);
            //menambahkan suku ke hasil
            hasil += suku;
        }
        //mencetak hasil penjumlahan
        System.out.println("hasil penjumlahan deret aritmatika adalah: " + hasil );
    }
    
}
