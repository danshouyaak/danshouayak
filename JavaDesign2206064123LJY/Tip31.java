package JavaDesign2206064123LJY;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tip31 extends JLabel {
    public Tip31(){
        setLayout(new GridLayout(7,1));
        add(new JLabel("编程入门31：计算素数和", JLabel.CENTER));
        add(new JLabel("输入两个正整数 m 和 n(m<n)，求 m 到 n 之间(包括 m 和 n)所有素数的和" ,JLabel.CENTER));

        JPanel jPanel1 = new JPanel();
        JTextField jTextField1 = new JTextField(5);
        jPanel1.add(jTextField1);
        JTextField jTextField2 = new JTextField(5);
        jPanel1.add(jTextField2);
        add(jPanel1);

        JPanel jPanel2 = new JPanel();
        JButton jButton1 = new JButton("计算");
        jPanel2.add(jButton1);
        add(jPanel2);

        JPanel jPanel = new JPanel();
       JTextField jTextField = new JTextField(5);
       jPanel.add(jTextField);
        add(jPanel);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(jTextField1.getText().toString());
                int b = Integer.parseInt(jTextField2.getText().toString());
                int j = 0;
                int sum = 0;
                for (int i = a; i <= b ; i++) {
                    for ( j = 2; j <= b ; j++) {
                        if (i % j == 0){
                            break;
                        }
                    }
                    if (i == j){
                        sum += i;
                   jTextField.setText(String.valueOf(sum));
                    }
                }
            }
        });
    }
}
