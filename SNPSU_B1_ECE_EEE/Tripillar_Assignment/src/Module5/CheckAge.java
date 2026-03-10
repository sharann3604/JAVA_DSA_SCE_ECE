package Module5;
public class CheckAge {
    public static void main(String[] args) {
        int age = 16;

        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
}