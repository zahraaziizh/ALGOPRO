import java.util.Scanner;
public class FPB {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan bilangan pertama : ");
        int a = scanner.nextInt();
        System.out.print("masukkan bilangan kedua : ");
        int b = scanner.nextInt();
        /*int fpb = hitungFPB (a, b);
        System.out.println("FPB dari " + a +" dan " + b + " adalah : "+ fpb);
    }
    public static int hitungFPB (int a, int b) {
        //menggunakan nilai absolut untuk memastikan positif
        a = Math.abs(a);
        b = Math.abs(b);*/
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        /*return a;*/
        System.out.println("FPB dari kedua bilangan tersebut adalah : " + a);
    } 
    }

