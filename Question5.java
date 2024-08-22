// WAP to find sum and average of numbers from 1 to 10.

public class Question5 {
    public static void main(String args[]) {
        double sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        double average = sum / 10;
        System.out.println(average);

    }

}
