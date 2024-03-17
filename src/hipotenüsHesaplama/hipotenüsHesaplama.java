package hipotenüsHesaplama;

import java.util.Scanner;

public class hipotenüsHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a,b;
        double c;

        a= input.nextInt();
        System.out.println(" Lütfen 1.Kenarı giriniz ");

        b= input.nextInt();
        System.out.println(" Lütfen 2.Kenarı giriniz ");

        c = Math.sqrt((a*a)+(b*b));
        System.out.println(c);


    }
}
