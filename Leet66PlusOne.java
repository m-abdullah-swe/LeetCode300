import java.util.*;
public class Leet66PlusOne {
    
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {9,8,7,6,6,5,4,3,2,1,0};
        Leet66PlusOne leet = new Leet66PlusOne();
        System.err.println(Arrays.toString(leet.plusOne(digits)));
    }
}
