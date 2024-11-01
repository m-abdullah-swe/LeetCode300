import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leet17LetterCombinationOfAPhoneNumber {
     private static final Map<Character, String> phoneMap = new HashMap<>();
    
    static {
        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return combinations;
        }

        backtrack(combinations, new StringBuilder(), digits, 0);
        return combinations;
    }

    private void backtrack(List<String> combinations, StringBuilder current, String digits, int index) {
        if (index == digits.length()) {
            combinations.add(current.toString());
            return;
        }

        String possibleLetters = phoneMap.get(digits.charAt(index));
        for (char letter : possibleLetters.toCharArray()) {
            current.append(letter);
            backtrack(combinations, current, digits, index + 1);
            current.deleteCharAt(current.length() - 1); // Remove last character to try next letter
        }
    }

    public static void main(String[] args) {
        Leet17LetterCombinationOfAPhoneNumber solution = new Leet17LetterCombinationOfAPhoneNumber();
        System.err.println(solution.letterCombinations("13528"));
    }
}
