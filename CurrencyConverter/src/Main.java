import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //The currency converter converts the specified number of rubles
        // and the current exchange rates into the value of how much it will be
        System.out.println("Welcome to the currency converter!");

        System.out.println("Enter the number of rubles:");
        double rubCount = new Scanner(System.in).nextDouble();

        System.out.println("Enter the current euro exchange rate:");
        double euroPrice = new Scanner(System.in).nextDouble();

        System.out.println("Enter the current dollar exchange rate:");
        double dollarPrice = new Scanner(System.in).nextDouble();

        System.out.println("Enter the current yuan exchange rate:");
        double yuanPrice = new Scanner(System.in).nextDouble();


        System.out.println(rubCount + " rubles, this is: " + rubCount * (1 / euroPrice) + " euro.");
        System.out.println(rubCount + " rubles, this is: " + rubCount * (1 / dollarPrice) + " dollar.");
        System.out.println(rubCount + " rubles, this is: " + rubCount * (1 / yuanPrice) + " yuan.");
    }
}