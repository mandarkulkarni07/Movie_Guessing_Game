import java.io.FileNotFoundException;

public class PickRandom {
    public static String GetmovieName(){
        int idx = GuessMovie.Random();
        String movieName = CreateList.AddMoviesFromFileToList().get(idx);
        return movieName;
    }

    public static StringBuilder UserGuessed(String movieName) {

        StringBuilder GuessedAttempts = new StringBuilder();
        for (int i = 0; i < movieName.length(); i++) {
            if(movieName.charAt(i)==' ') {
                GuessedAttempts.append(" ");
            }
            else{
                GuessedAttempts.append("_");
            }
        }

        return GuessedAttempts;
    }
}