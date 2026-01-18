import java.util.Scanner;
public class OperatorMatematika {
    public static void main(String[] args) {
        //deklarasi
        Scanner data = new Scanner(System.in);
        int a,b;
        //input
        System.out.print("a =");
        a = data.nextInt();
        System.out.print("b =");
        b = data.nextInt();
        // proses / hitung 
        int penjumlahan = a + b;
        int pengurangan = a - b;
        int perkalian = a * b;
        int pembagian = a / b;
        int modulo = a % b;
        // output
        System.out.println("a + b = " + penjumlahan);
        System.out.println("a - b = " + pengurangan);
        System.out.println("a * b = " + perkalian);
        System.out.println("a / b = " + pembagian);
        System.out.println("a % b = " + modulo);
        // close the scanner
        data.close();
    }
} 