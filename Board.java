import java.awt.Image;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Board {
    private final int boardX = 800;
    private final int boardY = 710;

    ImageIcon icon = new ImageIcon("res/ludo.jpg");
    Image im = icon.getImage().getScaledInstance(650, 600, Image.SCALE_SMOOTH);
    ImageIcon finalicon = new ImageIcon(im);

    ImageIcon icon2 = new ImageIcon("res/drawer.png");
    Image im2 = icon2.getImage().getScaledInstance(40, 30, Image.SCALE_SMOOTH);
    ImageIcon finalicon2 = new ImageIcon(im2);

    Board() {

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(255, 255, 255));
        menuBar.setBounds(0, 0, boardX, 50);
        // Create a menu
        JMenu menu = new JMenu("Menu");
        menu.setHorizontalTextPosition(SwingConstants.CENTER);
        menu.setVerticalTextPosition(SwingConstants.BOTTOM);
        menu.setIcon(finalicon2);

        // Create a menu item
        JMenuItem item = new JMenuItem("Test Item");
        item.setIcon(finalicon2);

        menu.add(item);

        menuBar.add(menu);

        JLabel appBar = new JLabel();
        appBar.setBounds(0, 0, boardX, 50);
        appBar.setIcon(finalicon);
        appBar.setLayout(null);
        appBar.add(menuBar);

        JLabel bodylabel = new JLabel();
        bodylabel.setBounds(0, 50, 650, 620);
        bodylabel.setIcon(finalicon);
        bodylabel.setLayout(null);
        // bodylabel.add(menuBar);

        JPanel mainpanel = new JPanel();
        mainpanel.setBounds(0, 0, boardX, boardY);
        mainpanel.setLayout(null);
        mainpanel.add(bodylabel);

        JFrame frame = new JFrame();
        frame.setSize(boardX, boardY);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setIconImage(im);
        frame.add(appBar);
        frame.add(bodylabel);
    }
}
