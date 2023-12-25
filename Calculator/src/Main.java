import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("\t\tДобро пожаловать в калькулятор умножения!");

        System.out.println("Введите первое число:");
        double firstNumber = new Scanner(System.in).nextDouble();

        System.out.println("Введите первое число:");
        double secondNumber = new Scanner(System.in).nextDouble();

        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));




        System.out.println("\t\tДобро пожаловать в калькулятор сложения!");

        System.out.println("Введите первое число:");
        double firstNumb = new Scanner(System.in).nextDouble();

        System.out.println("Введите первое число:");
        double secondNumb = new Scanner(System.in).nextDouble();

        System.out.println(firstNumb + " + " + secondNumb + " = " + (firstNumb + secondNumb));






        System.out.println("\t\tДобро пожаловать в калькулятор вычитания!");

        System.out.println("Введите первое число:");
        double firstNumber1 = new Scanner(System.in).nextDouble();

        System.out.println("Введите первое число:");
        double secondNumber2 = new Scanner(System.in).nextDouble();

        System.out.println(firstNumber1 + " - " + secondNumber2 + " = " + (firstNumber1 - secondNumber2));





        System.out.println("\t\tДобро пожаловать в калькулятор деления!");

        System.out.println("Введите первое число:");
        double firstNumberA = new Scanner(System.in).nextDouble();

        System.out.println("Введите первое число:");
        double secondNumberB = new Scanner(System.in).nextDouble();

        System.out.println(firstNumberA + " / " + secondNumberB + " = " + (firstNumberA / secondNumberB));

    }
}