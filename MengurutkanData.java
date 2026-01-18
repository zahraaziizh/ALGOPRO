import java.util.Scanner;
public class MengurutkanData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan data pertama : ");
        int data1 = input.nextInt();
        System.out.print("masukkan data kedua : ");
        int data2 = input.nextInt();
        int temp;
        if (data1 > data2) {
            temp = data1;
            data1 = data2;
            data2 = temp;
        }
        System.out.println("urutan bilangan setelah diurutkan secara ascending yaitu : ");
        System.out.println(data1);
        System.out.println(data2);
    }
}
