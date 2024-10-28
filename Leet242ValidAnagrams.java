import java.util.HashMap;
import java.util.Map;

public class Leet242ValidAnagrams {
    public boolean isAnagram(String s, String t) {
        char[] arrs = s.toCharArray();
        char[] arrt = t.toCharArray();
        boolean flag = false;
        Map<Character,Integer> maps = new HashMap<>();
        if (arrs.length != arrt.length){
            return false;
        }

        for (int i = 0; i < arrs.length; i++) {
            if (!maps.containsKey(arrs[i])){
                maps.put(arrs[i], 1);
            }
            else {
                maps.put(arrs[i], maps.get(arrs[i]) + 1);
            }
        }
        Map<Character, Integer> mapt = new HashMap<>();
        for (int i = 0; i < arrt.length; i++) {
            if (!mapt.containsKey(arrt[i])) {
                mapt.put(arrt[i], 1);
            } else {
                mapt.put(arrt[i], mapt.get(arrt[i]) + 1);
            }
        }

        if (maps.entrySet().equals(mapt.entrySet())){
            return true;
        }

        return flag;
    }

    public static void main(String[] args) {
        Leet242ValidAnagrams leet = new Leet242ValidAnagrams();
        System.err.println(leet.isAnagram("anagram", "nagaram"));
    }
}
