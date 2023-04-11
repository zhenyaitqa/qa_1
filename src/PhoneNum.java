import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNum {

    public static void main(String[] args) {

        List<String> numbers = new ArrayList<>();
        numbers.add("+380930007788");
        numbers.add("380930007788");
        numbers.add("+440930007788");

        String regex = "(\\+380)+[0-9]{9}";

        Pattern pattern = Pattern.compile(regex);

        for (String number : numbers) {
            Matcher matcher = pattern.matcher(number);
            System.out.println(number + " : " + matcher.matches());

        }

    }
}
