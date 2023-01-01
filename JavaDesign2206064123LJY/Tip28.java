package JavaDesign2206064123LJY;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tip28 extends JLabel {
    public Tip28() {
        setLayout(new GridLayout(7,1));
        add(new JLabel("编程入门28：自定义函数之字符类型统计",JLabel.CENTER));
        add(new JLabel("编写一函数，由实参传来一个字符串，统计此字符串中字母、数字、空格和其它",JLabel.CENTER));

        JPanel jPanel1 = new JPanel();
        JTextField jTextField1 = new JTextField(15);
        jPanel1.add(jTextField1);
        add(jPanel1);

        JPanel jPanel2 = new JPanel();
        JButton jButton1 = new JButton("计算");
        jPanel2.add(jButton1);
        add(jPanel2);

        JPanel jPanel3 = new JPanel();
        JTextField jTextField2 = new JTextField(2);
        jTextField2.setEditable(false);
        jPanel3.add(jTextField2);
        JTextField jTextField3 = new JTextField(2);
        jTextField3.setEditable(false);
        jPanel3.add(jTextField3);
        JTextField jTextField4 = new JTextField(2);
        jTextField4.setEditable(false);
        jPanel3.add(jTextField4);
        JTextField jTextField5 = new JTextField(2);
        jTextField5.setEditable(false);
        jPanel3.add(jTextField5);
        add(jPanel3);


        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = String.valueOf(jTextField1.getText().toString());
                int f = 0;
                int b = 0;
                int c = 0;
                int d = 0;
                int d1 = 0;
                for (int i = 0; i <a.length() ; i++) {
                    if (a.charAt(i)==' '){
                        c++;
                    } else if (a.charAt(i)>= 48 & a.charAt(i)<=57) {
                        b++;
                    } else if (a.charAt(i)>=33 &a.charAt(i)<=47) {
                        d++;
                    } else if (a.charAt(i)==64) {
                        d++;
                    } else if (a.charAt(i)==94) {
                        d++;
                    } else if (a.charAt(i)>=65 & a.charAt(i) <= 90) {
                        f++;
                    }
                }
                int add = d+d1;
                jTextField2.setText(String.valueOf(f));
                jTextField3.setText(String.valueOf(b));
                jTextField4.setText(String.valueOf(c));
                jTextField5.setText(String.valueOf(d));
            }
        });

    }
}
