import java.awt.*;
import java.awt.Color;
import java.util.Locale;
import java.util.Scanner;

public class birthday {
    public static void main(String[] args) {
        Scanner sr =new Scanner(System.in);
        DrawingPanel st = new DrawingPanel(600,600);
        Graphics g = st.getGraphics();
        System.out.println("Please enter ur name");
        String  c=sr.nextLine().toUpperCase();
        g.setColor(Color.ORANGE);
        g.setFont(new Font("Name",Font.BOLD,40));
        g.setColor(Color.BLACK);
        g.drawOval(155,282,300,300);
        g.drawRect(155,282,300,300);
        g.setColor(Color.BLUE);
        g.drawOval(155,282,150,150);
        g.drawOval(306,282,150,150);
        g.setColor(Color.RED);
        g.drawLine(306,475,305,400);
        g.drawLine(306,550,286,485);
        g.drawLine(306,550,350,485);
        g.drawString("Welcome.... "+c,30,100);
        System.out.println("hello\n "+ c +"\nplease enter ur year of ur birth\n");
        int a=sr.nextInt();
        System.out.println("please enter date of ur birth");
        date se=new date();
        int d=sr.nextInt();
        boolean e=se.time(d);
        if(e)
        {
          int b= se.date(a);
          g.setFont(new Font("all",Font.BOLD,20));
          g.setColor(Color.BLACK);
          g.drawString("Wohh...u have crossed "+b+" year of ur life and still alive..great",10,275);
          g.setColor(Color.blue);
          g.create(100,300,500,40);
          g.setFont(new Font("by the way wish u happy birthday",Font.BOLD,30));
          g.drawString("by the way wish u happy birthday",50,225);
       }
        else
            {
            int b= se.date(a);
            g.setFont(new Font("all",Font.BOLD,20));
            g.setColor(Color.BLACK);
            g.drawString("Wohh...u have crossed "+b+" year of ur life and still alive..great",10,275);
            g.setColor(Color.blue);
            g.setFont(new Font("sorry to say but today is not ur birth - day ",Font.BOLD,30));
            g.drawString("sorry to say but today is not ur birth - day ",10,200);
        }
    }
}
