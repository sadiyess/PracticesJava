package ManavSepetTutarı;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double armut =2.15;
        double elma = 3.55;
        double domates = 1.57;
        double muz = 4.5;
        double patlican= 4.38;

        System.out.println("Lutfen kaç kilo armut aldiginizi giriniz");
        double armutKilo = input.nextDouble();
        double armutTotal = armut * armutKilo;

        System.out.println("Lutfen kaç kilo elma aldiginizi giriniz");
        double elmaKilo = input.nextDouble();
        double elmaTotal = elma * elmaKilo;

        System.out.println("Lutfen kaç kilo domates aldiginizi giriniz");
        double domatesKilo = input.nextDouble();
        double domatesTotal = domates * domatesKilo;

        System.out.println("Lutfen kaç kilo muz aldiginizi giriniz");
        double muzKilo = input.nextDouble();
        double muzTotal = muz * muzKilo;

        System.out.println("Lutfen kaç kilo patlican aldiginizi giriniz");
        double patlicanKilo = input.nextDouble();
        double patlicanTotal = patlican * patlicanKilo;

        double sepetTutarı = armutTotal + elmaTotal + domatesTotal + muzTotal + patlicanTotal ;
        System.out.println(sepetTutarı);

    }
}
