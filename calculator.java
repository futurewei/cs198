package test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Foothill extends JFrame implements ActionListener
{
   JLabel jl1, jl2, jl3, jl4, jl5, jl6, jl7, jl8;
   JTextField jtf1, jtf2, jtf3, jtf4, jtf5, jtf6;
   JButton jb1, jb2;
   JPanel jp1, jp2, jp3, jp4;
   static double temp1, temp2, temp3, solution1, solution2;

   public static void main(String[] args)
   {
      Foothill f1 = new Foothill();
   }

   public Foothill()
   {

      jl1 = new JLabel("please enter coefficients");
      jl3 = new JLabel("x^2+");
      jl4 = new JLabel("x+");
      jl5 = new JLabel("=0");
      jl6 = new JLabel("x1=");
      jl7 = new JLabel("x2=");
      jtf1 = new JTextField();
      jtf1.setColumns(3);
      jtf2 = new JTextField();
      jtf2.setColumns(3);
      jtf3 = new JTextField();
      jtf3.setColumns(3);
      jtf5 = new JTextField();
      jtf5.setColumns(3);
      jtf6 = new JTextField();
      jtf6.setColumns(3);
      jb1 = new JButton("calculate");
      jb1.addActionListener(this);
      jb1.setActionCommand("suan");
      jb2 = new JButton("end");
      jb2.setActionCommand("jie shu");
      jb2.addActionListener(this);
      jp1 = new JPanel();
      jp2 = new JPanel();
      jp3 = new JPanel();
      jp4 = new JPanel();

      jp3.add(jl1);
      jp1.add(jtf1);
      jp1.add(jl3);
      jp1.add(jtf2);
      jp1.add(jl4);
      jp1.add(jtf3);
      jp1.add(jl5);

      jp4.add(jb1);
      jp4.add(jb2);

      jp2.add(jl6);
      jp2.add(jtf5);
      jp2.add(jl7);
      jp2.add(jtf6);

      this.setLayout(new GridLayout(4, 1));
      this.add(jp3);
      this.add(jp1);
      this.add(jp2);
      this.add(jp4);
      this.setTitle("Calculator");
      this.setSize(300, 300);
      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   public void actionPerformed(ActionEvent e)
   {
      if (e.getActionCommand().equals("suan"))
      {
         temp1 = Double.parseDouble(jtf1.getText());
         temp2 = Double.parseDouble(jtf2.getText());
         temp3 = Double.parseDouble(jtf3.getText());
         display(temp1, temp2, temp3);
      } else if (e.getActionCommand().equals("jie shu"))
      {
         clear();
      }
   }

   public void clear()
   {
      temp1 = 0;
      temp2 = 0;
      temp3 = 0;
      solution1 = 0;
      solution2 = 0;
      jtf1.setText(String.valueOf(temp1));
      jtf2.setText(String.valueOf(temp1));
      jtf3.setText(String.valueOf(temp1));
      jtf5.setText(String.valueOf(temp1));
      jtf6.setText(String.valueOf(temp1));
   }

   public void display(double a, double b, double c)
   {
      calculation(a, b, c);
      System.out.println(solution1);
      System.out.println("hi");
      jtf5.setText(String.valueOf(solution1));
      jtf6.setText(String.valueOf(solution2));
   }

   public static void calculation(double a, double b, double c)
   {
      System.out.println("0:"+Math.pow(b * b - (4 * a * c), 0.5));
      if (a != 0)
      {
         solution1 = (-b + Math.pow(((b * b) - (4 * a * c)), 0.5)) / (2 * a);
         System.out.println("s:"+solution1);
         solution2 = (-b - Math.pow(((b * b) - (4 * a * c)), 1/2)) / (2 * a);
      } else
      {
         solution1 = 0;
         solution2 = 0;
      }
   }
}