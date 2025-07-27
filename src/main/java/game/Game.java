package game;

import java.awt.*;

public interface Game {
    public void move();
    public void checkHit();
    public void addFood();
    public void checkFood();
    public void playGame();
    public void draw(Graphics graphics);
    public void gameOver(Graphics graphics);
}
