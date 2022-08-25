import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {
    public Game() throws InterruptedException {
        Animation animation = new Animation();

        this.setLocationRelativeTo(null);
        this.add(animation);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);
        this.setVisible(false);
    }

}
