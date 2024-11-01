import java.util.*;
public class Leet2351FirstLetterToAppearTwice {
    // public char repeatedCharacter(String s) {
    //     Map<Character, Integer> map = new HashMap<>();
    //     List<Integer> list = new ArrayList<>();

    //     for (int i = 0; i < s.length(); i++) {
    //         if (map.containsKey(s.charAt(i))) {
    //             map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
    //             if (map.get(s.charAt(i)) == 2) {
    //                 list.add(i);
    //             }
    //         } else
    //             map.put(s.charAt(i), 1);
    //     }

    //     return s.charAt(list.get(0));
    // }

    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();

        for (char c: s.toCharArray()) {
            if (set.contains(c)){
                return c;
            }
            else {
                set.add(c);
            }
        }

        return s.charAt(0);
    }

    public static void main(String[] args) {
        Leet2351FirstLetterToAppearTwice leet = new Leet2351FirstLetterToAppearTwice();
        System.out.println(leet.repeatedCharacter("abcbccde")); // a
    }
}
