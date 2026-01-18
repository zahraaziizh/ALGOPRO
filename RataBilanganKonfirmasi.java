import java.util.Scanner;

public class RataBilanganKonfirmasi {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int i, n;
        double bil, rata, jumlah;
        char konfirm;
        jumlah = 0;
        n = 0;
        i = 1;
        do {
            System.out.print("input bilangan ke- " + i + " : ");
            bil = data.nextDouble();
            jumlah = jumlah + bil;
            i++;
            n++;
            System.out.print("apakah ingin input angka lagi? (y/t)");
            konfirm = data.next().charAt(0);
        } while (konfirm == 'y');
        rata = jumlah / n;
        System.out.println("jumlah data : " + n);
        System.out.println("Hasil jumlahnya : " + jumlah);
        System.out.println("Hasil rata ratanya : " + rata);

    }
}
