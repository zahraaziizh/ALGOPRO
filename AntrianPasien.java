import java.util.ArrayList;
import java.util.Scanner;
public class AntrianPasien {
    private ArrayList<String> antrian;
    public AntrianPasien() {
        antrian = new ArrayList<>();
    }
    public void tampilMenu(){
        System.out.println("Menu antrian pasien : ");
        System.out.println("1. Tambah data");
        System.out.println("2. Hapus data");
        System.out.println("3. Tampilkan semua data");
        System.out.println("4. Keluar");
    }
    public void tambahData(String nama){
        antrian.add(nama);
        System.out.println("Data pasien "+nama+" telah ditambahkan.");
    }
    public void hapusData(){
        if(!antrian.isEmpty()){
            String nama = antrian.remove(0);
            System.out.println("Data pasien "+nama+" telah dihapus.");
        }else {
            System.out.println("Antrian kosong.");
        }
    }
    public void tampilSeluruhData(){
        if (!antrian.isEmpty()){
            System.out.println("Daftar antrian pasien : ");
            for (String nama : antrian){
                System.out.println(nama);
            }
        } else {
            System.out.println("Antrian kosong.");
        }
    }
    public static void main(String[] args) {
        AntrianPasien antrianPasien = new AntrianPasien();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            antrianPasien.tampilMenu();
            System.out.print("Pilih menu : ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // untuk membersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pasien : ");
                    String nama = scanner.nextLine();
                    antrianPasien.tambahData(nama);
                    break;
                case 2:
                    antrianPasien.hapusData();
                    break;
                case 3:
                    antrianPasien.tampilSeluruhData();
                    break;
                case 4:
                    System.out.println("Keluar dari program. ");
                    break;
                default:
                    System.out.println("Pilihan anda tidak valid. ");
            }
        } while (pilihan != 4); 
        scanner.close();
    }
}