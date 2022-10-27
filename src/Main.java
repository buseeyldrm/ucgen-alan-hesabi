import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.print("1.kenar: ");
        int a= klavye.nextInt();
        System.out.print("2.kenar: ");
        int b= klavye.nextInt();
        System.out.print("3.kenar: ");
        int c= klavye.nextInt();

        double u=(a+b+c)/2;
        double cevre=2*u;
        System.out.println("ücgenin cevresi: " +cevre);

        double alan=u*(u-a)*(u-b)*(u-c);
        System.out.println("ücgenin alanı: " +alan);
    }
}