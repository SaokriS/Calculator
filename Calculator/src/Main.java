import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Создадим калькулятор умножения
        System.out.println("\t\tWelcome to the multiplication calculator!");

        System.out.println("Please enter the first number:");
        double firstNumber = new Scanner(System.in).nextDouble();

        System.out.println("Please enter the second number:");
        double secondNumber = new Scanner(System.in).nextDouble();

        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));



        //Создадим калькулятор сложения

        System.out.println("\t\tWelcome to the addition calculator!");

        System.out.println("Please enter the first number:");
        double firstNumb = new Scanner(System.in).nextDouble();

        System.out.println("Please enter the second number:");
        double secondNumb = new Scanner(System.in).nextDouble();

        System.out.println(firstNumb + " + " + secondNumb + " = " + (firstNumb + secondNumb));



        //Создадим калькулятор вычитания

        System.out.println("\t\tWelcome to the subtraction calculator!");

        System.out.println("Please enter the first number:");
        double firstNumber1 = new Scanner(System.in).nextDouble();

        System.out.println("Please enter the second number:");
        double secondNumber2 = new Scanner(System.in).nextDouble();

        System.out.println(firstNumber1 + " - " + secondNumber2 + " = " + (firstNumber1 - secondNumber2));



        // Создадим колькулятор деления

        System.out.println("\t\tWelcome to the division calculator!");

        System.out.println("Please enter the first number:");
        double firstNumberA = new Scanner(System.in).nextDouble();

        System.out.println("Please enter the second number:");
        double secondNumberB = new Scanner(System.in).nextDouble();

        System.out.println(firstNumberA + " / " + secondNumberB + " = " + (firstNumberA / secondNumberB));

    }
}