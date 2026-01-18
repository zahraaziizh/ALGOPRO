import java.util.Scanner;

public class PenjumlahanDeret {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input
        System.out.print("Masukkan nilai N: ");
        int N = scanner.nextInt();
        //variabel untuk menyimpan hasil penjumlahan
        int hasil = 0;
        //perulangan dari 1 sampai N
        for (int i = 1; i<= N; i++) {
            //menambahkan i ke hasil
            hasil += i;
        }
        //mencetak hasil penjumlahan
        System.out.println("Hasil penjumlahan deret ke " + N + " bilangan asli pertama adalah: " + hasil);
    }

}
