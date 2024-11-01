import java.util.*;
public class Leet387FirstUniqueCharacterInAString {
    
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Leet387FirstUniqueCharacterInAString leet = new Leet387FirstUniqueCharacterInAString();
        String s = "aabcc";
        System.err.println(leet.firstUniqChar(s));
    }
    
}
