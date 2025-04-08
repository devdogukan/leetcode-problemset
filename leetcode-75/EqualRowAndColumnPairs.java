import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColumnPairs {

    public static void main(String[] args) {
        System.out.println(equalPairs(new int[][] { { 3, 2, 1 }, { 1, 7, 6 }, { 2, 7, 7 } }));
        System.out.println(equalPairs(new int[][] { { 3, 1, 2, 2 }, { 1, 4, 4, 5 }, { 2, 4, 2, 2 }, { 2, 4, 2, 2 } }));
        System.out.println(equalPairs(new int[][]  { { 11, 1 }, { 1, 11 } }));
    }

    public static int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String, Integer> rowCount = new HashMap<>();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(grid[i][j]).append(",");
            }
            String rowKey = sb.toString();
            rowCount.put(rowKey, rowCount.getOrDefault(rowKey, 0) + 1);
        }

        int count = 0;
        for (int j = 0; j < n; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(grid[i][j]).append(",");
            }
            String colKey = sb.toString();
            count += rowCount.getOrDefault(colKey, 0);
        }

        return count;   
    }
}