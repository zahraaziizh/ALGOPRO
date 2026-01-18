import java.util.Scanner;
public class OperatorLogika {
    public static void main(String[] args) {
        //deklarasi
        Scanner data = new Scanner(System.in);
        int a,b,c;
        //input
        System.out.print("a = ");
        a = data.nextInt();
        System.out.print("b = ");
        b = data.nextInt();
        System.out.print("c = ");
        c = data.nextInt();
        //status boolean
        boolean status;
        status = (a<b)&(a<c); System.out.println("status & = " + status);
        status = (a<b)&&(a<c); System.out.println("status && = " + status);
        status = (a<b)|(a>c); System.out.println("status | = " + status);
        status = (a<b)||(a>c); System.out.println("status || = " + status);
        status = !(a<b); System.out.println("status ! = " + status);
        //close the scanner
        data.close();
    }   
}
