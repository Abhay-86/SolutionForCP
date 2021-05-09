import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class zfd {
    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int g = Integer.parseInt(br.readLine());
        int arr1[] = new int[g];
        for (int t = 0; t < g; t++) {
            String sa=br.readLine();
            String arr4[]=sa.split(" ");
            int m = Integer.parseInt(arr4[0]);
            int n = Integer.parseInt(arr4[1]);
            int c = Integer.parseInt(arr4[2]);
            int l = Math.min(m, n);
            int arr[][] = new int[m][n];
            int d = 0;
            for (int i = 0; i < m; i++) {
                String s=br.readLine();
                String arr5[]=s.split(" ");
                for (int j = 0; j < n; j++) {
                    arr[i][j]=Integer.parseInt(arr5[j]);
                    if (arr[i][j] >= c) {
                        d += 1;
                    }
                }
            }
            int b = 0;
            for (int i = 2; i < l + 1; i++) {
                b = sum(arr, l, i, m, n, c) + b;
            }
            arr1[t] = b + d;
        }
        for (int i = 0; i < g; i++) {
            System.out.println(arr1[i]);
        }
    }

    static int sum(int[][] arr, int l, int k, int m, int n, int c) {
        int arr2[][] = new int[m][n];
        int arr1[][] = new int[m][n];
        if (k <= l) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int sum1 = 0;
                    for (int a = j; a < k + j; a++) {
                        sum1 = arr[i][a] + sum1;
                    }
                    arr1[i][j] = sum1;
                    if (j == n - k) {
                        break;
                    }
                }
            }
            int sum3 = 0;
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < m; i++) {
                    int sum2 = 0;
                    for (int a = i; a < k + i; a++) {
                        sum2 += arr1[a][j];
                    }
                    if (sum2 / (k * k) >= c) {
                        sum3 += 1;
                    }
                    arr2[i][j] = sum2;
                    if (i == m - k) {
                        break;
                    }
                }
            }
            return sum3;
        } else {
            return 0;
        }
    }
}
