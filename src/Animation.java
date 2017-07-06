
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Animation extends JPanel implements ActionListener, KeyListener{

int x = 0, y = 0, velx=0, vely=0;

public Animation(){
    addKeyListener(this);
    setFocusable(true);
    setFocusTraversalKeysEnabled(false);
}

public static void main(String args[]){
    JFrame frame = new JFrame("Animation Test");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setSize(500, 500);
    Animation a = new Animation();
    frame.add(a);
    frame.repaint();
    frame.addKeyListener(a);

}

protected void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setColor(Color.BLACK);
    g.fillRect(0, 0, 500, 500);
    g.setColor(Color.RED);
    g.fillRect(x, y, 20, 20);
 }

@Override
public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
  //  x = x + velx;
  
}

@Override
public void keyTyped(KeyEvent e) {
    // TODO Auto-generated method stub

}

@Override
public void keyPressed(KeyEvent e) {
    // TODO Auto-generated method stub
    int keyCode = e.getKeyCode();
    
    if(keyCode == e.VK_RIGHT){
        velx = 2;
        x = x + velx;
    }
    else if (keyCode == e.VK_LEFT){
    	velx = 2;
    	x = x - velx;
    }
    else if (keyCode == e.VK_UP){
    	vely = 2;
    	y = y - vely;
    }
    else if (keyCode == e.VK_DOWN){
    	vely = 2;
    	y = y + vely;
    	
    }
    repaint();
}

@Override
public void keyReleased(KeyEvent e) {
    // TODO Auto-generated method stub

}

}