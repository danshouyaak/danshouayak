package JavaDesign2206064123LJY;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tip34 extends JLabel {
    public Tip34 (){
        setLayout(new GridLayout(7,1));
        add(new JLabel("编程入门34：同因查找",JLabel.CENTER));
        add(new JLabel("求出 10 至 1000 之内能同时被 2、3、7 整除的数，并输出。",JLabel.CENTER));


        JPanel jPanel1 = new JPanel();
        JTextField jTextField1 = new JTextField(5);
        jPanel1.add(jTextField1);
        add(jPanel1);

        JPanel jPanel2 = new JPanel();
        JButton jButton1 = new JButton("计算");
        jPanel2.add(jButton1);
        add(jPanel2);

        JTextArea jTextArea = new JTextArea();
        add(jTextArea);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(jTextField1.getText().toString());

                for (int i = 1; i <= a ; i++) {
                    if (i % 2== 0 & i% 3 == 0 & i % 7 == 0 ){
                        jTextArea.append(String.valueOf(i+" "));
                    }
                }
            }
        });
    }
}
