import java.util.Scanner; 

public class Main { 

    // This function takes a string as input and returns the same string, but formatted as a comment.
    public static String comment(String str) {

        // Your code goes here.
        return "// " + str;

    }

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 

        // Get the user's input here.
        String input = scanner.nextLine();

        // Call your function and print the result.
        System.out.println(comment(input));

        scanner.close();

    } 

}