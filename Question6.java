import java.util.Scanner;

// Write a program that prompts the user to input a positive integer. It should then print the Multiplication table of the number inputted;
public class Question6 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        int product;
        for(int i = 1; i <= 10; i++){
            product = choice * i;
            System.out.println(choice + " * " + i + " = " + product);
        }
        input.close();
    }
}
