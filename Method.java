import java.util.Scanner;
public class Method {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
           // garis();
            String nama= "aku bin saya"; cetakNama(nama);
            cetakNama ("aku bin dia");
            int umur = hitungUmur(2000);
            System.out.println("Umue mahasiswa :" + umur);
            System.out.println("Umue mahasiswa :" + hitungUmur(2001));
            String[] hoby = {"mancing", "mobile legend", "jalan jalan"};
            cetakHoby(hoby);
            cetakID(nama,umur,hoby);
        }// end main

        public static void cetakID(String nama, int tahun, String[] hoby) //method dengan parm dan return
        {
            garis();
            cetakNama(nama);
            System.out.println("umur mahasiswa :" + hitungUmur(tahun));
            cetakHoby(hoby);
            garis();
        }
        public static void cetakHoby(String[] hoby) //method dengan parm dan dengan return
        {
            for(int i=0; i<hoby.length; i++) 
            {System.out.println("Hobby mahasiswa-" +(i+ 1)+":"+hoby[i]);}
        }
    public static int hitungUmur(int tahun) //method dengan parm dan dengan return
    {
        int umur = 2024-tahun;
        return umur;
    }
    public static void cetakNama(String nama) // method dengan parm dan tanpa return
    {
        System.out.println("Nama mahasiswa :" + nama);
        garis();
    }
    public static void garis() // method tanpa parm dan tanpa return
    {
        System.out.println("--------------------------");
    }
    
}// end class
