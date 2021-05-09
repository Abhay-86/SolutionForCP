package com.Abhay;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Abhay {
    private JButton miracal;
    private JPanel panel1;

    public Abhay() {
        miracal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Abhay");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame("Chutiyapa");
        frame.setContentPane(new Abhay().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
