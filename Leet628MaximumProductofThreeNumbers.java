import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leet628MaximumProductofThreeNumbers {

    // public int maximumProduct(int[] score) {
    //     int[] duplicate = Arrays.copyOf(score, score.length);
    //     Arrays.sort(duplicate);

    //     if (duplicate[0] < 0 && duplicate[1] < 0 && duplicate[score.length - 1] > 0) {
    //         if (duplicate[0] * duplicate[1] >= duplicate[score.length - 2] * duplicate[score.length - 3]) {
    //             return duplicate[0] * duplicate[1] * duplicate[score.length - 1];
    //         } else {
    //             return duplicate[score.length - 3] * duplicate[score.length - 2] * duplicate[score.length - 1];
    //         }
    //     } else if (duplicate[0] < 0 && duplicate[1] < 0 && duplicate[score.length - 1] > 0) {
    //         return duplicate[0] * duplicate[1] * duplicate[2];
    //     } else
    //         return duplicate[score.length - 1] * duplicate[score.length - 2] * duplicate[score.length - 3];
    // }

    public int maximumProduct(int[] score) {
        Arrays.sort(score);
        int n = score.length;
        int option1 = score[n - 1] * score[n - 2] * score[n - 3]; 
        int option2 = score[0] * score[1] * score[n - 1]; 
        
        return Math.max(option1, option2);
    }

    public static void main(String[] args) {
        Leet628MaximumProductofThreeNumbers leet = new Leet628MaximumProductofThreeNumbers();
        int[] nums = { -710, -107, -851, 657, -14, -859, 278, -182, -749, 718, -640, 127, -930, -462, 694, 969, 143,
                309, 904, -651, 160, 451, -159, -316, 844, -60, 611, -169, -73, 721, -902, 338, -20, -890, -819, -644,
                107, 404, 150, -219, 459, -324, -385, -118, -307, 993, 202, -147, 62, -94, -976, -329, 689, 870, 532,
                -686, 371, -850, -186, 87, 878, 989, -822, -350, -948, -412, 161, -88, -509, 836, -207, -60, 771, 516,
                -287, -366, -512, 509, 904, -459, 683, -563, -766, -837, -333, 93, 893, 303, 908, 532, -206, 990, 280,
                826, -13, 115, -732, 525, -939, -787 };
        System.out.println(leet.maximumProduct(nums));
    }
}
