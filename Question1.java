// WAP to demonstrate implicit type conversion and explicit type conversion.

class Question1 {
    public static void main(String args[]) {

        int number = 10;
        double decimalNumber = number;
        System.out.println(decimalNumber);

        double decimalNumber2 = 10.9;
        int number2 = (int) decimalNumber2;
        System.out.println(number2);
    }
}