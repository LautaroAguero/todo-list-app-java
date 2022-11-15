import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame {
    private JButton addTask;
    private JButton clearTask;

    TitleBar title = new TitleBar();
    ButtonPanel buttonPanel = new ButtonPanel();

    public AppFrame () {
        this.setSize(400,700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(this.title, BorderLayout.NORTH);
        this.add(this.buttonPanel,BorderLayout.SOUTH);

        addTask = buttonPanel.getAddTaskButton();
        clearTask = buttonPanel.getClearTaskButton();


    }
}
