package JavaDesign2206064123LJY;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tip33 extends JLabel {
    public Tip33 (){
        setLayout(new GridLayout(7,1));
        add(new JLabel("编程入门33：等差数列",JLabel.CENTER));
        add(new JLabel("sum=2+5+8+11+14+…，输入正整数 n，求 sum 的前 n 项和。",JLabel.CENTER));

        JPanel jPanel1 = new JPanel();
        JTextField jTextField1 = new JTextField(5);
        jPanel1.add(jTextField1);
        add(jPanel1);

        JPanel jPanel2 = new JPanel();
        JButton jButton1 = new JButton("计算");
        jPanel2.add(jButton1);
        add(jPanel2);

        JPanel jPanel3 = new JPanel();
        JTextField jTextField2 = new JTextField(5);
        jTextField2.setEditable(false);
        jPanel3.add(jTextField2);
        add(jPanel3);


        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sum = 0;
                int a = Integer.parseInt(jTextField1.getText().toString());
                for (int i = 1; i <= a ; i++) {
                    if (i % 2 == 0 ){
                        sum += i;
                    }
                    jTextField2.setText(String.valueOf(sum));
                }

            }
        });
    }
}
