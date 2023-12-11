import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        //Collects input from the user 

        while (true) {
            System.out.println("Please enter a sentence to validate: ");
            userInput = scanner.nextLine();

            while (userInput.equals("")) {

                //if user puts no data prmompts user to enter data 
                System.out.println("Please enter a valid sentence to continue or enter 'quit' to finish ");
                userInput = scanner.nextLine(); // you might want to remove 'to upperCase();
            }
            if (userInput.equals("quit")) {
                System.exit(0);
            }

            boolean isTrue = ValidateSentence.SentenceValidator(userInput);
            if (isTrue) {
                System.out.println("Valid Sentence");
            } else System.out.println("Invalid sentence!");
            //gives feedback depending on the inputted data

            if (userInput.equals("quit")){
                break;
            }

        }
    }


}
