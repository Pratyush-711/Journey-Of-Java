public class CWH_PracticeSet_06_4 {

    public static void main(String[] args) {
            int[][] a = {{1, 2, 3}, {4, 5, 6}};
            int[][] b = {{7, 8, 9}, {1, 2, 3}};
            int[][] sum = new int[2][3];

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    sum[i][j] = a[i][j] + b[i][j];
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
    }
}
