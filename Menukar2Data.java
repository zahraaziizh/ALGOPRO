import java.util.Scanner;
public class Menukar2Data {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        // input nilai sebelum ditukar
        System.out.print("Nilai a : ");
        int a = data.nextInt();
        System.out.print("Nilai b : ");
        int b = data.nextInt();
        // penukaran data
        int temp = a;
        int nilaia = b;
        int nilaib = temp;
        // output
        System.out.println("Melakukan penukaran data");
        System.out.println("Nilai a setelah ditukar : " + nilaia);
        System.out.println("Nilai b setelah ditukar : " + nilaib);
        // close data
        data.close();
    }
}