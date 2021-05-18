
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tictactoe1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        int T=Integer.parseInt(br.readLine());
        int arr2[]=new int[T];
        for(int i=0;i<T;i++) {
            int temp = 0;
            String arr[][] = new String[3][3];
            String arr1[] = new String[3];
            String arr3[]=new String[3];
            int x = 0, u = 0, o = 0;
            int x1 = 0;
            int u1 = 0;
            int o1 = 0;
            for (int j = 0; j < 3; j++) {
                String s = br.readLine();
                arr1[j] = s;
                for (int k = 0; k < 3; k++) {
                    arr[j][k] = String.valueOf(s.charAt(k));
                    if (s.charAt(k) == 'X') {
                        x++;
                    } else if (s.charAt(k) == 'O') {
                        o++;
                    } else {
                        u++;
                    }
                }
            }
            arr3[0]=arr[0][0]+arr[1][0]+arr[2][0];
            arr3[1]=arr[0][1]+arr[1][1]+arr[2][1];
            arr3[2]=arr[0][2]+arr[1][2]+arr[2][2];
            if ("XXX".equals(arr1[0]))
                x1++;
            if ("XXX".equals(arr1[1]))
                x1++;
            if ("XXX".equals(arr1[2]))
                x1++;
            if ("XXX".equals(arr3[0]))
                x1++;
            if ("XXX".equals(arr3[1]))
                x1++;
            if ("XXX".equals(arr3[2]))
                x1++;
            if ("OOO".equals(arr3[0]))
                o1++;
            if ("OOO".equals(arr3[1]))
                o1++;
            if ("OOO".equals(arr3[2]))
                o1++;
            if ("OOO".equals(arr1[0]))
                o1++;
            if ("OOO".equals(arr1[1]))
                o1++;
            if ("OOO".equals(arr1[2]))
                o1++;
            if ("XXX".equals(arr[0][0] + arr[1][1] + arr[2][2]) || "XXX".equals(arr[0][2] + arr[1][1] + arr[2][0]))
                x1++;
            if ("OOO".equals(arr[0][0] + arr[1][1] + arr[2][2]) || "OOO".equals(arr[0][2] + arr[1][1] + arr[2][0]))
                o1++;
            if (x1 == 1 && o1 == 1)
                temp = 3;
            else if (x - o < 0 || x - o > 1)
                temp = 3;
            else if ((x == 0 && o == 0) && u == 9)
                temp = 2;
            else if (x1 == 1&&x==o+1)
                    temp = 1;
             else if (o1 == 1&&x==o)
                    temp = 1;
             else if ((x1 == 0 && o1 == 0)&&u==0)
                    temp = 1;
             else
                temp = 3;

            arr2[i] = temp;
        }
        for(int i=0;i<T;i++)
        {
            System.out.println(arr2[i]);
        }
    }
}
