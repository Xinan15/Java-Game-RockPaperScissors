import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock, Paper and Scissors.");
        System.out.println("When I say 'shoot', choose: rock, paper or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String response = scan.nextLine();

        if(response.equals("yes")){
            System.out.println("Great!\n");
            System.out.println("rock - paper - scissors, shoot!");
            
            String userChoice = scan.nextLine();
            String compChoice = computerChoice();
            String finalResult = result(userChoice,compChoice);

            printResult(userChoice,compChoice,finalResult);

        }else{
            System.out.println("Darn, some other time...");
        }

        scan.close();
    
    }

    public static String computerChoice() {

        int computerNum = (int) (3 * Math.random());

        switch (computerNum) {

            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                return "Error in the app. Please visit this bug.";
        }
    }

    public static String result(String userChoice, String compChoice) {

        String result = "";

        if ((userChoice.equals("rock")) && compChoice.equals("scissors")) {
            return "You win!";
        } else if ((userChoice.equals("paper")) && compChoice.equals("rock")) {
            return "You win!";
        } else if (((userChoice.equals("scissors")) && compChoice.equals("paper"))) {
            return "You win!";
        } else if ((userChoice.equals("rock")) && compChoice.equals("paper")) {
            return "You lose!";
        } else if ((userChoice.equals("paper")) && compChoice.equals("scissors")) {
            return "You lose!";
        } else if (((userChoice.equals("scissors")) && compChoice.equals("rock"))) {
            return "You lose!";
        } else if (userChoice.equals(compChoice)) {
            return "It's a tie!";
        } else {
            System.out.println("INVALID CHOICE");
            System.exit(0);
        }

        return result;

    }

    public static void printResult(String userChoice, String compChoice, String finalResult) {

        System.out.println("\nYou chose " + userChoice);
        System.out.println("The Computer chose " + compChoice);
        System.out.println(finalResult);
    }

}