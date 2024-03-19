package HesapMAkinesi;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        int num1,num2,operation ;

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter num1");
        num1 = input.nextInt();

        System.out.println("Please, enter num2");
        num2 = input.nextInt();

        System.out.println("1-add \n 2-subtract \n 3-divide \n 4-multiply");
        System.out.println("Your selection: ");
        operation=input.nextInt();


        switch (operation){
            case 1:
                int add= num1 + num2;
                System.out.println("add : "+ add);
                break;
            case 2:
                int substract = num1 - num2;
                System.out.println("substract : "+ substract);
                break;
            case 3:
                int divide = num1 / num2 ;
                System.out.println("divide :  "+ divide);
                break;
            case 4:
                int multiply = num1 * num2;
                System.out.println("multiply: "+multiply);
                break;
            default:
                System.out.println("Please, enter a valid transaction");
        }



    }
}
