import java.awt.*;
import java.awt.image.ImageObserver;
import java.util.Scanner;
import java.awt.Color;
public class brday {
        public static void main(String[] args) {
            Scanner sr =new Scanner(System.in);
            DrawingPanel st = new DrawingPanel(600,600);
            Graphics g = st.getGraphics();
            System.out.println("Please enter ur name");
            String  c=sr.nextLine().toUpperCase();
            g.setColor(Color.RED);
            g.setFont(new Font("Name",Font.BOLD,50));
            g.drawString(c,200,200);
            System.out.println("hello\n "+ c +"\nplease enter ur year of ur birth\n");
            int a=sr.nextInt();
            date se=new date();
            int b= se.date(a);
            g.setFont(new Font("all",Font.BOLD,20));
            g.setColor(Color.BLACK);
            g.drawString("Wohh...u have crossed "+b+" year of ur life and still alive..great",10,300);
            g.setColor(Color.GREEN);
            g.setFont(new Font("HAPPY BIRTHDAY",Font.BOLD,50));
            g.drawString("HAPPY BIRTHDAY",100,100);
        }
    }


