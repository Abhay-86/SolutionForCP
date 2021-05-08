import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SOLBTY {
    public static void main(String[] args) throws IOException {
        InputStreamReader r= new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        int T=Integer.parseInt(br.readLine());
        String b=br.readLine();
        System.out.println(b);
        int arr[]=new int[3];
        try {
            arr[0] = Integer.parseInt(b.substring(0, b.indexOf(' ')));
        }
        catch (Exception e) {
            System.out.println("exception1");
        }
        b=b.substring(b.indexOf(' ')+1);
        try {
            arr[1] = Integer.parseInt(b.substring(0, b.indexOf(' ')));
        }
        catch (Exception c)
        {
            System.out.println("exception2");
        }
        b=b.substring(b.indexOf(' ')+1);
        try {
            arr[2] = Integer.parseInt(b.substring(' ') + 1);
        }
        catch(Exception d)
        {
            System.out.println("exception3");
        }
        for(int i=0;i<3;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
