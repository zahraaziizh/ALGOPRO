import java.util.Scanner;

public class Pangkat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan angka basis (x) : ");
        int basis = scanner.nextInt();
        System.out.print("masukkan angka eksponen (y ) : ");
        int eksponen = scanner.nextInt();
        int hasil = 1;
        //menghitung x^y
        for (int i = 0; i < eksponen; i++) {
            hasil *= basis;
        }
        System.out.println("hasil dari " + basis + "^" + eksponen + " adalah : " + hasil);

    }

}
