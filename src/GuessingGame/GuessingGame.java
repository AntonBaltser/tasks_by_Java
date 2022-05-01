package GuessingGame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessingGame extends JFrame {
    private JTextField txtGuess;
    private JButton btnGuess;
    private JLabel lblOutput;
    private JPanel mainPanel;
    private JButton btnAgain;
    private JButton btnMin;
    private JLabel lblChange;
    private JButton btnMax;
    private JLabel lblInterval;
    private int theNumber, amount, min = 0, max = 100;

    public void checkGuess () {
        lblChange.setVisible(false);
        btnMin.setVisible(false);
        btnMax.setVisible(false);
        amount++;

        String guessText = txtGuess.getText();
        String message = "";
        try {
            int guess = Integer.parseInt(guessText);
            if (guess < theNumber)
                message = "Ihr vorausplanende Zahl ist " + guess + " WENIGER als benötigt. Versuchen Sie noch ein mal";
            else if (guess > theNumber)
                message =  "Ihr vorausplanende Zahl ist " + guess + " GRÖßER als benötigt. Versuchen Sie noch ein mal";
            else {
                message = guess + " Gratulation! Sie haben gewonnen! amount = "  + amount;
                btnAgain.setVisible(true);
                btnGuess.setVisible(false);
            }

        } catch (Exception e) {
            message = "Enter a whole number between 1 and 100.";
        } finally {
            lblOutput.setText(message);
            txtGuess.requestFocus();
            txtGuess.selectAll();
        }
    }
    public void newGame () {
      theNumber = (int) (Math.random() * (max-(min)) + (min));

        btnMin.setVisible(true);
        btnMax.setVisible(true);
        lblChange.setVisible(true);

        lblInterval.setText("Guess a number etween " + min + " and " + max + ":");

        btnAgain.setVisible(false);
        btnGuess.setVisible(true);
        amount = 0;
    }
    public GuessingGame() {
        btnGuess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkGuess ();
            }
        });
        txtGuess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                checkGuess ();
            }
        });
        btnAgain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lblOutput.setText("Enter a number above and click Guess!");
                newGame ();
            }
        });
        btnMin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String m = JOptionPane.showInputDialog("choose a lower number");
            min = Integer.parseInt(m);
                newGame ();
            }
        });
        btnMax.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String m = JOptionPane.showInputDialog("choose a higher number");
                max = Integer.parseInt(m);
                newGame ();
            }
        });
    }

    public static void main(String[] args) {
        GuessingGame theGame = new GuessingGame();
        theGame.newGame();
        theGame.setContentPane(theGame.mainPanel);
        theGame.setTitle("Guessing a number Game");
        theGame.setSize(700,400);
        theGame.setVisible(true);
        theGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
