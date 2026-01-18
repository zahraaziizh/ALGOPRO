import java.util.Scanner;
public class OperatorPerbandingan {
    public static void main(String[] args) {
        //deklarasi
        Scanner data = new Scanner(System.in);
        int a,b,c;
        //input
        System.out.print("a =");
        a = data.nextInt();
        System.out.print("b =");
        b = data.nextInt();
        System.out.print("c =");
        c = data.nextInt();
        //output
        System.out.println("apakah a lebih kecil dari 4? " + (a < 4));
        System.out.println("apakah b lebih besar dari 6? " + (b > 6));
        System.out.println("apakah a sama dengan b? " + (a == b));
        System.out.println("apakah b tidak sama dengan c? " + (b != c));
        System.out.println("apakah a lebih besar dari c? " + (a > c));
        //close the scanner
        data.close();
    }
}
