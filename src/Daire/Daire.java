package Daire;

import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double pi=3.14;
        int r;
        r= input.nextInt();

        double Alan = pi * r * r;
        double Cevre = 2 * pi * r;

        System.out.println("Cevre = " + Cevre);
        System.out.println("Alan = " + Alan);


    }
}
