public class Question15 {
    public static void main(String args[]) {
        int number = 35;
        int final_num = 0;
        while (number > 0) {
            int digit = number % 10;
            final_num = (final_num * 10) + digit;
            number = number / 10;
        }
        System.out.println(final_num);
    }

}
