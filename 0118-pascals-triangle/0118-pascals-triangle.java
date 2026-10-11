import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Generate each row one by one
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            // A row at index i has exactly (i + 1) elements
            for (int j = 0; j <= i; j++) {
                // The first and last elements of every row are always 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // Fetch the two adjacent elements from the row directly above
                    List<Integer> prevRow = triangle.get(i - 1);
                    int sum = prevRow.get(j - 1) + prevRow.get(j);
                    row.add(sum);
                }
            }

            // Append the fully constructed row to the triangle
            triangle.add(row);
        }

        return triangle;
    }
}
