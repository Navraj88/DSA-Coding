public class binarySearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0, high = m - 1;
        int row = 0;

        // 1️⃣ Find correct row
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (matrix[mid][0] == target) {
                return true;
            }
            else if (matrix[mid][0] < target) {
                row = mid;          // possible row
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        // 2️⃣ Binary search inside the row
        low = 0;
        high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (matrix[row][mid] == target) {
                return true;
            }
            else if (matrix[row][mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return false;
    }
}
