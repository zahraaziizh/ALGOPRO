import java.util.Scanner;
public class inputscanner {
    public static void main (String[] abc) {
        Scanner data = new Scanner (System.in);
        int umur;
        double tinggi;
        String nama;
        char jk;
        boolean aktif;
System.out.print("Masukkan nama anda");
nama = data.nextLine();
System.out.print("Masukkan umur anda");
umur = data.nextInt();
System.out.print("Masukkan tinggi badan anda (dlm meter)");
tinggi = data.nextDouble();
System.out.print("Masukkan jenis kelamin (L/P)");
jk = data.next().charAt(0);
System.out.print("Aktif ?");
aktif = data.nextBoolean();
System.out.println(nama+"mempunyai umur"+umur+" ,tinggi"+tinggi+" JK"+jk);
System.out.println("Aktif"+aktif); }
}