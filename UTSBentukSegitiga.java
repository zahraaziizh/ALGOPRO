import java.util.Scanner;
public class UTSBentukSegitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input panjang sisi segitiga
        System.out.print("Masukkan panjang sisi a : ");
        double a = scanner.nextDouble();
        System.out.print("Masukkan panjang sisi b : ");
        double b = scanner.nextDouble();
        System.out.print("Masukkan panjang sisi c : ");
        double c = scanner.nextDouble();
        // kategori segitiga
        if (a + b <= c || b + c <= a || a + c <= b) {
            System.out.println("bukan segitiga");
        } else if (a == b && b == c) {
            System.out.println("segitiga sama sisi");
        } else if (a == b || b == c || a == c) {
            System.out.println("segitiga sama kaki");
        } else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) ||
                Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2) ||
                Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) {
            System.out.println("segitiga siku siku");
        } else {
            System.out.println("segitiga sembarang");
        }scanner.close();
    }
}
