public class BooleanMatrix {
    
    public static void modifyMatrix(int[][] mat) {
        int M = mat.length;
        int N = mat[0].length;
        boolean[] row_flag = new boolean[M];
        boolean[] col_flag = new boolean[N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] == 1) {
                    row_flag[i] = true;
                    col_flag[j] = true;
                }
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (row_flag[i] || col_flag[j]) {
                    mat[i][j] = 1;
                }
            }
        }
    }
    public static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat1 = {{1, 0}, {0, 0}};       
        modifyMatrix(mat1);    
        printMatrix(mat1);
    }
}
