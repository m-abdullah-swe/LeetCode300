import java.util.*;
public class Leet383RansomNote {
        public boolean canConstruct(String ransomNote, String magazine) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : magazine.toCharArray()) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            boolean flag = false;
            for (char c : ransomNote.toCharArray()) {
                if (map.containsKey(c) && map.get(c) >= 1) {
                    map.put(c, map.get(c) - 1);
                    flag = true;
                    continue;
                } else
                    return false;
            }
            return flag;
        }
    
        public static void main(String[] args) {
            Leet383RansomNote leet = new Leet383RansomNote();
            System.err.println( leet.canConstruct("aa", "aab"));
        }
}
