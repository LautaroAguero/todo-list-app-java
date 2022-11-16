import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonPanel extends JPanel {
    private JButton addTask;
    private JButton clearTask;

    public ButtonPanel(){
        this.setPreferredSize(new Dimension(400,40));
        this.setBackground(new Color(153, 179, 135));
        this.setBorder(BorderFactory.createLineBorder(Color.black,1));

        addTask = new JButton("Agregar Tarea");
        addTask.setFont(new Font("Sans-serif",Font.PLAIN,20));
        addTask.setBackground(new Color(186, 202, 78));
        addTask.setBorder(BorderFactory.createLineBorder(Color.black,1));


        this.add(addTask);

        this.add(Box.createVerticalStrut(20));

        clearTask = new JButton("Eliminar Tareas");
        clearTask.setFont(new Font("Sans-serif",Font.PLAIN,20));
        clearTask.setBackground(new Color(233, 156, 139));
        clearTask.setBorder(BorderFactory.createLineBorder(Color.black,1));
        this.add(clearTask);

    }

    public  JButton getAddTaskButton () {
        return addTask;
    }

    public JButton getClearTaskButton() {
        return clearTask;
    }
}
