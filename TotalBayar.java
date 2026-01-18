import java.util.Scanner;
public class TotalBayar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // inputkan total belanja
        System.out.print("masukkan total belanja : ");
        double TotalBelanja = input.nextDouble();
        double TotalDiskon;
        if (TotalBelanja >= 100.000) {
            TotalDiskon = TotalBelanja * 0.1;
            System.out.println("Total diskon adalah : " + TotalDiskon);
            System.out.println("Total bayarnya adalah : " + (TotalBelanja - TotalDiskon));
        }else if (TotalBelanja >= 50.000) {
            TotalDiskon = TotalBelanja * 0.05;
            System.out.println("Total diskon adalah : " + TotalDiskon);
            System.out.println("Total bayarnya adalah : " + (TotalBelanja - TotalDiskon));
        } else {
            System.out.println("Total bayarnya adalah : " + TotalBelanja);
        }
    }
}
