import java.util.Scanner;

public class KalikanBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input
        System.out.print("masukkan jumlah bilangan yang ingin dikalikan (N): ");
        int N = scanner.nextInt();
        // variabel untuk menyimpan hasil perkalian, diinisialkan 1
        int hasil = 1;
        // mengambil dan mengalikan input bilangan menggunakan perulangan
        for (int i = 1; i <= N; i++) {
            System.out.print("masukkan bilangan ke-" + i + ": ");
            // mengambil inputan bilangan
            int bilangan = scanner.nextInt();
            // mengalikan bilangan ke hasil
            hasil *= bilangan;
        }
        // mencetak hasil perkalian
        System.out.println("hasil perkalian dari " + N + " bilanganya adalah: " + hasil);

    }

}
