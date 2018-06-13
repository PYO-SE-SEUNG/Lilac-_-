package guit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.*;
 
public class GUIF extends JFrame {
	Container contentPane;
	public GUIF() {

		setTitle("배팅"); // 프레임 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
        setBounds(100 , 100 , 800 , 400);
	    setVisible(true);

	    JButton btn1, btn2, btn3, btn4, btn5;
	    btn1 = new JButton("1. Make new ID");
	    btn1.setLocation(60, 30);
	    btn1.setSize(120, 40);
	    btn2 = new JButton("2. Load ID");
	    btn2.setLocation(60, 90);
	    btn2.setSize(120, 40);
	    btn3 = new JButton("3. Start Game");
	    btn3.setLocation(60, 150);
	    btn3.setSize(120, 40);
	    btn4 = new JButton("4. Cashier");
	    btn4.setLocation(60, 210);
	    btn4.setSize(120, 40);
	    btn5 = new JButton("5. Exit");
	    btn5.setLocation(60, 270);
	    btn5.setSize(120, 40);
	    
	    
	    btn3.addActionListener(new EventHandler9());
	    btn4.addActionListener(new EventHandler11());
	    btn5.addActionListener(new EventHandler10());
	    
	    
	    add(btn1);
	    add(btn2);
	    add(btn3);
	    add(btn4);
	    add(btn5);
	    
	    setLayout(null);
	    setSize(400, 400);
	    setLocation(100, 100);
	    setVisible(true);
	}
}
/*
JLabel lab;


public GUI() {
	
	setTitle("게임 선택 창");
	
	setLocation(0, 100); //창이 뜨는 위치
    setSize(1000, 300); // 창 크기
    setResizable(false); // 창 크기 조절

	
	lab = new JLabel("Welcome to sutda World!");
	lab.setLocation(145, 100);
    lab.setSize(00, 200);
    lab.setBackground(Color.blue);
    lab.setForeground(Color.WHITE);

    JButton btn1, btn2;
    btn1 = new JButton("2 Cards game");
    btn1.setLocation(30, 240);
    btn1.setSize(150, 60);
    btn2 = new JButton("3 Cards game");
    btn2.setLocation(220, 240);
    btn2.setSize(150, 60);
    btn1.addActionListener(new EventHandler());
    btn2.addActionListener(new EventHandler());

    add(btn2);
    add(btn1);
    
    setLayout(null);
    setSize(400, 400);
    setLocation(100, 100);
    setVisible(true);

}*/