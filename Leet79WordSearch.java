import java.util.*;
import java.util.Map.Entry;

public class Leet79WordSearch {
    public boolean exist(char[][] board, String word) {
        Map<List,Character> map = new HashMap<>();
        List<Integer> list = new ArrayList<>(2);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (word.contains(board[i][j] + "")) {
                    list.add(i, 0);
                    list.add(j, 1);
                    map.put(list,board[i][j]);
                }
            }
        }

        for (Entry<List,Character> c : map.entrySet()) {
            System.err.println("Char: "+c.getValue());
        }
        return false;
    }

    public static void main(String[] args) {
        Leet79WordSearch leet79WordSearch = new Leet79WordSearch();
        char[][] board = { { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' } };
        System.err.println(leet79WordSearch.exist(board, "ABCCED"));
    }
}
