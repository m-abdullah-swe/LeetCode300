package ContainsDuplicate;

public class Leet11ContainerWithMostWater {
    public int maxArea(int[] height) {
        // for (int i = 0; i < height.length; i++) {
        // for (int j = 0; j < height.length; j++) {
        // if (height[i] * j) {

        // }
        // }// }
        if (height.length <=2){
            return height[0] * height[0];
        }
        int n = (height.length / 4 )+1;
        System.err.println(n);
        int max = 0, maxIndex = 0;
        for (int i = 0; i < n; i++) {
            if (height[i] > max) {
                max = height[i];
                maxIndex = i;
            }
        }
        System.err.println(max);
        int secondMax = 0, secondIndex = 0;
        System.err.println("Here" + (height.length-1));
        for (int i = height.length-1; i >= height.length - n; i--) {
            if (height[i] > secondMax) {
                secondMax = height[i];
                secondIndex = i;
            }
        }
        System.err.println("Second Max "+secondMax);
        if (max>secondMax){
            return secondMax * secondMax;
        }
        else {
            return max * max;
        }
    }

    public static void main(String[] args) {
        Leet11ContainerWithMostWater solution = new Leet11ContainerWithMostWater();
        int[] height = { 1,2,1};
        System.err.println(solution.maxArea(height));
    }
}
