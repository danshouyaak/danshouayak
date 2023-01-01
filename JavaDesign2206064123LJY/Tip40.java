package JavaDesign2206064123LJY;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tip40 extends JLabel {
    public Tip40(){
        setLayout(new GridLayout(7,1));
        add(new JLabel("编程入门40：阶乘公式求职",JLabel.CENTER));
        add(new JLabel("编写程序，输入一个正整数 n，求下列算式的值。",JLabel.CENTER));

        JPanel jPanel1 = new JPanel();
        JTextField jTextField1 = new JTextField(5);
        jPanel1.add(jTextField1);
        add(jPanel1);

        JPanel jPanel2 = new JPanel();
        JButton jButton1 = new JButton("计算");
        jPanel2.add(jButton1);
        add(jPanel2);

        JPanel jPanel3 = new JPanel();
        JTextField jTextField2 = new JTextField(10);
        jPanel3.add(jTextField2);
        add(jPanel3);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(jTextField1.getText().toString());
                double sum = 0;
                double k = 1;
                System.out.println(sum);
                for (int i = 1; i <= a ; i++) {
                         k = 1;
                    for (int j = 1; j <= i ; j++) {
                        k *= j;
                    }
                    sum += 1.0/k;
                }
               jTextField2.setText(String.valueOf(sum));

            }
        });
    }
}
