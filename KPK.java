import java.util.Scanner;

public class KPK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input dua bilangan
        System.out.print("masukkan bilangan pertama : ");
        int a = scanner.nextInt();
        System.out.print("masukkan bilangan kedua : ");
        int b = scanner.nextInt();
        //menentukan kpk
        int kpk = (a>b) ? a : b; //dimulai dari bilanagan yang lebih besar
        //mencari kpk
        while (true) {
            if (kpk % a == 0 && kpk % b == 0) {
                break;
            }
            kpk++;
        }
        System.out.println("KPK dari " +a+ " dan " +b+ " adalah : " +kpk);
    }
}
