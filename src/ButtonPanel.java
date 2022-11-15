import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonPanel extends JPanel {
    private JButton addTask;
    private JButton clearTask;

    Border emptyBorder = BorderFactory.createEmptyBorder();

    public ButtonPanel(){
        this.setPreferredSize(new Dimension(400,80));
        this.setBackground(new Color(129,202,207));

        addTask = new JButton("Add Task");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("Sans-serif",Font.PLAIN,20));
        this.add(addTask);

        this.add(Box.createVerticalStrut(20));

        clearTask = new JButton("Clear Tasks");
        clearTask.setBorder(emptyBorder);
        clearTask.setFont(new Font("Sans-serif",Font.PLAIN,20));
        this.add(clearTask);

    }

    public  JButton getAddTaskButton () {
        return addTask;
    }

    public JButton getClearTaskButton() {
        return clearTask;
    }
}
