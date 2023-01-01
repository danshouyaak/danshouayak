package JavaDesign2206064123LJY;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tip24 extends JLabel {
    public Tip24() {
        setLayout(new GridLayout(7, 1));
        add(new JLabel("编程入门24", JLabel.CENTER));
        add(new JLabel("自定义函数处理最大公约数与最小公倍数", JLabel.CENTER));

        JPanel jPanel = new JPanel();
        JTextField jTextField1 = new JTextField(5);
        jPanel.add(jTextField1);
        add(jPanel);

        JTextField jTextField2 = new JTextField(5);
        jPanel.add(jTextField2);
        add(jPanel);

        JButton jButton = new JButton("计算");
        JPanel jPanel1 = new JPanel();
        jPanel1.add(jButton);
        add(jPanel1);

        JTextArea jTextArea = new JTextArea();
        add(jTextArea);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(jTextField1.getText().toString());
                int b = Integer.parseInt(jTextField2.getText().toString());
                int c = 0;
                int d = 0;

                if (a > b){
                    c = a;
                    d = b;
                }else{
                    c = b;
                    d = a;
                }
                int e1 = c % d;
                while (e1 != 0){
                    c = d;
                    d =e1;
                    e1 = c % d;
                }
                jTextArea.append(String.valueOf(d));
                jTextArea.append(String.valueOf("---"));
                jTextArea.append(String.valueOf((a*b)/d));
            }
        });
    }
}
