package JavaDesign2206064123LJY;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tip38 extends JLabel {
    public Tip38(){
        setLayout(new GridLayout(7,1));
        add(new JLabel("编程入门38：分段函数",JLabel.CENTER));
        add(new JLabel("输入 x ，计算并输出下列分段函数 f(x) 的值。",JLabel.CENTER));

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
        jPanel3.add(jTextField2);
        add(jPanel3);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    int a = Integer.parseInt(jTextField1.getText().toString());
                    if (a<0){
                        jTextField2.setText(String.valueOf(Math.abs(a)));
                    } else if (a >= 0 & a<2) {
                        jTextField2.setText(String.valueOf(Math.pow(a+1,1/2.0)));
                    } else if (a>=2 & a<4) {
                        jTextField2.setText(String.valueOf(Math.pow(a+2,3)));
                    }else if (a >= 4){
                        jTextField2.setText(String.valueOf((2*a)+5));
                    }

            }
        });
    }
}
