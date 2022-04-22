package guess_number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int guess, max, min, attempts;
        String agree;
        System.out.print("Möchten Sie in ein Spiel spielen, das man \"rate Zahl\" nennt? Tippen Sie [ yes / no ] ein: ");
        agree = scan.next();

        while (agree.equalsIgnoreCase("y")) {

        System.out.println("Geben Sie Bereich der Zahlen von min bis max ein.");
        System.out.print("MIN: ");
        min = scan.nextInt();
        System.out.print("MAX: ");
        max = scan.nextInt();

            int theNumber = (int) (Math.random() * (max-(min)) + (min));
            System.out.println(theNumber);
            attempts = 1;
            System.out.print("Tippen Sie bitte die Zahl in Ihrem Umfang ein: ");
           do  {
                guess = scan.nextInt();
                if (guess < theNumber) System.out.print("Ihr vorausplanende Zahl ist " + guess + " WENIGER als benötigt. Versuchen Sie noch ein mal: ");

                else if (guess > theNumber) System.out.print("Ihr vorausplanende Zahl ist " + guess + " GRÖßER als benötigt. Versuchen Sie noch ein mal: ");

                 else System.out.println("Gratulation! Sie haben gewonnen!Ihre Anzahl der Versuche: " + attempts);

                    attempts++;

            }while (guess != theNumber);
            System.out.print("Haben Sie Lust, noch ein mal zu spielen? [ n / y] :");
            agree = scan.next();
        }
            System.out.println("Wir werden auf Sie im nächsten Mal warten. Viel Erfol!");
    }
}