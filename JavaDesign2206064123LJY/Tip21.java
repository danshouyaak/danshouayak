package JavaDesign2206064123LJY;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tip21 extends JLabel {
    public Tip21() {
        setLayout(new GridLayout(7, 1));
        add(new JLabel("编程入门21：筛选 N 以内的素数", JLabel.CENTER));
        add(new JLabel("用简单素数筛选法求 N 以内的素数。", JLabel.CENTER));


        JPanel panel = new JPanel();
        JTextField numA = new JTextField(5);
        panel.add(numA);
        add(panel);
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("计算");
        jPanel.add(jButton);
        add(jPanel);

        JTextArea jTextArea = new JTextArea(5,5);
        add(jTextArea);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(numA.getText().toString());
                int j;
                int[] b = new int[999];
                int count = 0;
                for (int i = 2; i <= a; i++) {
                    for (j = 2; j <= a; j++) {
                        if (i % j == 0) {
                            break;
                        }
                    }
                    if (i == j) {
                        jTextArea.append(String.valueOf(i+" "));
                    }
                }
            }
        });
    }
}


