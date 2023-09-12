//Caleb Hamon 9/8/23
import java.util.Scanner;

public class PigLatin {

    public static void main(String[] args) {
        //prompt user for word
        String phrase;
        int len;
        System.out.println("Give a Word");
        Scanner scan = new Scanner(System.in);
        phrase = scan.nextLine();
        len = phrase.length();
        String temp = "";
        for (int i = 1; i<len; i++){
            phrase.substring(i, i+1); // up to but not including i + 1
            temp = temp + phrase.substring(i, i+1);
        }
        temp = temp + phrase.substring(0, 1) + "ay";
        System.out.print("Give a Word");
    }
}