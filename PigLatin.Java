//Caleb Hamon 9/8/23
import java.util.Scanner;

public class PigLatin {

    public static void main(String[] args) {
        //prompt user for word
        String phrase;
        int len;
        System.out.println("Give a Word");
        Scanner scan = new Scanner(System.in);
        phrase = scan.nextLine(System.in);
        len = phrase.length();
        for (int i = 0; i<len; i++){
            phrase.substring(i, i+1); // up to but not including i + 1
        }
    }
}