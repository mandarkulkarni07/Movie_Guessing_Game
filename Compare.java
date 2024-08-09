import java.util.Scanner;

public class Compare {
    public static void CompareInputToMovie(String movieName, StringBuilder GuessedAttempts){
        try{
            Scanner userScanner = new Scanner(System.in);
            int guesses = 10;
            while(guesses!=0){
                System.out.println("Enter the character: ");
                String ch= userScanner.nextLine();

                while(ch.length()!=1){
                    System.out.println("Invalid input, Please enter single character");
                    guesses--;
                    System.out.println("only"+guesses+" guesess left");
                    System.out.println("Enter the character: ");
                    ch= userScanner.nextLine();
                }

                ch= ch.toLowerCase();

                if(GuessMovie.IsPresent(movieName,GuessedAttempts,ch)){
                    System.out.println("only"+guesses+" guesess left");
                    GuessedAttempts=GuessMovie.IfPresent(movieName,GuessedAttempts,ch);
                    String dummy= GuessedAttempts.toString();
                    System.out.println(GuessedAttempts);
                    if(movieName.equals(dummy)){
                        System.out.println("Congrats, You won!");
                        break;
                    }
                }
                else{
                    guesses--;
                    System.out.println(GuessedAttempts);
                    System.out.println("only"+guesses+" guesess left");
                }

            }
            System.out.println("You lost");
            userScanner.close();
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

}
