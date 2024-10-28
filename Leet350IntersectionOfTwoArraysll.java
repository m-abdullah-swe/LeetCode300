import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Leet350IntersectionOfTwoArraysll {

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1 = new HashMap<>();
        for (int i =0; i<nums1.length; i++){
            if (!map1.containsKey(nums1[i])){
                map1.put(nums1[i], 1);
            }
            else {
                map1.put(nums1[i], map1.get(nums1[i]) + 1);
            }        
        }
                Map<Integer,Integer> map2 = new HashMap<>();
        for (int i =0; i<nums2.length; i++){
            if (!map2.containsKey(nums2[i])){
                map2.put(nums2[i], 1);
            }
            else {
                map2.put(nums2[i], map2.get(nums2[i]) + 1);
            }        
        }

       
        List<Integer> ints = new ArrayList<>();

        for (Entry<Integer,Integer> entry : map1.entrySet()){
            int value = entry.getValue();  
            int key = entry.getKey();

            if (map2.containsKey(key)){
                if (map2.get(key) >= value){
                    for (int j = 0; j < value; j++){
                        ints.add(key);
                    }
                }
                if (map2.get(key)< value){
                    for (int j = 0;j < map2.get(key); j++){
                        ints.add(key);
                    }
                }
            }
        }

        int[] result = new int[ints.size()];

        for (int j = 0; j < result.length; j++) {
            result[j] = ints.get(j);
        }

        return result;
    }

    public static void main(String[] args) {
        Leet350IntersectionOfTwoArraysll leet350IntersectionOfTwoArraysll = new Leet350IntersectionOfTwoArraysll();
        int[] a = { 4, 9, 5};
        int[] b = { 9, 4, 9, 8, 4};
        System.err.println(Arrays.toString(leet350IntersectionOfTwoArraysll.intersect(a, b)));
    }
}
