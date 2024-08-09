import java.util.*;

public class GuessMovie {
    public static int Random(){
        Random random = new Random();
        int RandomNum= random.nextInt(25)+1;
        return RandomNum;
    }

    public static boolean IsPresent(String movieName,StringBuilder GuessedAttempts,String ch){
        for(int i=0;i<movieName.length();i++){
            if(ch.charAt(0)==movieName.charAt(i)){
                return true;
            }
        }
        return false;
    }

    public static StringBuilder IfPresent(String movieName,StringBuilder GuessedAttempts,String ch){
        for(int i=0;i<movieName.length();i++){
            if(ch.charAt(0)==movieName.charAt(i)){
                GuessedAttempts.replace(i,i+1,ch);

            }
        }
        return GuessedAttempts;
    }

}
