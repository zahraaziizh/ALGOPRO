import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan angka yang akan dihitung : ");
        int n = scanner.nextInt();
        int faktorial = 1;
        if (n < 0) {
            System.out.println("jangan masukkan angka negatif");
        } else {
            for (int i = 1; i <= n; i++) {
                faktorial *= i;
            }
            System.out.println("faktorial dari angka " + n + " adalah : " + faktorial);
        }
    }
}
