import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualRowAndColumnPairs {

    public static void main(String[] args) {
        System.out.println(equalPairs(new int[][] { { 3, 2, 1 }, { 1, 7, 6 }, { 2, 7, 7 } }));
        System.out.println(equalPairs(new int[][] { { 3, 1, 2, 2 }, { 1, 4, 4, 5 }, { 2, 4, 2, 2 }, { 2, 4, 2, 2 } }));
    }

    public static int equalPairs(int[][] grid) {

        Map<List<Integer>, Integer> rows = new HashMap<>();
        Map<List<Integer>, Integer> columns = new HashMap<>();

        for (int[] row : grid) {
            List<Integer> rowList = new ArrayList<>();
            for (int num : row) {
                rowList.add(num);
            }

            rows.put(rowList, rows.getOrDefault(rowList, 0) + 1);
        }

        int rowCount = grid.length;
        int colCount = grid[0].length;

        for (int col = 0; col < colCount; col++) {
            List<Integer> columnList = new ArrayList<>();
            for (int row = 0; row < rowCount; row++) {
                columnList.add(grid[row][col]);
            }

            columns.put(columnList, columns.getOrDefault(columnList, 0) + 1);
        }


        int count = 0;
        for (Map.Entry<List<Integer>, Integer> rowEntry : rows.entrySet()) {
            List<Integer> rowKey = rowEntry.getKey();
            Integer rowValue = rowEntry.getValue();
        
            if (columns.containsKey(rowKey)) {
                Integer columnValue = columns.get(rowKey);
                int sum = rowValue * columnValue;
                
                count += sum;
            }
        }
        

        return count;
    }
}