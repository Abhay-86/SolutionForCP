import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class zxc
{
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        String a= br.readLine();
        int b=a.length();
        int e=a.indexOf(" ");
        int c=a.lastIndexOf(" ");
        String d=a.substring(c+1,b);
        String f=a.substring(0,e);
        System.out.println(d);
        System.out.println(f);
    }
}