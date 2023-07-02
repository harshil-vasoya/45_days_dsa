public class day_1_set_metrix_zeros {
    //    Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
//
//You must do it in place.
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}};
//        //output
//    /*1 0 1
//      0 0 0
//      1 0 1
//     */
        solution(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    public  static  void solution(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean col0 = false;
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) col0 =true;
            for (int j = 1; j < cols; j++)
                if (matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
        }
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            if (col0) matrix[i][0] = 0;
        }

    }

}
