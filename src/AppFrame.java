import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppFrame extends JFrame {

    private JButton addTask;
    private JButton clearTask;

    TitleBar title = new TitleBar();
    ButtonPanel buttonPanel = new ButtonPanel();
    List list = new List();

    public AppFrame () {
        this.setSize(400,700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(this.title, BorderLayout.NORTH);
        this.add(this.buttonPanel,BorderLayout.SOUTH);
        this.add(this.list,BorderLayout.CENTER);

        addTask = buttonPanel.getAddTaskButton();
        clearTask = buttonPanel.getClearTaskButton();

        addlistner();
    }
    public void addlistner() {
        addTask.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                Task task = new Task();
                list.add(task);
                list.indexNum();
                revalidate();
            }
        });
    }
}
