import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateList {

    public static ArrayList<String> AddMoviesFromFileToList(){
        File file = new File("D:/java project/movieNames.txt");
        ArrayList<String> list= new ArrayList<>();
        try{
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                String st= scan.nextLine();
                list.add(st);
            }
            scan.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("Error, File not present");
            e.printStackTrace();
        }
        return list;
    }

}
