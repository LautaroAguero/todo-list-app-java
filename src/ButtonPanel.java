import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonPanel extends JPanel {
    private JButton addTask;
    private JButton clearTask;

    Border emptyBorder = BorderFactory.createEmptyBorder();

    public ButtonPanel(){
        this.setPreferredSize(new Dimension(400,65));
        this.setBackground(new Color(153, 179, 135));
        this.setBorder(BorderFactory.createLineBorder(Color.black,1));

        addTask = new JButton("Add Task");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("Sans-serif",Font.PLAIN,20));
        addTask.setBackground(new Color(186, 202, 78));
        addTask.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.black,1),
                BorderFactory.createLineBorder(new Color(186, 202, 78),4)
        ));


        this.add(addTask);

        this.add(Box.createVerticalStrut(20));

        clearTask = new JButton("Clear Tasks");
        clearTask.setBorder(emptyBorder);
        clearTask.setFont(new Font("Sans-serif",Font.PLAIN,20));
        clearTask.setBackground(new Color(233, 156, 139));
        clearTask.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.black,1),
                BorderFactory.createLineBorder(new Color(233, 156, 139),4)
        ));
        this.add(clearTask);

    }

    public  JButton getAddTaskButton () {
        return addTask;
    }

    public JButton getClearTaskButton() {
        return clearTask;
    }
}
