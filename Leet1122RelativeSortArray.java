import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leet1122RelativeSortArray {
    
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i< arr2.length; i++){
            map.put(i, arr2[i]);
        }

        for (int i = 0; i< arr1.length; i++){
            if (map.containsValue(arr1[i])){
                arr1[i] = 0;
            }
        }
        Arrays.sort(arr1);

        for (int i = 0; i< arr2.length; i++){
            arr1[i] = map.get(i);
        }

        return arr1;
    }


    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 4 };
        int[] arr2 = { 2, 1, 3, 4 };

        System.out.println(Arrays.toString(relativeSortArray(arr,arr2)));
    }
}
