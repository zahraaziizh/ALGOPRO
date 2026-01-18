import java.util.Scanner;
public class UTSGajiKaryawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // masukkan pilihan golongan
        System.out.print("Masukkan golongan gaji pokok (1/2/3) : ");
        int golongan = scanner.nextInt();
        // masukkan status pernikahan
        System.out.print("Apakah anda sudah berkeluarga? (sudah/belum) : ");
        String statuskeluarga = scanner.next();
        // hitung gaji pokok berdasarkan golongan
        double gajipokok = 0;
        if (golongan == 1) {
            gajipokok = 1000000;
            System.out.println("golongan 1 :" + gajipokok + ".");
        } else if (golongan == 2) {
            gajipokok = 2000000;
            System.out.println("golongan 2 :" + gajipokok + ".");
        } else if (golongan == 3) {
            gajipokok = 3000000;
            System.out.println("golongan 3 :" + gajipokok + ".");
        } else {
            System.out.println("golongan tidak valid.");
        }
        // hitung tunjangan keluarga dan anak
        double tunjangankeluarga = 0;
        double tunjangananak = 0;
        if (statuskeluarga.equalsIgnoreCase("sudah")) {
            tunjangankeluarga = 300000;
            System.out.print("Jumlah anak : ");
            int jumlahanak = scanner.nextInt();
            // menghitung tunjangan anak sesuai jumlah anak
            tunjangananak = Math.min(jumlahanak, 3) * 100000;
        }
        // hitung gaji kotor dan pajak khusus golongan 3
        double gajikotor = gajipokok + tunjangankeluarga + tunjangananak;
        double pajak = 0;
        if (golongan == 3) {
            pajak = gajikotor * 0.02; // 2% dari gaji kotor
        }
        // hitung gaji bersih
        double gajibersih = gajikotor - pajak;
        // output keseluruhan
        System.out.println("Gaji pokok : Rp " + gajipokok);
        System.out.println("Tunjangan keluarga : Rp " + tunjangankeluarga);
        System.out.println("Tunjangan anak : Rp " + tunjangananak);
        System.out.println("Pajak : Rp " + pajak);
        System.out.println("Gaji bersih : Rp " + gajibersih);
        scanner.close();
    }
}
