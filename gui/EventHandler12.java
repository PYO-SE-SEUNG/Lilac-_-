package guit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class EventHandler12 implements ActionListener {
 
    @Override
    public void actionPerformed(ActionEvent arg0) {//액션이벤트가 발생됬을떄 수행하는 동작
        System.out.println(arg0.getActionCommand());
        new GUIF();
    }
}