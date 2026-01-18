import java.util.Scanner;

public class DurasiUjian {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        // input
        System.out.print("Jam mulai ujian : ");
        int jammulai = data.nextInt();
        System.out.print("Menit mulai ujian : ");
        int menitmulai = data.nextInt();
        System.out.print("Detik mulai ujian : ");
        int detikmulai = data.nextInt();
        System.out.print("Jam selesai ujian : ");
        int jamselesai = data.nextInt();
        System.out.print("Jam selesai ujian : ");
        int menitselesai = data.nextInt();
        System.out.print("Jam selesai ujian : ");
        int detikselesai = data.nextInt();
        // ubah semua satuan jam dan menit ke satuan detik
        // A dianggap sebagai waktu mulai
        int jamA = jammulai * 3600;
        int menitA = menitmulai * 60;
        // B dianggap sebagai waktu selesai
        int jamB = jamselesai * 3600;
        int menitB = menitselesai * 60;
        // jumlah detik
        int detikA = jamA + menitA + detikmulai;
        int detikB = jamB + menitB + detikselesai;
        // mengetahui hasil selisih detik
        int hasilselisih = detikB - detikA;
        // ubah hasil waktu ke jam menit dan detik
        int hasiljam = hasilselisih / 3600;
        int sisadetik = hasilselisih % 3600;
        int hasilmenit = sisadetik / 60;
        int hasildetik = sisadetik % 60;
        // output
        System.out.println("Durasi waktu ujian adalah : " + hasiljam+"." + hasilmenit+"." + hasildetik);
        // close data
        data.close();
    }
}
