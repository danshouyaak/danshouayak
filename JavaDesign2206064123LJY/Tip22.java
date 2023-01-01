package JavaDesign2206064123LJY;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tip22 extends JLabel {
    public Tip22(){
        setLayout(new GridLayout(7,1));
        add(new JLabel("编程入22：矩阵对角线求和",JLabel.CENTER));
        add(new JLabel("求一个 3×3 矩阵对角线元素之和。",JLabel.CENTER));
        JPanel panel = new JPanel();

        JTextField numA = new JTextField(5);
        panel.add(numA);
        add(panel);

        JTextField numB = new JTextField(5);
        panel.add(numB);
        add(panel);

        JTextField numC = new JTextField(5);
        panel.add(numC);
        add(panel);

        JPanel jPanel = new JPanel();

        JTextField numD = new JTextField(5);
        jPanel.add(numD);
        add(jPanel);

        JTextField numE = new JTextField(5);
        jPanel.add(numE);
        add(jPanel);

        JTextField numF = new JTextField(5);
        jPanel.add(numF);
        add(jPanel);

        JPanel jPanel1 = new JPanel();

        JTextField numG = new JTextField(5);
        jPanel1.add(numG);
        add(jPanel1);

        JTextField numH = new JTextField(5);
        jPanel1.add(numH);
        add(jPanel1);

        JTextField numI = new JTextField(5);
        jPanel1.add(numI);
        add(jPanel1);




        JPanel panel2 = new JPanel();
        JButton jButton = new JButton("计算");
        panel2.add(jButton);
        add(panel2);

      JTextArea jTextArea = new JTextArea();
      add(jTextArea);


        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(numA.getText().toString());
                int e1 = Integer.parseInt(numE.getText().toString());
                int i = Integer.parseInt(numI.getText().toString());

                int c = Integer.parseInt(numC.getText().toString());
                int g = Integer.parseInt(numG.getText().toString());

                int sum1 = a+e1+i;
                int sum2 = c+e1+g;

                jTextArea.append(String.valueOf(sum1 +" "));
                jTextArea.append(String.valueOf(sum2));

            }
        });

    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[][] arr = new int[n][n];
//
//        int j = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (j = 0; j < arr.length; j++) {
//                int b = scanner.nextInt();
//                arr[i][j] = b;
//            }
//        }
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i][i];
//        }
//        System.out.println(sum);
//
//        int add = 0;
//        for (int i = arr.length-1, z = 0; i >= 0 && z <arr.length; i--, z++) {
//            add = add + arr[z][i];
//        }
//        System.out.println(add);
//    }
}
