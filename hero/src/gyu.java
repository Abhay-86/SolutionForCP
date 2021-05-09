
import java.io.*;

class gyu {
    static int n = 5;

    static void printSumTricky(int mat[][], int k,int l,int c) {
        if (k > l)
            return;

        int stripSum[][] = new int[l][l];


        for (int j = 0; j < l; j++) {

            int sum = 0;
            for (int i = 0; i < k; i++)
                sum += mat[i][j];
            stripSum[0][j] = sum;

            for (int i = 1; i < l - k + 1; i++) {
                sum += (mat[i + k - 1][j] - mat[i - 1][j]);
                stripSum[i][j] = sum;
            }
        }

        for (int i = 0; i < l - k + 1; i++) {

            int sum = 0;
            for (int j = 0; j < k; j++)
                sum += stripSum[i][j];
            System.out.print(sum + " ");


            for (int j = 1; j < l - k + 1; j++) {
                sum += (stripSum[i][j + k - 1] - stripSum[i][j - 1]);
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        int m=Integer.parseInt(br.readLine());
        int n=Integer.parseInt(br.readLine());
        int k=Integer.parseInt(br.readLine());
        int arr[][]=new int[m][n];
        int l=Math.min(m,n);
        int c=Math.max(m,n);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=Integer.parseInt(br.readLine());
            }
        }
        for(int b=2;b<l+1;b++)
        {
            printSumTricky(arr, k,l,c);
        }

    }
}

