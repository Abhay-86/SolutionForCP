import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//reach top left corner to bottom right corner,using DP
public class matrix {
    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        long M = Long.parseLong(br.readLine()); //row
        long N = Long.parseLong(br.readLine()); //column
        long arr[][] = new long[(int) M][(int) N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || j == 0) {
                    arr[i][j] = 1;
                } else if (i == 1 && j > 0) {
                    arr[i][j] = j + 1;
                } else if (j == 1 && i > 0) {
                    arr[i][j] = i + 1;
                } else {
                        arr[i][j] = arr[i - 1][j] + arr[i][j-1];
                }
            }
        }
            for (int i = 0; i < M; i++) {               // this block is just printing that array
                for (int j = 0; j < N; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println("");
            }
        System.out.println(arr[(int)M-1][(int)N-1]);    // this block will tell number of steps will required
        }
    }
