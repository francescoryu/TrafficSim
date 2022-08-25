import javax.swing.*;
import java.awt.*;
import static javax.swing.SwingUtilities.updateComponentTreeUI;

public class Menu extends JFrame {
    public JPanel btnPanel;
    public JButton exitButton;
    public JButton startButton;
    public JPanel contentPanel;
    public JPanel labelPanel;

    public Menu(Game game) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        updateComponentTreeUI(this);
        Font btnFont = new Font("SansSerif", Font.PLAIN, 16);

        btnPanel = new JPanel();
        btnPanel.setBackground(Color.decode("#038787"));

        exitButton = new JButton("Exit");
        exitButton.setPreferredSize(new Dimension(70, 50));
        exitButton.setFont(btnFont);
        exitButton.addActionListener(e -> {
            System.exit(0);
        });

        startButton = new JButton("Start");
        startButton.setPreferredSize(new Dimension(70, 50));
        startButton.setFont(btnFont);
        startButton.addActionListener(e -> {
            game.setVisible(true);
        });

        btnPanel.add(exitButton);
        btnPanel.add(startButton);

        contentPanel = new JPanel();
        labelPanel = new JPanel();

        this.add(btnPanel, BorderLayout.SOUTH);
        this.setSize(new Dimension(500, 300));
        this.setBackground(Color.decode("#038787"));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
