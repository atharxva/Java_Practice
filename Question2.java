
// WAP to find whether the inputted number is even or odd.
import java.util.Scanner;

public class Question2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        if (choice % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
        input.close();
    }
}
