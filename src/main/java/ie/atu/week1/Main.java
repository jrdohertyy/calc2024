package ie.atu.week1;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main (String[] args){
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        double firstNum = scan1.nextDouble();

        System.out.println("Please enter first number: ");
        double secondNum = scan1.nextDouble();

        double result = firstNum + secondNum;

        System.out.println("The result is " +result);

    }


}