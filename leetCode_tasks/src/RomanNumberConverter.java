import java.util.Map;

/**
 * @author Evgenii Zhuravel created on 07.09.2022
 * @version 1.0
 */
public class RomanNumberConverter {

    static Map<Character, Integer> roman = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

    private static final String[] ROMAN = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] ARABIC = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public static void main(String[] args) {

        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("XIV"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));

        System.out.println(romanToInt2("IV"));
        System.out.println(romanToInt2("III"));
        System.out.println(romanToInt2("XIV"));
        System.out.println(romanToInt2("LVIII"));
        System.out.println(romanToInt2("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int result = roman.get(s.charAt(0));

        if (s.length() == 1) {
            return result;
        }

        int prev = result;
        int n;

        for (int i = 1; i < s.length(); i++) {
            n = roman.get(s.charAt(i));
            if (prev < n) {
                result += n - prev * 2;
            } else {
                result += n;
            }
            prev = n;
        }

        return result;
    }

    public static int romanToInt2(String s) {
        String remaining = s;
        int result = 0;

        for (int i = 0; i < ROMAN.length; i++) {
            while(remaining.startsWith(ROMAN[i])) {
                remaining = remaining.substring(ROMAN[i].length());
                result+=ARABIC[i];
            }
        }
        return result;
    }

}
