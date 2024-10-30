public class Leet69Sqrt {
    public int mySqrt(int x){
        if(x < 2) return x;
        return (int)Math.sqrt(x);
    }
    public static void main(String[] args) {
        Leet69Sqrt leet = Leet69Sqrt();
        leet.mySqrt(8);

    }
}
