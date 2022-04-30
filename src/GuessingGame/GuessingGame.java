package GuessingGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessingGame extends JFrame {
    private JTextField txtGuess;
    private JButton btnGuess;
    private JLabel lblOutput;
    private JPanel mainPanel;
    private int theNumber;

    public void checkGuess () {

        String guessText = txtGuess.getText();
        String message = "";

        int guess = Integer.parseInt(guessText);
        if (guess < theNumber )
            message = "Ihr vorausplanende Zahl ist " + guess + " WENIGER als benötigt. Versuchen Sie noch ein mal";
        else if ( guess > theNumber )
            message = "Ihr vorausplanende Zahl ist " + guess + " GRÖßER als benötigt. Versuchen Sie noch ein mal";
        else
            message = guess + "Gratulation! Sie haben gewonnen!";
        lblOutput.setText(message);
    }

    public void newGame () {
        theNumber = (int) (Math.random() * 100 + 1);
    }

    public GuessingGame() {
        btnGuess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkGuess () ;
            }
        });
    }

    public static void main(String[] args) {
        GuessingGame theGame = new GuessingGame();
        theGame.newGame();
        theGame.setContentPane(theGame.mainPanel);
        theGame.setTitle("Lustige Game");
        theGame.setSize(700,400);
        theGame.setVisible(true);
        theGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
