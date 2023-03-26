import java.util.Scanner;

public class HW2 {
    public static int sumOfThreeNumbers(int n) {
        return String.valueOf(n)
                .chars()
                .map(Character::getNumericValue)
                .sum();
    }

    public static int sumOfThreeNumbers(String first, String second) {
        return (first + second).length();
    }

    public static String sumOfThreeNumbers() {
        Scanner sc = new Scanner(System.in);
        boolean result = sc.nextInt() > 0;
        return result + " - " + (result ? "Number is bigger than 0" : "Number is not bigger than 0");
    }

    public static void main(String[] args) {
        System.out.println(sumOfThreeNumbers(734));
        System.out.println(sumOfThreeNumbers("first", "second"));
        System.out.println(sumOfThreeNumbers());
    }
}
