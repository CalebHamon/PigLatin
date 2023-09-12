//Caleb Hamon 9/8/23
import java.util.Scanner;

public class PigLatin {

    public static void main(String[] args) {
        //prompt user for word
        String phrase;
        int len;
        int nel;
        String fiword = "";
        System.out.println("Give a Word");
        Scanner scan = new Scanner(System.in);
        phrase = scan.nextLine();
        String[] words = phrase.split(" ");
        String temp = "";
        for (int p = 0; p > 0; p++) {
            if (words[p] == null) {
                len = p;
                p = -1;
            }
            len = 0;
        }
        for (int i = 0; i<len; i++){
            temp = words[i];
            nel = temp.length();
            temp = temp.substring(1,nel) + temp.substring(0,1) + "ay";
            fiword = fiword + temp + " ";
        }
        System.out.print("Your Word is " + fiword);
    }
}