import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SOLBTY {
    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String b = br.readLine();
            System.out.println(b);
            int arr[] = new int[3];
            arr[0] = Integer.parseInt(b.substring(0, b.indexOf(' ')));
            b = b.substring(b.indexOf(' ') + 1);
            arr[1] = Integer.parseInt(b.substring(0, b.indexOf(' ')));
            b = b.substring(b.indexOf(' ') + 1);
            arr[2] = Integer.parseInt(b.substring(0));
        }
    }
}
