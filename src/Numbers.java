public class Numbers {

    public static void main(String[] args) {

        int[] a = {2, 4, 6};
        int b = 2;
        int[] c = b \ a;


        try {
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("dividing a number by 0");
        }
    }
}
