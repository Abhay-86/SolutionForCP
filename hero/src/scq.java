import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class scq
{
    public static void main(String[] args) throws IOException {
        InputStreamReader r= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(r);
        int a=Integer.parseInt(br.readLine());
        int arr2[]= new int[a];
        for(int i=0;i<a;i++)
        {
            int b=Integer.parseInt(br.readLine());
            String arr1[]=new String[b];
            int g=0;
            for(int k=0;k<b;k++)
            {
                arr1[k]=br.readLine();
            }
            for(int j=0;j<b;j++)
            {
                int m=0;
                int c=Integer.parseInt(String.valueOf(arr1[j].charAt(2)));
                for(int l=j+1;l<b;l++)
                {
                    if(l==b-1)
                    {
                        break;
                    }
                    else
                    {
                        if(c>Integer.parseInt(String.valueOf(arr1[l].charAt(0)))) {
                            continue;
                        }
                       else
                        {
                            m+=1;
                            c=Integer.parseInt(String.valueOf(arr1[l].charAt(2)));
                        }
                    }
                }
                if(g<m)
                {
                    g=m;
                }
            }
            arr2[i]=g;
        }
        for(int i=0;i<a;i++)
        {
            System.out.println(arr2[i]);
        }
    }
}