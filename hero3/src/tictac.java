import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tictac {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        int T=Integer.parseInt(br.readLine());
        int arr2[]=new int[T];
        for(int i=0;i<T;i++) {
            char arr[][] = new char[3][3];
            int x = 0;
            int u = 0;
            int o = 0;
            int x1 = 0;
            int u1 = 0;
            int o1 = 0;
            int temp=0;
            for (int j = 0; j < 3; j++) {
                String s = br.readLine();
                arr[j][0] = s.charAt(0);
                arr[j][1] = s.charAt(1);
                arr[j][2] = s.charAt(2);
                if(s.charAt(0)=='X')
                    x++;
                if(s.charAt(1)=='X')
                    x++;
                if(s.charAt(2)=='X')
                    x++;
                if(s.charAt(0)=='O')
                    o++;
                if(s.charAt(1)=='O')
                    o++;
                if(s.charAt(2)=='O')
                    o++;
                if(s.charAt(0)=='_')
                    u++;
                if(s.charAt(1)=='_')
                    u++;
                if(s.charAt(2)=='_')
                    u++;

            }
            if((arr[0][0]=='X'&&arr[0][1]=='X')&&arr[0][2]=='X')
                x1++;
            if((arr[1][0]=='X'&&arr[1][1]=='X')&&arr[1][2]=='X')
                x1++;
            if((arr[2][0]=='X'&&arr[2][1]=='X')&&arr[2][2]=='X')
                x1++;
            if((arr[0][0]=='X'&&arr[1][0]=='X')&&arr[2][0]=='X')
                x1++;
            if((arr[0][1]=='X'&&arr[1][1]=='X')&&arr[2][1]=='X')
                x1++;
            if((arr[0][2]=='X'&&arr[1][2]=='X')&&arr[2][2]=='X')
                x1++;
            if((arr[0][0]=='X'&&arr[1][1]=='X')&&arr[2][2]=='X')
                x1++;
            if((arr[0][2]=='X'&&arr[1][1]=='X')&&arr[2][0]=='X')
                x1++;


            if((arr[0][0]=='O'&&arr[0][1]=='O')&&arr[0][2]=='O')
                o1++;
            if((arr[1][0]=='O'&&arr[1][1]=='O')&&arr[1][2]=='O')
                o1++;
            if((arr[2][0]=='O'&&arr[2][1]=='O')&&arr[2][2]=='O')
                o1++;
            if((arr[0][0]=='O'&&arr[1][0]=='O')&&arr[2][0]=='O')
                o1++;
            if((arr[0][1]=='O'&&arr[1][1]=='O')&&arr[2][1]=='O')
                o1++;
            if((arr[0][2]=='O'&&arr[1][2]=='O')&&arr[2][2]=='O')
                o1++;
            if((arr[0][0]=='O'&&arr[1][1]=='O')&&arr[2][2]=='O')
                o1++;
            if((arr[0][2]=='O'&&arr[1][1]=='O')&&arr[2][0]=='O')
                o1++;

            if (x1 == 1 && o1 == 1)
                temp = 3;
            else if (x - o < 0 || x - o > 1)
                temp = 3;
            else if ((x == 0 && o == 0) && u == 9)
                temp = 2;
            else if (x1 == 1&&x==o+1)
                temp = 1;
            else if(x1==2&&x==o+1)
                temp=1;
            else if (o1 == 1&&x==o)
                temp = 1;
            else if ((x1 == 0 && o1 == 0)&&u==0)
                temp = 1;
            else if ((x1 == 0 && o1 == 0)&&u!=0)
                temp = 2;
            else
                temp = 3;

            arr2[i]=temp;
        }
        for(int i=0;i<T;i++)
        {
            System.out.println(arr2[i]);
        }
    }
}
