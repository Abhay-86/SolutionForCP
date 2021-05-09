import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ert
{
    public static void main(String[] args) throws IOException {
        InputStreamReader br = new InputStreamReader(System.in);
        BufferedReader r = new BufferedReader(br);
        int a = Integer.parseInt(r.readLine());
        long arr[]=new long[a];
        for (int i = 0; i < a; i++) {
            String st = r.readLine();
            String se[] = st.split(" ");
            long b = Long.parseLong(se[0]);
            long c = Long.parseLong(se[1]);
            long d = Long.parseLong(se[2]);
            long e = d / b;
            long f = d % b;
            long g;
            if (f == 0) {
                g = (b - 1) * c + e;
            } else {
                g = (f - 1) * c + e + 1;
            }
            arr[i]=g;
        }
        for(int j=0;j<a;j++)
        {
            System.out.println(arr[j]);
        }
    }
}