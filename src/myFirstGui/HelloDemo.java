package myFirstGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class HelloDemo extends JFrame {
    private JPanel panelMain;
     JTextField txtName;
    private JButton btnClick;
    private JButton anotherButtonButton;
    private JCheckBox blueCheckBox;
    private JSpinner spinner1;

    public HelloDemo() {
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(btnClick, "Hello, " + txtName.getText());
                System.out.println(txtName.getText());


            }
        });
        anotherButtonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(anotherButtonButton, "Good choice!");
                anotherButtonButton.getFont();

            }
        });


    }

    public static void main(String[] args) {
        HelloDemo hello = new HelloDemo();
        hello.setContentPane(hello.panelMain);
        hello.setTitle("Hello Application");
        hello.setSize(500, 300);
        hello.setVisible(true);
        hello.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
