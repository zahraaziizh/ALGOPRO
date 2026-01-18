import java.util.Scanner;
public class OperatorAssignment {
    public static void main(String[] args) {
        //deklarasi
        Scanner data = new Scanner (System.in);
        int a,b;
        //input
        System.out.print("a = ");
        a = data.nextInt();
        System.out.print("b = ");
        b = data.nextInt();
        //operasi hitung 
        int penjumlahan = a += b;
        int pengurangan = a -= b;
        int perkalian = a *= b;
        int pembagian = a /= b;
        int modulo = a %= b;
        //output
        System.out.println("nilai a setelah a += b : " + penjumlahan);
        System.out.println("nilai a setelah a -= b : " + pengurangan);
        System.out.println("nilai a setelah a *= b : " + perkalian);
        System.out.println("nilai a setelah a /= b : " + pembagian);
        System.out.println("nilai a setelah a %= b : " + modulo);
        //data close
        data.close();
    }
}
