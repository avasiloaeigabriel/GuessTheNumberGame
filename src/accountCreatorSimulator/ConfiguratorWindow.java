package accountCreatorSimulator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfiguratorWindow {
    public static void main(String[] args) {


    }


    private JPanel MainWindow;
    private JComboBox comboBox1;
    private JTextArea pleaseSelectTheDesiredTextArea;
public ConfiguratorWindow() {
    comboBox1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            MainWindow.setVisible(true);
            comboBox1.addItem("BMW");
        }
    });
}
    }
