import java.util.ArrayList;
import java.util.Scanner;


public class ChatHist {

    ArrayList<String> words = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    boolean n = true;
    while (n){
        String input = scanner.nextLine();

        if (input.equals("STOP")) {
            n = false;
        }

    }
}
