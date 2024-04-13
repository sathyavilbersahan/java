public class symmetricmatrix {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 2, 3, 4 }, { 4, 5, 6 } };
        if (matrix(arr)) {
            System.out.println("is symmetric ");
        } else {
            System.out.println("is not symmetric");
        }
    }

    public static boolean matrix(int[][] arr) {
        int row = arr.length;
        int columns = arr[0].length;
        if (row != columns) {
            return false;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}