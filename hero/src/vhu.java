import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class vhu
{
    public static void main(String[] args) throws IOException {
        InputStreamReader r= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(r);
            int b=Integer.parseInt(br.readLine());
            String arr1[]=new String[b];
            int g=0;
            for(int k=-1;k<b;k++)
            {
                if(k==-1)
                {
                    for (int j = 0; j<b;j++)
                    {
                        arr1[j]=br.readLine();
                    }
                }
                else
                {
                    for(int l=k+1;l<b;l++)
                    {
                        int l1=arr1[k].lastIndexOf(" ");
                        int l2=arr1[k].length();
                        int l3=arr1[l].lastIndexOf(" ");
                        int l4=arr1[l].length();
                        int l5=Integer.parseInt(arr1[k].substring(l1+1,l2));
                        int l6=Integer.parseInt(arr1[l].substring(l3+1,l4));
                        if(l5>=l6) {
                                String temp = arr1[k];
                                arr1[k] = arr1[l];
                                arr1[l] = temp;
                            }
                        else
                        {
                            continue;
                        }
                    }
                }
            }
            for(int j=0;j<b;j++)
            {
                int m=0;
                int l1=arr1[j].lastIndexOf(" ");
                int l5=arr1[j].length();
                int c=Integer.parseInt(arr1[j].substring(l1+1,l5));
                for(int l=j+1;l<b;l++)
                {
                    int l2=arr1[l].indexOf(" ");
                    if(c>Integer.parseInt(arr1[l].substring(0,l2)))
                    {
                        continue;
                    }
                    else
                    {
                        m+=1;
                        int l3=arr1[l].lastIndexOf(" ");
                        int l4=arr1[l].length();
                        c=Integer.parseInt(arr1[l].substring(l3+1,l4));
                    }
                }
                if(g<m)
                {
                    g=m;
                }
            }
            System.out.println(g+1);
    }
}