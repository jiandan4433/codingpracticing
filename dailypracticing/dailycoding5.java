package dailypracticing;

public class dailycoding5 {

        public static void main(String []arg)
        {
        multiplication_matrix(3,4,3);
        multiplication_matrix(1,3,3);
        }

    public static void multiplication_matrix(int firstvalues , int rows, int cols)
    {
        int count = firstvalues;
        int A[][] = new int[rows][cols];
        int B[][] = new int[cols][rows];
        int C[][] = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i][j] = count;
                B[j][i] = count;
                count++;
            }
        }

        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                count = cols;
                for (int k = 0; k < cols; k++)
                {
                    if (count != 0)
                        C[i][j] = C[i][j] + A[i][k] * B[k][j];

                }
                count--;
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
