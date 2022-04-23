package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanel extends JFrame {
    private JPanel panelMain;
    private JLabel titlePanel;
    private JLabel guessLabel;
    private JLabel labelBtnChange;
    private JTextField guessInput;
    private JButton changeButton;
    private JButton enterButton;

    public GamePanel() {
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(enterButton, "hallo");
            }
        });
    }

    public static void main(String[] args) {
        GamePanel panel = new GamePanel();
        panel.setContentPane(panel.panelMain);
        panel.setTitle("Lustige Game");
        panel.setSize(700,400);
        panel.setVisible(true);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
