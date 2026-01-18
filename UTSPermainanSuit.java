import java.util.Scanner;
import java.util.Random;
public class UTSPermainanSuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //input pilihan
        String[] pilihan = {"Semut","Gajah","Orang"};
        while (true) {
            System.out.println("Pilih salah satu : ");
            System.out.println("1. Semut");
            System.out.println("2. Gajah");
            System.out.println("3. Orang");
            System.out.print("Masukkan pilihan anda : ");
            int pilihanpemain = scanner.nextInt();
            if (pilihanpemain < 1 || pilihanpemain >3) {
                System.out.println("Pilihan tidak valid. Silahkan pilih lagi.");
                continue;
            }
            int pilihankomputer = random.nextInt(3); //0/1/2
            System.out.println("Anda memilih : " + pilihan[pilihanpemain - 1]);
            System.out.println("Komputer memilih : " + pilihan[pilihankomputer]);
            if (pilihanpemain == pilihankomputer) {
                System.out.println("Hasilnya : Seri");
            }else if ((pilihanpemain == 1 && pilihankomputer == 2)||
                      (pilihanpemain == 2 && pilihankomputer == 0)||
                      (pilihanpemain == 0 && pilihankomputer == 1)){
                System.out.println("Hasilnya : Anda menang");
            }else {
                System.out.println("Hasilnya : Anda kalah");
            }
            System.out.print("Ingin bermain lagi? (ya/tidak): ");
            String lanjut = scanner.next();
            if (!lanjut.equalsIgnoreCase("ya")) {
                break;
            }
        }
        System.out.println("Terima kasih sudah bermain suit");
        scanner.close();
    }
}