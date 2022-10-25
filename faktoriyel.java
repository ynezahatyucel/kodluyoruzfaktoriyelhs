package Giris;
import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
        int n, r, c;
        int facn = 1, facr = 1, facnr = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen 1.sayıyı giriniz: ");
        n = input.nextInt();
        System.out.print("Lütfen 2.sayıyı giriniz: ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++){
            facn *= i;
        }

        for (int i = 1; i <= r; i++){
            facr *= i;
        }

        for (int i = 1; i <= (n-r); i++){
            facnr *= i;
        }

        c = facn/(facr*facnr);

        System.out.print("Kombinasyon: " + c);
    }}