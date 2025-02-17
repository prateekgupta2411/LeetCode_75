package Hash_Map_Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Equal_Row_Column_Pairs {
    public static int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;

        // Iterate through each row of the grid
        for (int r = 0; r < n; r++) {
            // Iterate through each column of the grid
            for (int c = 0; c < n; c++) {
                // Initialize isEqual within the inner loop to clarify its scope
                boolean isEqual = true;

                // Compare the elements of the row and column
                for (int i = 0; i < n; i++) {
                    if (grid[r][i] != grid[i][c]) {
                        isEqual = false;
                        break;
                    }
                }

                // Increment count only if all elements match
                if (isEqual) {
                    count++;
                }
            }
        }

        return count;
    }

    // Optimal Solution
    public static int equalPairs1(int[][] grid) {
        int n = grid.length;
        int count = 0;

        Map<List<Integer>, Integer> map = new HashMap<>();

        // Store row frequencies in the map
        for (int row = 0; row < n; row++) {
            List<Integer> rowList = new ArrayList<>();
            for (int val : grid[row]) {
                rowList.add(val);
            }
            map.put(rowList, map.getOrDefault(rowList, 0) + 1);
        }

        // Check column frequencies in the map
        for (int c = 0; c < n; c++) {
            List<Integer> colList = new ArrayList<>();
            for (int r = 0; r < n; r++) {
                colList.add(grid[r][c]);
            }
            count += map.getOrDefault(colList, 0);
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}};
        System.out.println(equalPairs1(grid));
    }
}
