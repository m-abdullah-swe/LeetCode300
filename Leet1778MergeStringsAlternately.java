public class Leet1778MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder(word1.length() + word2.length());

        while (i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }

        while (i < word1.length()) {
            sb.append(word1.charAt(i++));
        }
        while (j < word2.length()) {
            sb.append(word2.charAt(j++));
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        Leet1778MergeStringsAlternately leet = new Leet1778MergeStringsAlternately();
        System.out.println(leet.mergeAlternately("ab", "pqrs"));

    }

}
