import java.util.ArrayList;
import java.util.List;

public class Leet605CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int x = 0;
        List<Integer> map = new ArrayList<>();
        if (flowerbed.length == 1){
            if (flowerbed[0] == 0){
                return true;
            }
        }
        else if (flowerbed.length == 2){
            if (flowerbed[0] == 0 && flowerbed[1] == 0){
                x = 1;
            }
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if (i - 1 >= 0 && flowerbed[i - 1] == 0) {
                    if (i + 1 < flowerbed.length) {
                        if (flowerbed[i + 1] == 0) {
                            if (map.contains(i - 1)) {
                                continue;
                            } else {
                                map.add(i);
                                x++;
                            }
                        }
                    }
                    else if (i+1 == flowerbed.length){
                        map.add(i);
                        x++;
                    }
                } else if (i - 1 == -1) {
                    if (i + 1 < flowerbed.length) {
                        if (flowerbed[i + 1] == 0) {
                            if (map.contains(i - 1)) {
                                continue;
                            } else {
                                map.add(i);
                                x++;
                            }
                        }
                    } else if (i + 1 == flowerbed.length) {
                        map.add(i);
                        x++;
                    }
                }
            }
        }
        System.err.println(n);
        if (x >= n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Leet605CanPlaceFlowers leet = new Leet605CanPlaceFlowers();
        int[] flowerbed = {0, 0 };
        System.err.println(leet.canPlaceFlowers(flowerbed, 2));
    }
}
