import java.util.Scanner;

public class DeretGeometri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input suku pertama (a), perbandingan (r), banyak suku (n)
        System.out.print("masukkan suku pertama : ");
        int a = scanner.nextInt();
        System.out.print("masukkan perbandingan : ");
        int r = scanner.nextInt();
        System.out.print("masukkan banyak suku : ");
        int n = scanner.nextInt();
        //variabel untuk menyimpan jumlah deret
        double jumlah = 0;
        //menghitung dan menampilkan setiap suku deret geometri
        System.out.println("deret geometri : ");
        for (int i = 0; i < n; i++){
            double suku = a* Math.pow(r, i);
            System.out.println("U" + (i+1) + " = " + suku);
            jumlah += suku;
        }
        System.out.println("jumlah " + n + " suku pertama deret geometri adalah : " +jumlah);
    }
    
}
