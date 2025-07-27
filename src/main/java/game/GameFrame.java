package game;

import javax.swing.JFrame;
import java.awt.*;

public class GameFrame extends JFrame {
    public static void Frame(){
        GameFrame gameFrame=new GameFrame();
        SnakePanel snakePanel=new SnakePanel();
        gameFrame.setTitle("SNAKE & LADDER");
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setResizable(false);
        gameFrame.add(snakePanel);
        gameFrame.pack();
        gameFrame.setVisible(true);
        gameFrame.setLocationRelativeTo(null);
        snakePanel.setPreferredSize(new Dimension(SnakePanel.panelheight,SnakePanel.panelwidth));

    }
}
