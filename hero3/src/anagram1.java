import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class anagram1 {
    public static int main(String s1,String s2) {
        int l1=s1.length();
        int l2=s2.length();
        int Ll,Ls;
        String Sl,Ss;
        int a;
        int l=0;
        if(l2>l1)
        {
            Ll=l2;
            Ls=l1;
            Sl=s2;
            Ss=s1;
        }
        else
        {
            Ll=l1;
            Ls=l2;
            Sl=s1;
            Ss=s2;
        }
        a=Ll;
        for(int i=0;i<Ls;i++)
        {
            for(int j=0;j<Sl.length();j++)
            {
                if(Ss.charAt(i)==Sl.charAt(j)) {
                    if (j == 0) {
                        Sl = Sl.substring(1);
                        break;
                    }
                    else if(j==Sl.length()-1)
                    {
                        Sl=Sl.substring(0,Sl.length()-1);
                        break;
                    }
                    else
                    {
                        Sl=Sl.substring(0,j)+Sl.substring(j+1);
                        break;
                    }
                }
            }
        }
        return Ls-(a-Sl.length())+Sl.length();
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        String s1=br.readLine();
        String s2=br.readLine();
        int l=main(s1,s2);
        System.out.println(l);
    }
}
