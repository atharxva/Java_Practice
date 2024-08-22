
// WAP to find greater among two numbers using conditional operator.
import java.util.Scanner;

public class Question3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int choice1 = input.nextInt();
        int choice2 = input.nextInt();

        if (choice1 > choice2) {
            System.out.println(choice1 + " Is greater");
        } else {
            System.out.println(choice2 + " Is greater");
        }
        input.close();
    }

}
