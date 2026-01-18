import java.util.Scanner;
public class RataRataBerbobot {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        // input
        System.out.print("Nilai Matematika : ");
        double nilaimtk = data.nextDouble();
        System.out.print("Nilai Algoritma : ");
        double nilaialgo = data.nextDouble();
        // jumlah sks
        int sksmtk = 2;
        int sksalgo = 3;
        System.out.println("SKS Matematika : " + sksmtk);
        System.out.println("SKS Algoritma : " + sksalgo);
        // hitung rata rata
        double a = nilaimtk * sksmtk; // a adalah total matematika
        double b = nilaialgo * sksalgo; // b adalah total alogoritma
        int c = sksmtk + sksalgo; // c adalah total sks
        double d = a + b; // d adalah total matematika dan algoritma
        double e = d / c; // e adalah total matematika dan algoritma dibagi total sks
        System.out.println("Rata Rata Berbobot : " + e);
        // close the scanner
        data.close();
    }
}
