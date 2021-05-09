import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class rty {
    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int c = Integer.parseInt(br.readLine());
        System.out.println(c);
        int arr[]=new int[c];
        int d=0;
        for (int k = 0; k < c; k++) {
            String s1 = br.readLine();
            System.out.println(s1);
            String s2 = br.readLine();
            System.out.println(s2);
            int l1 = s1.length();
            int l2 = s2.length();
            int a = 0;
            int b = 0;
            if (l1 >= l2) {
                for (int i = 0; i < l1; l1++) {
                    for (int j = i; j < l1; j++) {
                        if (j - i + 1 <= l2 - 1) {
                            String s3 = s1.substring(i, j);
                            System.out.println(s3);
                            if (s3 == s2) {
                                d=1;
                                int l3 = s3.length();
                                if (a <= l3) {
                                    a = l3;
                                    b = l1 + l2 - 2 * l3;
                                    System.out.println(b);
                                } else {

                                    continue;
                                }
                            }
                        } else {
                            break;
                        }
                    }
                }
            } else {
                for (int i = 0; i < l2; l1++) {
                    for (int j = i; j < l2; j++) {
                        if (j - i + 1 <= l1 - 1) {
                            String s3 = s2.substring(i, j);
                            if (s3 == s1) {
                                int l3 = s3.length();
                                if (a <= l3) {
                                    a = l3;
                                    b = l1 + l2 - 2 * l3;
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            arr[k]=b;
        }
        for(int l=0;l<c;l++)
        {
            System.out.println(arr[l]);
        }
    }
}