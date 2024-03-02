package calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // food prices
        int bubblegumPrice = 2;
        double toffeePrice = 0.2;
        int iceCreamPrice = 5;
        int milkChocolatePrice = 4;
        double doughnutPrice = 2.5;
        double pancakePrice = 3.2;

        // prices
        System.out.println("Prices:");
        System.out.println("Bubblegum: $" + bubblegumPrice);
        System.out.println("Toffee: $" + toffeePrice);
        System.out.println("Ice cream: $" + iceCreamPrice);
        System.out.println("Milk chocolate: $" + milkChocolatePrice);
        System.out.println("Doughnut: $" + doughnutPrice);
        System.out.println("Pancake: $" + pancakePrice);
        System.out.println();

        // monthly earnings
        int bubblegumMonth = 202;
        int toffeeMonth = 118;
        int iceCreamMonth = 2250;
        int milkChocolateMonth = 1680;
        int doughnutMonth = 1075;
        int pancakeMonth = 80;
        double totalMonth =
                bubblegumMonth + toffeeMonth + iceCreamMonth + milkChocolateMonth + doughnutMonth + pancakeMonth;

        // monthly earnings report
        System.out.println("Earned amount");
        System.out.println("Bubblegum: $" + bubblegumMonth);
        System.out.println("Toffee: $" + toffeeMonth);
        System.out.println("Ice cream: $" + iceCreamMonth);
        System.out.println("Milk chocolate: $" + milkChocolateMonth);
        System.out.println("Doughnut: $" + doughnutMonth);
        System.out.println("Pancake: $" + pancakeMonth);
        System.out.println();
        System.out.println("Income: $" + totalMonth);

        // calculate other expenses
        Scanner scanner = new Scanner(System.in);

        System.out.println("Staff expenses:");
        double staffExpenses = scanner.nextDouble();
        System.out.println("Other expenses:");
        double otherExpenses = scanner.nextDouble();

        double netIncome = totalMonth - staffExpenses - otherExpenses;
        System.out.printf("Net income: $%.0f", netIncome);

        scanner.close();
    }
}