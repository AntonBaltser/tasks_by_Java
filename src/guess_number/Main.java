package guess_number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int guess;
        String agree;
        System.out.print("Möchten Sie in ein Spiel spielen, das man \"rate Zahl\" nennt? Tippen Sie [ yes / no ] ein: ");
        agree = scan.next();
        while (agree.equalsIgnoreCase("y")) {
            int theNumber = (int) (Math.random() * 100 + 1);
            System.out.println(theNumber);
            System.out.print("Tippen Sie bitte die Zahl von 1 bis 100 ein: ");
           do  {
                guess = scan.nextInt();
                if (guess < theNumber) {
                    System.out.print("Ihr vorausplanende Zahl ist " + guess + " WENIGER als benötigt. Versuchen Sie noch ein mal: ");
                } else if (guess > theNumber) {
                    System.out.print("Ihr vorausplanende Zahl ist " + guess + " GRÖßER als benötigt. Versuchen Sie noch ein mal: ");
                } else
                    System.out.println("Gratulation! Sie haben gewonnen!");
            }while (guess != theNumber);
            System.out.print("Haben Sie Lust, noch ein mal zu spielen? [ n / y] :");
            agree = scan.next();
        }
            System.out.println("Wir werden auf Sie im letzten Mal warten. Viel Erfol!");
    }
}