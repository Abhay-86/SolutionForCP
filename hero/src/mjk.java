import java.util.Scanner;

public class mjk {
    public static void main(String[] args) {
        Scanner st=new Scanner(System.in);
        int a = st.nextInt();
        String arr[]=new String[a];
        for(int i=0;i<a;i++)
        {
            int b=st.nextInt();
            int c=st.nextInt();
            String d= st.next();
            String e="";
            if(c%10==0)
            {
                for(int j=0;j<c;j=j+10)
                {
                    e=e+"**********";
                }
            }

            else if(c%9==0)
            {
               for(int j=0;j<c;j=j+9)
                {
                   e=e+"*********";
                }
            }
            else if(c%8==0)
            {
                for(int j=0;j<c;j=j+8)
                {
                    e=e+"********";
                }
            }
            else if(c%7==0)
            {
                for(int j=0;j<c;j=j+7)
                {
                    e=e+"*******";
                }
            }
            else if(c%6==0)
            {
                for(int j=0;j<c;j=j+6)
                {
                    e=e+"******";
                }
            }
            else if(c%5==0)
            {
                for(int j=0;j<c;j=j+5)
                {
                    e=e+"*****";
                }
            }
            else if(c%4==0)
            {
                for(int j=0;j<c;j=j+4)
                {
                    e=e+"****";
                }
            }
            else if(c%3==0)
            {
                for(int j=0;j<c;j=j+3)
                {
                    e=e+"***";
                }
            }
            else if(c%2==0)
            {
                for(int j=0;j<c;j=j+2)
                {
                    e=e+"**";
                }
            }
            else
            {
                e=e+"*";
                for(int j=1;j<c;j=j+2)
                {
                    e=e+"**";
                }
            }
            boolean f=d.contains(e);
            if(f)
            {
                arr[i]="YES";
            }
            else
            {
                arr[i]="NO";
            }
        }
        for(int k=0;k<a;k++) {
            System.out.println(arr[k]);
        }
    }
}
