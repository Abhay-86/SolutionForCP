import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class asd
{
    public static void main(String[] args) throws IOException {
        InputStreamReader r= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(r);
        int a=Integer.parseInt(br.readLine());
        String arr1[]=new String[a];
        int g=0;
        for(int k=0;k<a;k++)
        {
            arr1[k]=br.readLine();
        }
        for(int j=0;j<a;j++)
        {
            int m=0;
            int l1=arr1[a-j-1].lastIndexOf(" ");
            int l2=arr1[a-j-1].length();
            int c=Integer.parseInt(arr1[a-j-1].substring(l1+1,l2));
            for(int l=j+1;l<a;l++)
            {
                int l3=arr1[a-l].indexOf(" ");
                int d=Integer.parseInt(arr1[a-l].substring(0,l3));
                if(c<=d)
                {
                    m+=1;
                    int l4=arr1[a-l].lastIndexOf(" ");
                    int l5=arr1[a-l].length();
                    c=Integer.parseInt(arr1[a-l].substring(l4+1,l5));
                    if(a-l==1)
                    {
                        int e=Integer.parseInt(arr1[0].substring(0,arr1[0].indexOf(" ")));
                        if(c<=e)
                        {
                            m+=1;
                        }
                    }
                }
            }
            if(m>g)
            {
                g=m;
            }
        }
        System.out.println(g+1);
    }
}