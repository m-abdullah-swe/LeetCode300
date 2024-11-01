import java.util.*;
public class Leet1160FindWordsThatCanBeFormedbyCharacters {
    public int countCharacters(String[] words, String chars) {
        int size = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < chars.length(); i++) {
            if (map.containsKey(chars.charAt(i))) {
                map.put(chars.charAt(i), map.get(chars.charAt(i)) + 1);
            } else {
                map.put(chars.charAt(i), 1);
            }
        }

        for (String s : words) {
            if (isGood(map, s)) {
                size += s.length();
            }
        }

        return size;
    }

    public boolean isGood(Map<Character, Integer> map, String word) {
        Map<Character, Integer> copyMap = new HashMap<>(map);

        for (char c : word.toCharArray()) {
            if (copyMap.containsKey(c) && copyMap.get(c) > 0) {
                copyMap.put(c, copyMap.get(c) - 1);
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Leet1160FindWordsThatCanBeFormedbyCharacters leet = new Leet1160FindWordsThatCanBeFormedbyCharacters();
        String[] strings =  {"cat","bt","hat","tree"};

        System.err.println(leet.countCharacters(strings, "atach"));
    }
}
