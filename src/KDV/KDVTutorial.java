package KDV;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class KDVTutorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double tutar;
        double kdvOranı1=0.18;
        double kdvOranı2=0.08;

        System.out.println("Lütfen tutarı giriniz");

        tutar= input.nextDouble();

        if (tutar < 0 ) {
            System.out.println("Tutar negatif olamaz");
        }else if (tutar <1000) {
            double kdvTutar = tutar * kdvOranı1;
            double kdvliTutar = tutar + kdvTutar;
            System.out.println(kdvliTutar);
        } else if (tutar > 1000 ) {
            double kdvTutar = tutar * kdvOranı2;
            double kdvliTutar = tutar + kdvTutar;
            System.out.println(kdvliTutar);
        }


    }
}
