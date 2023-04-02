public class HW3 {
    public static String longerWord(String first, String second, String three) {
        int len1 = first.length();
        int len2 = second.length();
        int len3 = three.length();
        if (len1 > len2 && len1 > len3) {
            return first;
        } else if (len2 > len1 && len2 > len3) {
            return second;
        } else if (len3 > len1 && len3 > len2) {
            return three;
        } else {
            return "Декілька слів однакової довжини";
        }
    }




    public static void main (String []arg){
        System.out.println(longerWord("he","h","hi" ));
    }
}
