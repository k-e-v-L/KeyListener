import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null); //null beacause we are manually moving components within frame using keystrokes
        this.addKeyListener(this);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        //keyTyped = invoked when a key is typed. Uses KeyChar, char output

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        //keyPressed Invoked when a physical key is pressed down. Uses the keyCode, int output

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        //keyReleased = called whenever a button is released
        System.out.println("You released key char: "+keyEvent.getKeyChar());
    }
}