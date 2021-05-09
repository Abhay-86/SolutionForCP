import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class golf {
    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int T = Integer.parseInt(br.readLine());
        int arr[] = new int[T];
        for (int i = 0; i < T; i++) {
            int arr1[] = new int[3];
            String in = br.readLine();
            arr1[0] = Integer.parseInt(in.substring(0, in.indexOf(' ')));
            in = in.substring(in.indexOf(' ') + 1);
            arr[1] = Integer.parseInt(in.substring(0, in.indexOf(' ')));
            in = in.substring(in.indexOf(' ') + 1);
            arr[2] = Integer.parseInt(in.substring(0));

            if (arr[1] > 0 && arr[1] < arr[0] + 2) {
                if(arr[1]/arr[2]==0||(arr[2]+1)/)
                {
                    arr[i]=1;
                }
            }
        }
    }

}
