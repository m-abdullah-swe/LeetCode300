public class Leet125ValidPalindrome {
    public boolean isPalindrome(String s) {
        boolean flag = false;
        s = s.replaceAll(" ", "");
        s = s.replaceAll(",", "");
        s = s.replaceAll(":", "");
        String str = s.toString();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == str.charAt(i)) {
                flag = true;
            }
            else{
                return false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Leet125ValidPalindrome leet = new Leet125ValidPalindrome();
        String s = "race a car";
        System.out.println(leet.isPalindrome(s));
    }
}
