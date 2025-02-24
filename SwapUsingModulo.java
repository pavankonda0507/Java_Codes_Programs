import java.util.Scanner;
import java.util.Scanner;

public class SwapUsingModulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number (b): ");
        int b = scanner.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap using modulo and division
        a = a % b; // Step 1: a becomes the remainder of a/b
        b = b % a; // Step 2: b becomes the remainder of old b/a (a now has a's remainder)
        a = a * b; // Step 3: update a and b using multiplication if necessary

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
