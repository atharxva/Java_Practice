// 8. WAP to print odd numbers between 1 to 20.
public class Question8 {
    public static void main(String args[]) {
        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ",");
            } else {
                continue;
            }
        }
    }

}
