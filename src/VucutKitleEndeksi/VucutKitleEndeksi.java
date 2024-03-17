package VucutKitleEndeksi;

import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Lutfen boyunuzu m cinsinden giriniz");
        double boy;
        boy = input.nextDouble();

        System.out.println("Lutfen kilonuzu kg cinsinden giriniz");
        double kilo;
        kilo = input.nextDouble();;

        double vucutKitleInd = kilo / (boy * boy) ;
        System.out.println(vucutKitleInd);

    }
}
