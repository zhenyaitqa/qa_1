public class Month {
    public static int contDayOfMonth(int indexOfMonth) {

        switch (indexOfMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 0;
        }
    }

    public static void main(String[] arg) {
        System.out.println(contDayOfMonth(12));


    }


}
