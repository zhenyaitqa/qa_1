
package utils;


public class Utils {
    public static void starFive() {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void starAscending() {
        for (int i = 5; i > 0; i--) {
            for (int x = 5 - i; x > 0; x--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void starDescending() {
        for (int i = 0; i < 5; i++) {
            for (int x = 4 - i; x > 0; x--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] arg){

//        starFive();
//        starAscending();
        starDescending();
    }


}
