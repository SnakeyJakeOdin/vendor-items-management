import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // finding the tens digit
        int n = scanner.nextInt();

        // convert the number to one between 0 - 99
        n %= 100;

        // find the tens place number
        n /= 10;

        // print result
        System.out.println(n);
    }
}