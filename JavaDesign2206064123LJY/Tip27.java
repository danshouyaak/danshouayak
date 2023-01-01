package JavaDesign2206064123LJY;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tip27 extends JLabel {
    public Tip27() {
        setLayout(new GridLayout(7,1));
        add(new JLabel("编程入门27：自定义函数之字符串连接",JLabel.CENTER));
        add(new JLabel("写一函数，将两个字符串连接",JLabel.CENTER));

        JPanel jPanel1 = new JPanel();
        JTextField jTextField1 = new JTextField(6);
        jPanel1.add(jTextField1);
        jPanel1.add(new JLabel("+"));
        JTextField jTextField2 = new JTextField(6);
        jPanel1.add(jTextField2);
        add(jPanel1);

        JPanel jPanel2 = new JPanel();
        JButton jButton1 = new JButton("计算");
        jPanel2.add(jButton1);
        add(jPanel2);

        JPanel jPanel3 = new JPanel();
        JTextField jTextField3  =new JTextField(10);
        jTextField3.setEditable(false);
        jPanel3.add(jTextField3);
        add(jPanel3);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = String.valueOf(jTextField1.getText().toString());
                String b = String.valueOf(jTextField2.getText().toString());
                String c = a + b;

                jTextField3.setText(c);
            }
        });
    }
}
