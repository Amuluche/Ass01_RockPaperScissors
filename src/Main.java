//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        String R = "Rock";
        String P = "Paper";
        String S = "Scissors";

        Scanner player1 = new Scanner(System.in);
        Scanner player2 = new Scanner(System.in);

        System.out.print("Player1 enter R, P or S: ");
        String Player1 = player1.nextLine();

        System.out.print("Player2 enter R, P or S: ");
        String Player2 = player2.nextLine();

        if(Player1.equals("P") && Player2.equals("R")) {
            System.out.println("Player 1 wins, Paper covers Rock");
        }

        else if(Player1.equals("S") && Player2.equals("P")) {
            System.out.println("Player 1 wins, Scissors cuts paper");
        }

        else if(Player1.equals("R") && Player2.equals("P")) {
            System.out.println("Player 2 wins, Paper covers Rock");
        }

        else if(Player1.equals("P") && Player2.equals("S")) {
            System.out.println("Player 2 wins, Scissors cuts paper");
        }

        else if(Player1.equals("R") && Player2.equals("S")) {
            System.out.println("Player 1 wins, Rock breaks Scissors");
        }

        else if(Player1.equals("S") && Player2.equals("R")) {
            System.out.println("Player 2 wins, Rock breaks Scissors");
        }

        else if(Player1.equals("P") && Player2.equals("P") || Player1.equals("S") && Player2.equals("S") || Player1.equals("R") && Player2.equals("R")) {
            System.out.println("Its a tie");
        }

        else {
            System.out.println("Invalid input");
        }
    }
}