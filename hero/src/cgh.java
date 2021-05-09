
import java.io.*;

    class cgh{
        static int n = 5;
        static void printSumTricky(int mat[][], int k) {
            if (k > n)
                return;
            int stripSum[][] = new int[n][n];
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int i = 0; i < k; i++) {
                    sum += mat[i][j];
                }
                stripSum[0][j] = sum;

                for (int i = 1; i < n - k + 1; i++) {
                    sum += (mat[i + k - 1][j] - mat[i - 1][j]);
                    stripSum[i][j] = sum;
                }
            }
            for (int i = 0; i < n - k + 1; i++) {
                int sum = 0;
                for (int j = 0; j < k; j++) {
                    sum += stripSum[i][j];
                    System.out.print(sum + " ");
                }
                for (int j = 1; j < n - k + 1; j++) {
                    sum += (stripSum[i][j + k - 1] - stripSum[i][j - 1]);
                    System.out.print(sum + " ");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) throws IOException {
            InputStreamReader r=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(r);
            int mat[][] = new int[n][n];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    mat[i][j]=Integer.parseInt(br.readLine());
                }
            }
            int k = 3;
            printSumTricky(mat, k);
        }
    }


