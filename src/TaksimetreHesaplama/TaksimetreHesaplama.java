package TaksimetreHesaplama;

import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen mesafeyi km cinsinden giriniz.");

        int km;
        double perKm=2.20;
        double total=10;

        km= input.nextInt();
        total= total +  (km * perKm);

        total = (total < 20) ? 20 : total;
        System.out.println(total);



    }
}
