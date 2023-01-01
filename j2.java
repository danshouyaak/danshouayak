package xxgc.cn1;

import javax.swing.*;
import java.awt.*;

public class j2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(300,300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setLayout(new FlowLayout());


        JButton jButton1= new JButton("1");
        jFrame.add(jButton1);
        JButton jButton2 = new JButton("2");
        jFrame.add(jButton2);
        JButton jButton3 = new JButton("3");
        jFrame.add(jButton3);
        JButton jButton4 = new JButton("4");
        jFrame.add(jButton4);
    }
}
