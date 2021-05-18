import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class golf {
    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int T = Integer.parseInt(br.readLine());
        String arr[] = new String[T];
        for (int i = 0; i < T; i++) {
            int arr1[] = new int[3];
            String in = br.readLine();
            arr1[0] = Integer.parseInt(in.substring(0, in.indexOf(' ')));
            in = in.substring(in.indexOf(' ') + 1);
            arr1[1] = Integer.parseInt(in.substring(0, in.indexOf(' ')));
            in = in.substring(in.indexOf(' ') + 1);
            arr1[2] = Integer.parseInt(in.substring(0));

            if (arr1[1] > 0 && arr1[1] < arr1[0] + 2) {
                if(arr1[1]%arr1[2]==0||(arr1[0]+1-arr1[1])%arr1[2]==0)
                {
                    arr[i]="YES";
                }
                else
                {
                    arr[i]="No";
                }
            }
        }
        for(int i=0;i<T;i++)
        {
            System.out.println(arr[i]);
        }
    }

}
