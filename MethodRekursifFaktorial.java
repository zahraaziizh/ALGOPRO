import java.util.Scanner;
public class MethodRekursifFaktorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan nilai n : ");
        int n = scanner.nextInt();
        System.out.println("nilai faktorial iteratif : " + Faktorial(n));
        System.out.println("nilai faktorial rekursif : " + FaktorialRekursif(n));
    } // end main
    public static int FaktorialRekursif(int n) //method iteratif
    {
        int hasil;
        if (n == 1){
            hasil = 1;
        } else {
            hasil = FaktorialRekursif(n - 1) * n;
        }
        return hasil;
    }
    public static int Faktorial(int n) //method iteratif
    {
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil = hasil * i;
        }
        return hasil;
    }
} // end class
