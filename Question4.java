// WAP to find greatest among three numbers using if else

import java.util.Scanner;

public class Question4 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int choice1 = input.nextInt();
        int choice2 = input.nextInt();
        int choice3 = input.nextInt();

        if (choice1 > choice2) {
            System.out.println(choice1 + " Is greater");
        } else if (choice2 > choice3) {
            System.out.println(choice2 + " Is greater");
        } else {
            System.out.println(choice3 + " Is greater");
        }
        input.close();
    }

}
