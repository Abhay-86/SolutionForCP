import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class cft {
    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = "";
        int l1 = s1.length();
        int l2 = s2.length();
        if (l1 == l2) {
            for (int i = 0; i < l1; i++) {
                for (int j = 0; j < l2; j++) {
                    if (s1.charAt(i) == s2.charAt(j)) {
                        if (j == 0) {
                            s3 = s3 + "0";
                            s2 = s2.substring(1,l1) + Character.toString('0');
                            break;
                        } else if (j == l1 - 1) {
                            s3 = s3 + "0";
                            s2 = s2.substring(0,l1-1) + Character.toString('0');
                            break;
                        } else {
                            s3 = s3 + "0";
                            s2 = s2.substring(0, j) + s2.substring(j + 1, l1 );
                            break;
                        }
                    }
                }
            }

            if (s3.equals(s2)) {
                System.out.println("They are anagram");
            }
            else
            {
                System.out.println("not anagram");
            }
        } else {
            System.out.println("They are not anagram");
        }
    }
}