package JavaDesign2206064123LJY;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tip29 extends JLabel {
    public Tip29() {
        setLayout(new GridLayout(7, 1));
        add(new JLabel("编程入门29：三个数字的排序", JLabel.CENTER));
        add(new JLabel("输入三个整数，按由小到大的顺序输出。", JLabel.CENTER));

        JPanel jPanel1 = new JPanel();
        JTextField jTextField1 = new JTextField(3);
        jPanel1.add(jTextField1);
        JTextField jTextField2 = new JTextField(3);
        jPanel1.add(jTextField2);
        JTextField jTextField3 = new JTextField(3);
        jPanel1.add(jTextField3);
        add(jPanel1);

       JPanel jPanel2 = new JPanel();
        JButton jButton1 = new JButton("计算");
        jPanel2.add(jButton1);
        add(jPanel2);

        JPanel jPanel3 = new JPanel();
        JTextField jTextField4 = new JTextField(3);
        jTextField4.setEditable(false);
        jPanel3.add(jTextField4);
        JTextField jTextField5 = new JTextField(3);
        jTextField5.setEditable(false);
        jPanel3.add(jTextField5);
        JTextField jTextField6 = new JTextField(3);
        jTextField6.setEditable(false);
        jPanel3.add(jTextField6);
        add(jPanel3);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(jTextField1.getText());
                int b = Integer.parseInt(jTextField2.getText());
                int c = Integer.parseInt(jTextField3.getText());

                int max = a > b? a:b;
                 max = max > c? max:c;
                 jTextField6.setText(String.valueOf(max));

                 int min = a < b? a:b;
                 min = min < c ? min : c;
                 jTextField4.setText(String.valueOf(min));

                 if (a != max & a != min){
                     jTextField5.setText(String.valueOf(a));
                 } else if (b != max & b != min) {
                     jTextField5.setText(String.valueOf(b));
                 } else if (c != max & c != min) {
                     jTextField5.setText(String.valueOf(c));
                 }

            }
        });
    }
}
