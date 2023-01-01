package xxgc.cn1;

import javax.swing.*;
import java.awt.*;

public class j6 extends JLabel{

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(1000,1000);

        JTextArea jTextArea = new JTextArea("请输入：",30,30);
        jFrame.add(jTextArea);
        JButton jButton = new JButton("按钮1");

        jFrame.add(jButton);


        jFrame.setVisible(true);
    }
}
