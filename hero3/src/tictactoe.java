import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tictactoe {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        int T=Integer.parseInt(br.readLine());
        int arr2[]=new int[T];
        for(int i=0;i<T;i++) {
            int temp = 0;
            String arr[][] = new String[3][3];
            String arr1[] = new String[3];
            int x = 0, u = 0, o = 0;
            for (int j = 0; j < 3; j++) {
                String s = br.readLine();
                arr1[j]=s;
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
            if (u == 0) {
                if (x == 5 && o == 4) {
                    temp = 1;
                } else {
                    temp = 3;
                }
            } else {
                if (u % 2 == 0 && x == o + 1) {
                    if (x <= 5 && u <= 4)
                        temp = 2;
                    else
                        temp = 3;
                }
                else if (u % 2 != 0 && x == o) {
                    if (x <= 5 && o <= 4)
                        temp = 2;
                    else
                        temp = 3;
                }
                else
                {
                    temp=3;
                }
            }
            if(temp==1||temp==2)
            {
                for(int j=0;j<3;j++)
                {
                    if("XXX".equals(arr1[j])){
                        if(x!=o+1)
                        {
                            temp=3;
                        }
                        else {
                            temp=1;
                        }
                    }
                    if("OOO".equals(arr1[j]))
                    {
                        if(x!=o)
                            temp=3;
                    }
                    if("XXX".equals(arr[0][j]+arr[1][j]+arr[2][j]))
                    {
                        if(x!=o+1)
                            temp=3;
                        else
                            temp=1;
                    }
                    if("OOO".equals(arr[0][j]+arr[1][j]+arr[2][j]))
                    {
                        if(x!=o)
                            temp=3;
                    }
                }
                if("XXX".equals(arr[0][0]+arr[1][1]+arr[2][2])||"XXX".equals(arr[0][2]+arr[1][1]+arr[2][0]))
                {
                    if(x!=o+1)
                        temp=3;
                    else
                        temp=1;
                }
                if("OOO".equals(arr[0][0]+arr[1][1]+arr[2][2])||"OOO".equals(arr[0][2]+arr[1][1]+arr[2][0]))
                {
                    if(x!=o)
                        temp=3;
                }
            }
            arr2[i] = temp;
        }
        for(int i=0;i<T;i++)
        {
            System.out.println(arr2[i]);
        }
    }
}
