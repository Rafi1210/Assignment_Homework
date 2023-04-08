package practice;

import javax.swing.*;  
public class simple {  
JFrame f;  
simple(){  
f=new JFrame();//creating instance of JFrame  
          
JButton b=new JButton("click");//creating instance of JButton  
b.setBounds(100,100,200, 80);  
          
f.add(b);//adding button in JFrame  
          
f.setSize(400,500);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
}  
  
public static void main(String[] args) {  
new simple();  
}  
}  