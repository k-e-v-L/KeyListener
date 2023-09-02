import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon icon;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null); //null beacause we are manually moving components within frame using keystrokes

        icon = new ImageIcon("rocket2.png");

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setIcon(icon);
        //label.setBackground(Color.green);
        //label.setOpaque(true);

        this.getContentPane().setBackground(Color.BLACK);
        this.add(label);
        this.addKeyListener(this);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //keyTyped = invoked when a key is typed. Uses KeyChar, char output
        switch (e.getKeyChar()) {
            case 'a': label.setLocation(label.getX()-1,label.getY());
                break;
            case 'w': label.setLocation(label.getX(),label.getY()-10);
                break;
            case 's': label.setLocation(label.getX(),label.getY()+10);
                break;
            case 'd': label.setLocation(label.getX()+10, label.getY());
                break;
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //keyPressed Invoked when a physical key is pressed down. Uses the keyCode, int output
        switch (e.getKeyCode()) {
            case 37: label.setLocation(label.getX()-10,label.getY());
                break;
            case 38: label.setLocation(label.getX(),label.getY()-10);
                break;
            case 39: label.setLocation(label.getX()+10,label.getY());
                break;
            case 40: label.setLocation(label.getX(), label.getY()+10);
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //keyReleased = called whenever a button is released
        System.out.println("You released key char: "+e.getKeyChar()); //prints out the key that was pressed
        System.out.println("You released key code: "+e.getKeyCode()); //prints out the button number that was pressed
    }
}