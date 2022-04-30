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
    private JButton btnGuess;
    private int theNumber;


    public GamePanel() {
        btnGuess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                checkGuess ();
            }
        });
    }

    public void checkGuess () {

        String guessText = guessInput.getText();
        String message = "";
        int guess = Integer.parseInt(guessText);
        if (guess < theNumber )
            message = "Ihr vorausplanende Zahl ist " + guess + " WENIGER als benötigt. Versuchen Sie noch ein mal";
        else if ( guess > theNumber )
            message = "Ihr vorausplanende Zahl ist " + guess + " GRÖßER als benötigt. Versuchen Sie noch ein mal";
        else
            message = guess + "Gratulation! Sie haben gewonnen!";
        guessLabel.setText(message);
    }
    public void newGame () {
         theNumber = (int) (Math.random() * 100 + 1);
    }
//    public GuessingGame (){
//
//    }
    public static void main(String[] args) {
        GamePanel panel = new GamePanel();
        panel.setContentPane(panel.panelMain);
        panel.setTitle("Lustige Game");
        panel.setSize(700,400);
        panel.setVisible(true);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
