import javax.swing.*;
import java.awt.*;

public class Task extends JPanel {

    private JLabel index;
    private JTextField taskName;
    private JButton done;
    private JButton remove;

    public Task() {

        GridBagLayout layoutTask = new GridBagLayout();
        this.setPreferredSize(new Dimension(400,20));
        this.setBackground(new Color(255,234,17));
        this.setLayout(layoutTask);

        index = new JLabel("");
        index.setHorizontalAlignment(JLabel.LEFT);
        index.setBackground(new Color(255,234,17));
        GridBagConstraints contenido0 = new GridBagConstraints();
        contenido0.gridy = 0;
        contenido0.gridwidth = 1;
        contenido0.weightx = 0.15;
        this.add(this.index, contenido0);

        taskName = new JTextField("Ingrese una tarea...");
        taskName.setBorder(BorderFactory.createEmptyBorder());
        taskName.setBackground(new Color(255,234,17));
        GridBagConstraints contenido1 = new GridBagConstraints();
        contenido1.gridx = 1;
        contenido1.gridwidth = 1;
        contenido1.fill = 1;
        contenido1.weightx = 0.55;
        this.add(taskName, contenido1);

        done = new JButton("Hecho");
        GridBagConstraints contenido2 = new GridBagConstraints();
        contenido2.gridx = 2;
        contenido2.gridwidth = 1;
        contenido2.fill = 1;
        contenido2.weightx = 0.15;
        this.add(this.done,contenido2);

        remove = new JButton("Remover");
        GridBagConstraints contenido3 = new GridBagConstraints();
        contenido3.gridx = 3;
        contenido3.gridwidth = 1;
        contenido3.fill = 1;
        contenido3.weightx = 0.10;
        this.add(this.remove, contenido3);
    }

    public void writeIndex(int n) {
        this.index.setText(String.valueOf(n));
        this.revalidate();
    }

    public JButton getDone () {
        return this.done;
    }

    public JButton getRemove() {
        return this.remove;
    }

    public void doneStatus(){
        this.taskName.setBackground(Color.green);
        this.index.setBackground(Color.green);
        this.remove.setBackground(Color.green);
        this.done.setBackground(Color.green);
        this.setBackground(Color.green);
        revalidate();
    }

}
