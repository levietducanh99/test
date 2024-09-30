public class Matrix {
    public static void main(String[] args) {
        // khoi tao 2 ma tran cung co
        int[][] matrix1 = {
            {1, 2, 9},
            {4, 9, 6},
            {9, 8, 9}
        };

        int[][] matrix2 = {
            {9, 9, 9},
            {9, 9, 9},
            {9, 9, 9}
        };

   int rowsSum = matrix1.length;
   int colsSum = matrix1[0].length;
// luu kêt quả
  int[][] result = new int[rowsSum][colsSum];
       
   for (int i = 0; i < rowsSum; i++) {
         for (int j = 0; j < colsSum; j++) {
             result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // in ra màn hình ma trận kết quả bằng vòng lặp
        System.out.println("ket qua phep cong 2 ma tran la :");
        for (int i = 0; i < rowsSum; i++) {
            for (int j = 0; j < colsSum; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
