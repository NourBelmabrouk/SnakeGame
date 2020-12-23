import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.*;

public class GameFrame extends JFrame {
    
    public GameFrame(){
        this.add(new GamePanel());
        this.setBounds(0, 0, 1220, 540);
        this.setTitle("Snake game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
     
    }
}
