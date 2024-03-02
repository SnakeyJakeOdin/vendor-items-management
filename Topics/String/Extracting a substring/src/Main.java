import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // get user input
        String s = scanner.next();
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        // print substring
        System.out.println(s.substring(n1, n2 + 1));
    }
}