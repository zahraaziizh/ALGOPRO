import java.util.Scanner;
public class RataNBilangan {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int i, n;
        double bil, rata, jumlah;
        // input banyak bilangan /n
        System.out.print("berapa banyak bilangan? ");
        n = data.nextInt();
        jumlah = 0; //nilai awal penjumlahan
        /*
        for (i = 1; i <= n; i++) {
            System.out.println("Input bilangan ke-" + i);
            bil = data.nextDouble();
            jumlah = jumlah + bil;
        } */
       i = 1;
       while (i <= n){
        System.out.println("input bilangan ke- " + i + " : " );
        bil = data.nextDouble();
        jumlah = jumlah + bil;
        i++;
       }
        rata = jumlah/n;
        System.out.println("Hasil jumlahnya : " +jumlah);
        System.out.println("Hasil rata ratanya : " +rata);
    }//end main
}//end class
