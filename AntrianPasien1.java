import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Pasien {
    String nama;
    int umur;

    Pasien(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    @Override
    public String toString() {
        return "nama : " + nama + ", umur : " + umur;
    }
}

public class AntrianPasien1 {
    private static ArrayList<Pasien> antrian = new ArrayList<>();

    public static void tambahData(String nama, int umur) {
        antrian.add(new Pasien(nama, umur));
    }

    public static void hapusData() {
        if (!antrian.isEmpty()) {
            antrian.remove(0);
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public static void tampilSeluruhData() {
        for (Pasien pasien : antrian) {
            System.out.println(pasien);
        }
    }

    public static void cariData(String nama) {
        for (Pasien pasien : antrian) {
            if (pasien.nama.equalsIgnoreCase(nama)) {
                System.out.println("data antrian pasien ditemukan : " + pasien);
                return;
            }
        }
        System.out.println("data antrian pasien tidak ditemukan");
    }

    public static void urutkanData() {
        Collections.sort(antrian, Comparator.comparingInt(p -> p.umur));
    }

    public static void main(String[] args) {
        // membuat objek dari class AntrianPasien1
        AntrianPasien1 antrianPasien = new AntrianPasien1();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("menu : ");
            System.out.println("1. tambah data");
            System.out.println("2. hapus data");
            System.out.println("3. tampilkan seluruh data");
            System.out.println("4. cari data");
            System.out.println("5. urutkan data");
            System.out.println("6. keluar");
            System.out.print("masukkan pilihan anda : ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // untuk membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pasien : ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan umur pasien : ");
                    int umur = scanner.nextInt();
                    antrianPasien.tambahData(nama, umur);
                    break;
                case 2:
                    antrianPasien.hapusData();
                    break;
                case 3:
                    antrianPasien.tampilSeluruhData();
                    break;
                case 4:
                    System.out.print("Masukkan nama pasien yang dicari : ");
                    String namaCari = scanner.nextLine();
                    antrianPasien.cariData(namaCari);
                    break;
                case 5:
                    antrianPasien.urutkanData();
                    System.out.println("Data telah diurutkan berdasarkan umur");
                    break;
                case 6:
                    System.out.println("Keluar dari program. ");
                    break;
                default:
                    System.out.println("Pilihan anda tidak valid. ");
            }
        } while (pilihan != 6);
        scanner.close();
    }
}