package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIgame extends JFrame {
    private JPanel panelMain;
    private JTextField txtName;
    private JButton btnClick;

    public GUIgame() {
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(btnClick, txtName.getText() + " Hallo");
            }
        });
    }

    public static void main(String[] args) {  //psvm
        GUIgame game = new GUIgame();
        game.setContentPane(game.panelMain);
        game.setTitle("Hallo my freund!");
        game.setSize(300, 400);
        game.setVisible(true);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
