import java.util.Scanner;
public class TentGenapGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan bilangan : ");
        int angka = input.nextInt();
        if (angka < 0) {
            System.out.println("bilangan yang dimasukkan tidak boleh bernilai negatif");
        } else if (angka % 2 == 0) {
            System.out.println(" bilangan tersebut adalah bilangan genap");
        } else {
            System.out.println("bilangan tersebut adalah bilangan ganjil");
        }
    }
}
