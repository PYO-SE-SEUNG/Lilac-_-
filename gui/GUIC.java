package guit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.*;
 
public class GUIC extends JFrame {
	Container contentPane;
	public GUIC() {

		setTitle("배팅"); // 프레임 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
        setBounds(100 , 100 , 800 , 400);
	    setVisible(true);

	    JButton btn1, btn2, btn3, btn4, btn5;
	    btn1 = new JButton("deposit");
	    btn1.setLocation(200, 20);
	    btn1.setSize(120, 80);
	    btn2 = new JButton("withdraw");
	    btn2.setLocation(200, 140);
	    btn2.setSize(120, 80);
	    btn3 = new JButton("Home");
	    btn3.setLocation(200, 260);
	    btn3.setSize(120, 80);
	    
	    
	    btn3.addActionListener(new EventHandler12());
	    
	    
	    add(btn1);
	    add(btn2);
	    add(btn3);
	    
	    setLayout(null);
	    setSize(400, 400);
	    setLocation(100, 100);
	    setVisible(true);
	}
}
