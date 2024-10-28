import java.util.Arrays;

public class Leet506RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        String[] answer = new String[score.length];
        int first, second = -1, third = -1;
        int[] duplicate = Arrays.copyOf(score, score.length);
        Arrays.sort(duplicate);
        first = duplicate[score.length - 1];

        if (score.length >= 2) {
            second = duplicate[score.length - 2];
        }
        if (score.length >= 3) {
            third = duplicate[score.length - 3];
        }

        for (int i = 0; i < answer.length; i++) {
            if (score[i] == first) {
                answer[i] = "Gold Medal";
                continue;
            } else if (score[i] == second) {
                answer[i] = "Silver Medal";
                continue;
            } else if (score[i] == third) {
                answer[i] = "Bronze Medal";
                continue;
            } else {
                answer[i] = getRank(score[i], duplicate);
            }
        }

        return answer;
    }

    public String getRank(int i, int[] array) {
        for (int j = 0; j < array.length; j++) {
            if (array[j] == i) {
                return (array.length - j) + "";
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Leet506RelativeRanks  leet = new Leet506RelativeRanks();
        int[] score = {10,3,7,9,2};
        System.err.println(Arrays.toString(leet.findRelativeRanks(score)));

    }
}
