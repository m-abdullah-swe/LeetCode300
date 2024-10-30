public class Leet70ClimbingStairs {

    public int climbStairs(int n) {
        if (n <= 3) 
            return n;
        else if (n == 4)
            return 5;
        else if (n == 5)
            return 8;
        else if (n == 6)
            return 13;

        return climbStairs(n - 2) + climbStairs(n - 1);
    }

    public static void main(String[] args) {
        int n = 6;
        Leet70ClimbingStairs leet = new Leet70ClimbingStairs();
        System.err.println(leet.climbStairs(n));
    }
}
