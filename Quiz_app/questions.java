import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Page1 implements ActionListener
{int m=0;
JFrame f1,p;
JRadioButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
JLabel l1;
JButton b11;
String ss1,ss2;
Page1(JFrame f,String s1,String s2)
{
ButtonGroup g11=new ButtonGroup();
f1=f;
ss1=s1;
ss2=s2;
p=new JFrame("QUIZ");
p.setVisible(true);
p.setSize(1000,1000);
p.setLayout(new FlowLayout(FlowLayout.CENTER,2000,5));
b1=new JRadioButton("Question 1");
b2=new JRadioButton("Question 2");
b3=new JRadioButton("Question 3");
b4=new JRadioButton("Question 4");
b5=new JRadioButton("Question 5");
b6=new JRadioButton("Question 6");
b7=new JRadioButton("Question 7");
b8=new JRadioButton("Question 8");
b9=new JRadioButton("Question 9");
b10=new JRadioButton("Question 10");
g11.add(b1);
g11.add(b2);
g11.add(b3);
g11.add(b4);
g11.add(b5);
g11.add(b6);
g11.add(b7);
g11.add(b8);
g11.add(b9);
g11.add(b10);
l1=new JLabel("Good Luck !!! You can proceed.");
l1.setFont(new Font("cooper",Font.BOLD,50));
b11=new JButton("SAVE and SUBMIT");
b11.setFont(new Font("cooper",Font.BOLD,35));
b1.setFont(new Font("casteller",Font.BOLD,30));
b2.setFont(new Font("casteller",Font.BOLD,30));
b3.setFont(new Font("casteller",Font.BOLD,30));
b4.setFont(new Font("casteller",Font.BOLD,30));
b5.setFont(new Font("casteller",Font.BOLD,30));
b6.setFont(new Font("casteller",Font.BOLD,30));
b7.setFont(new Font("casteller",Font.BOLD,30));
b8.setFont(new Font("casteller",Font.BOLD,30));
b9.setFont(new Font("casteller",Font.BOLD,30));
b10.setFont(new Font("casteller",Font.BOLD,30));
//p.setBackground(Color.pink);
