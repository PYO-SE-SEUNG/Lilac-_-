package guit;

import java.awt.*;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.*;
 
public class GUI extends JFrame {
	public GUI() {
		 
		
        setTitle("게임 선택"); // 프레임 제목
        setBounds(100 , 100 , 600 , 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 버튼, 체크박스, 라디오버튼, 리스트, 라벨,텍스트필드를 넣을 패널
        JPanel p = new JPanel();
        
        //버튼 추가
        JButton btn1, btn2;
        btn1 = new JButton("3 Cards game");
        btn1.setPreferredSize(new Dimension(300, 100));
        btn1.setSize(200, 60);
        btn2 = new JButton("2 Cards game");
        btn2.setPreferredSize(new Dimension(300, 100));
        btn1.addActionListener(new EventHandler());
        btn2.addActionListener(new EventHandler1());
        label2 = new JLabel(msg);
        label2.setFont(new Font("Serif", Font.BOLD, 11));
        label2.setFont(label2.getFont().deriveFont(30.0f));
        

        p.add(label2);
        p.add(btn2);
        p.add(btn1);
        
        add(p);
 
        
        
        setVisible(true);
 
    }
 
	String msg = "Welcome to 섯다 World";
	String ms = " ";
    JLabel label2;
 
	
 
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