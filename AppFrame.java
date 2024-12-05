import javax.swing.JFrame;
import javax.swing.ImageIcon;
public class AppFrame extends JFrame {
        AppFrame() {
            this.setTitle("Snake Game");
            this.setLocationRelativeTo(null);
            AppPanel aPanel = new AppPanel();
            this.add(aPanel);
            this.setResizable(false);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
            this.pack();

            ImageIcon logo = new ImageIcon("C:/Users/Karti/snakeGame/src/logo.jpeg");
            this.setIconImage(logo.getImage());
        }

}