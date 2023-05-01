import java.util.LinkedList;
import java.util.List;

/**
 * @author Evgenii Zhuravel created on 09.09.2022
 * @version 1.0
 */
public class RansomNote {

    public static void main(String[] args) {
        /*System.out.println("false: " + canConstruct("a", "b"));
        System.out.println("false: " + canConstruct("aa", "bb"));*/
        System.out.println("true: " + canConstruct2("aa", "aab"));
        //System.out.println("false: " + canConstruct2("aaa", "aa"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        List<Character> magazineList = new LinkedList<>();
        for (char c : magazine.toCharArray()) {
            magazineList.add(c);
        }

        for (Character c : ransomNote.toCharArray()) {
            if (!magazineList.remove(c)) {
                return false;
            }
        }

        return true;
    }

    public static boolean canConstruct2(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] alphabets_counter = new int[26];

        for (char c : magazine.toCharArray())
            alphabets_counter[c-'a']++;

        for (char c : ransomNote.toCharArray()){
            if (alphabets_counter[c-'a'] == 0) return false;
            alphabets_counter[c-'a']--;
        }
        return true;
    }
}
