import java.util.Scanner;
public class UTSAkar {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        double a, b, c, diskriminan, akar, akar1, akar2;
        //input nilai koefisien a,b,c
        System.out.print("Masukkan nilai a : ");
        a = data.nextInt();
        System.out.print("Masukkan nilai b : ");
        b = data.nextInt();
        System.out.print("Masukkan nilai c : ");
        c = data.nextInt();
        //menggunakan rumus diskriminan untuk menentukan jenis akar
        diskriminan = b*b-4*a*c;
        if (diskriminan>0) {
            System.out.println("Akarnya nyata dan berbeda.");
            akar1 = (-b + Math.sqrt(diskriminan))/(2*a);
            akar2 = (-b - Math.sqrt(diskriminan))/(2*a);
            System.out.println("Hasil akarnya : " + akar1 + " dan "+ akar2);
        }else if (diskriminan == 0) {
            System.out.println("Akarnya sama.");
            akar = -b/(2*a);
            System.out.println("Hasil akarnya : "+akar);
        }else {
            System.out.println("Akarnya khayal.");
            if (a>0) {
                System.out.println("Fungsi kuadrat bersifat definit positif");
            }else if (a<0) {
                System.out.println("Fungsi kuadrat bersifat definit negatif");
            }else {
                System.out.println("Bukan fungsi kuadrat");
            }
        } data.close();
    }
    
}