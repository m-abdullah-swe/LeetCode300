class Leet9PalindromeNumber {
        public boolean isPalindrome(int x) {
            boolean flag = false;
            String num = "" + x;
            if (num.length() == 1) {
                return true;
            }

            int i = 0, j = num.length() - 1;
            while (i != j && i < j) {
                if (num.charAt(i) == num.charAt(j)) {
                    flag = true;
                } else {
                    return false;
                }
                i++;
                j--;
            }

            return flag;
        }
    
    public static void main(String[] args) {
        Leet9PalindromeNumber leet9PalindromeNumber = new Leet9PalindromeNumber();
        System.out.println(leet9PalindromeNumber.isPalindrome(1000021)); // true
    }
}