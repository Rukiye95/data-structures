import java.util.ArrayList;
import java.util.List;

public class SpiralTraverseRecursive {
    public static void main(String[] args) {
        int[][] matrix= { {1, 2 ,3,4}, {12, 13, 14,5 },{11, 16, 15, 6}, { 10, 9, 8,7}};
        spiralTraverseRecursive(matrix).forEach(System.out::println);
    }
    public static List<Integer> spiralTraverseRecursive(int[][] array) {
        if (array.length == 0) return new ArrayList<Integer>();
        var result = new ArrayList<Integer>();
        spiralRecursive(array, 0, array.length - 1, 0, array[0].length - 1, result);
        return result;
    }
    public static void spiralRecursive( int[][] array,int startRow,int endRow,
            int startCol,int endCol, ArrayList<Integer> result) {
        // Base condition- Termination Criteria
        if (startRow > endRow || startCol > endCol) {
            return;
        }
        // up row
        for (int col = startCol; col <= endCol; col++) {
            result.add(array[startRow][col]);
        }
        // left col
        for (int row = startRow + 1; row <= endRow; row++) {
            result.add(array[row][endCol]);
        }
        // bottom row
        for (int col = endCol - 1; col >= startCol; col--) {

            if (startRow == endRow) break;
            result.add(array[endRow][col]);
        }
        //right col
        for (int row = endRow - 1; row >= startRow + 1; row--) {
            if (startCol == endCol) break;
            result.add(array[row][startCol]);
        }
        spiralRecursive(array, startRow + 1, endRow - 1, startCol + 1, endCol - 1, result);
    }
}
