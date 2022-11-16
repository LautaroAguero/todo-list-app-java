import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel {
    JLabel TitleText = new JLabel("To Do List App");

    public TitleBar() {
        this.setPreferredSize(new Dimension(400,80));
        this.setBackground(new Color(153, 179, 135));
        this.setBorder(BorderFactory.createLineBorder(Color.black,1));

        TitleText.setPreferredSize(new Dimension(200,80));
        TitleText.setFont(new Font("Sans-serif",Font.BOLD, 20));
        TitleText.setForeground(Color.black);
        TitleText.setHorizontalAlignment(JLabel.CENTER);
        this.add(this.TitleText);
    }
}
