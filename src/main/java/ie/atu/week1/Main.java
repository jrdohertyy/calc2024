package ie.atu.week1;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main (String[] args){
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        double first = scan1.nextDouble();

        System.out.println("Please enter first number: ");
        double second = scan1.nextDouble();

        System.out.println("Choose an operation (add, subtract, multiply, divide, exponential)");
        String operation = scan1.next();

        boolean validOperation = true;
        double result = 0;
        switch(operation){
            case "add": add(first, second); break;
            case "subtract": subtract(first, second); break;
            case "multiply": multiplication(first, second); break;
            case "divide" : divide(first, second); break;
            case "exponential": exponential(first, second); break;
        }

    }
    public static void add (double first, double second){
        double result = first + second;
        System.out.println("The result is: " +result);
    }
    public static void subtract (double first, double second){
        double result = first - second;
        System.out.println("The result is: " +result);
    }
    public static void multiplication (double first, double second){
        double result = first * second;
        System.out.println("The result is: " +result);
    }
    public static void divide (double first, double second){
        double result = first / second;
        System.out.println("The result is: " +result);
    }
    public static void exponential (double base, double exponent){
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}


