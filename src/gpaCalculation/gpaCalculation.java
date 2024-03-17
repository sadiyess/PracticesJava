package gpaCalculation;

import java.util.Scanner;

public class gpaCalculation {
    public static void main(String[] args) {
        int math,physics,chemical,turkish,music;

        Scanner input = new Scanner(System.in);

        System.out.println(" Please, enter your math grade");
        math=input.nextInt();

        System.out.println(" Please, enter your physics grade");
        physics=input.nextInt();

        System.out.println(" Please, enter your chemical grade");
        chemical=input.nextInt();

        System.out.println(" Please, enter your turkish grade");
        turkish=input.nextInt();

        System.out.println(" Please, enter your music grade");
        music=input.nextInt();

        int total= (math + physics + chemical + turkish + music);
        double result = total/5;
        System.out.println(result);

        if (result >= 60) {
            System.out.println("passed the class");
        } else if (result < 60) {
            System.out.println("failed the grade");
        }




    }
}
