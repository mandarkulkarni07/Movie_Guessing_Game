//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> movieList = CreateList.AddMoviesFromFileToList();
        String movieName = PickRandom.GetmovieName();
        System.out.println("your movie contains "+movieName.length()+" letters");

        StringBuilder GuessedAttempts = PickRandom.UserGuessed(movieName);
        System.out.println(GuessedAttempts);
        System.out.println("you have 10 guesses. start guessing");

        Compare.CompareInputToMovie(movieName,GuessedAttempts);


    }

}