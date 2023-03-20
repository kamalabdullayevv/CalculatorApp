package method;

import java.util.Scanner;

public class menu {

    public static void menu() {


        try {
            System.out.println("input first value: ");
            Scanner sc1 = new Scanner(System.in);
            double num1 = sc1.nextDouble();

            System.out.println("input character: ");
            Scanner sc3 = new Scanner(System.in);
            String character = sc3.nextLine();

            System.out.println("input second value: ");
            Scanner sc2 = new Scanner(System.in);
            double num2 = sc2.nextDouble();


            double result = 0;


            switch (character) {
                case "+":
                    result = (num1 + num2);
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid Operator!");
                    menu();

            }
            System.out.println(result);

        } catch (Exception ex) {
            System.out.println("Please Input value!");
            menu();
        }
    }


}

