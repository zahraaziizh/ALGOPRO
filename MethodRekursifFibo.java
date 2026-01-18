import java.util.Scanner;

public class MethodRekursifFibo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan suku ke - n Fibonacci : ");
        int n = scanner.nextInt();
        System.out.println("nilai deret fibonacci : " + Fibo(n));
    } // end main

    public static int Fibo(int n) // method iteratif
    {
        int hasil;
        if (n == 1) {
            hasil = 0;
        } else if (n == 2) {
            hasil = 1;
        } else {
            hasil = Fibo(n - 2) + Fibo(n - 1);
        }
        return hasil;
    }
} // end class
