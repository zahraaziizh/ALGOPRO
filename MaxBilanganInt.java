import java.util.Scanner;
public class MaxBilanganInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //deklarasikan variabel
        int Bil1, Bil2, Bil3, max;
        System.out.print("masukkan bilangan integer pertama : ");
        Bil1 = input.nextInt();
        System.out.print("masukkan bilangan integer kedua : ");
        Bil2 = input.nextInt();
        System.out.print("masukkan bilangan integer ketiga : ");
        Bil3 = input.nextInt();
        max = Bil1; // Bil1 dianggap nilai max
        if (Bil2 > max) {
            max = Bil2;
        }
        if (Bil3 > max) {
            max = Bil3;
        }
        System.out.println("Bilangan maksimal yaitu : " + max);
    }
}
