package JavaDesign2206064123LJY;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tip39 extends JLabel {
    public Tip39(){
        setLayout(new GridLayout(7,1));
        add(new JLabel("编程入门39：成绩归类",JLabel.CENTER));
        add(new JLabel("编写程序，输入一批学生的成绩",JLabel.CENTER));

       JPanel jPanel1 = new JPanel();
        JTextField jTextField1 = new JTextField(2);
        jPanel1.add(jTextField1);
        JTextField jTextField2 = new JTextField(2);
        jPanel1.add(jTextField2);
        JTextField jTextField3 = new JTextField(2);
        jPanel1.add(jTextField3);
        JTextField jTextField4 = new JTextField(2);
        jPanel1.add(jTextField4);
        JTextField jTextField5 = new JTextField(2);
        jPanel1.add(jTextField5);
        add(jPanel1);

        JPanel jPanel2 = new JPanel();
        JButton jButton = new JButton("计算");
        jPanel2.add(jButton);
        add(jPanel2);

        JPanel jPanel3 = new JPanel();
        JTextField jTextField6 = new JTextField(2);
        jPanel3.add(new JLabel("大于等于85："));
        jTextField6.setEditable(false);
        jPanel3.add(jTextField6);
        JTextField jTextField7 = new JTextField(2);
        jPanel3.add(new JLabel("60-84："));
        jTextField7.setEditable(false);
        jPanel3.add(jTextField7);
        JTextField jTextField8 = new JTextField(2);
        jPanel3.add(new JLabel("小于60：:"));
        jTextField8.setEditable(false);
        jPanel3.add(jTextField8);
        add(jPanel3);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(jTextField1.getText().toString());
                int b = Integer.parseInt(jTextField2.getText().toString());
                int c = Integer.parseInt(jTextField3.getText().toString());
                int d = Integer.parseInt(jTextField4.getText().toString());
                int f = Integer.parseInt(jTextField5.getText().toString());

                int count1 = 0;//>=85
                int count2 = 0;//60-84;
                int count3 = 0; //60<
                if (a>=85){
                    count1++;
                }else if (a>=60){
                    count2++;
                }else
                    count3++;
                ///
                if (b>=85){
                    count1++;
                }else if (b>=60){
                    count2++;
                }else
                    count3++;
                ///
                if (c>=85){
                    count1++;
                }else if (c>=60){
                    count2++;
                }else
                    count3++;
                ///
                if (d>=85){
                    count1++;
                }else if (d>=60){
                    count2++;
                }else
                    count3++;
                ///
                if (f>=85){
                    count1++;
                }else if (f>=60){
                    count2++;
                }else
                    count3++;

                jTextField6.setText(String.valueOf(count1));
                jTextField7.setText(String.valueOf(count2));
                jTextField8.setText(String.valueOf(count3));
            }
        });
    }
}
