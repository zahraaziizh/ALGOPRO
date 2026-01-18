import java.util.Scanner;
public class MencetakKarakter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input;

        System.out.println("Masukkan karakter (masukkan 'x' atau 'X' untuk keluar) : ");

        while (true) {
            input = scanner.next().charAt(0);

            if (input == 'x' || input == 'X') {
                System.out.println("Program selesai.");
                break;
            }

            System.out.println("Karakter yang dimasukkan: " + input);
        }
    }
}