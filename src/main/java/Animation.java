import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.*;

public class Animation extends JComponent {
    private int lastX = 0;
    int min = 1;
    int max = 20;
    int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
    public Animation() {
        Thread animationThread = new Thread(() -> {
            while (true) {
                repaint();
                try {
                    Thread.sleep(randomNum);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    animationThread.start();
    }

    public void paintComponent(Graphics g) {
        Graphics2D gg = (Graphics2D) g;
        Graphics2D gg2 = (Graphics2D) g;

        int w = 100;
        int h = 30;
        int s = 3;
        int screenWidth = getWidth();
        int screenHeight = getHeight();
        int x = lastX + s;


        gg.setColor(Color.BLACK);
        gg.fillRect(x, screenHeight/2, w, h);

        gg2.setColor(Color.BLUE);
        gg2.fillRect(screenWidth/2, x, h, w);

        lastX = x;
    }
}
