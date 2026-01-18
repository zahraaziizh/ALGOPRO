import java.util.Scanner;
import java.util.ArrayList;

public class HitungNilaiArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        char konfirmasi;
        double jumlahAlgo = 0, rataAlgo;
        ArrayList<String> nama = new ArrayList<>();
        ArrayList<Double> nilaiAlgo = new ArrayList<>();
        // inputan data
        do {
            i++;
            System.out.print("Input nama mhs ke- " + i + ": ");
            nama.add(scanner.next());
            System.out.print("input nilai algo mhs ke-" + i + ": ");
            nilaiAlgo.add(scanner.nextDouble());
            System.out.print("input data lagi? (y/t): ");
            konfirmasi = scanner.next().charAt(0);
            System.out.println("--------------------");
        } while (konfirmasi == 'y');
        System.out.println("-------------------------");
        // menghapus data
        nama.remove(1);
        nilaiAlgo.remove(1);
        // proses menghitung
        // cara 1
        for (double angka : nilaiAlgo) {
            jumlahAlgo += angka;
        }
        // cara 2
        for (i = 0; i < nilaiAlgo.size(); i++) {
            jumlahAlgo += nilaiAlgo.get(i);
        }
        rataAlgo = jumlahAlgo / nilaiAlgo.size();
        // mencetak data
        for (i = 0; i < nama.size(); i++) {
            System.out.println("nama mhs ke- " + (i + 1) + ": " + nama.get(i));
            System.out.println("nilai algo " + (nama.get(i)) + " :" + nilaiAlgo.get(i));
        }
        System.out.println("-----------------------");
        System.out.println("nilai rata rata algo kelas : " + rataAlgo);
    }
}
