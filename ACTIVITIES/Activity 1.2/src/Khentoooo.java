/*Hi, my name is Ivana, and I’m really hot. I get around 100 new boys giving me messages everyday asking me to be their girlfriend. I may be hot but I’m also respectful so I still wanna give them a chance. But there's one trait that really gets on my nerves and its when people text “LiKE ThISS”. JeJe messages!!

I don’t even wanna respond to these types of texts but with the sheer amount of texts I get per day from boys, it’s impossible for me to filter these messages out manually.

Oh, pretty please could you make something that detects messages with capital letters that are misplaced (i.e. letters that are capitalized that are not at the start of the word)? If you could do this for me, I’ll give you a shout out on my next Instagram post, hihihi!

Inputs

1. The message

All characters in the message are alphabetical characters.

 

Sample Output 1

Enter the message: I am handsome
uWu
Sample Output 2

Enter the message: I Am HAndSome
JEJE!
Sample Output 3

Enter the message: Can U Be Mai Girlfriend
uWu */
import java.util.Scanner;

public class Khentoooo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the message: ");
                 String msg = scanner.nextLine();
        
        if (detectMisplacedCaps(msg)) {
            System.out.println("JEJE!");
        } else {
            System.out.println("uWu");
        }
    }
    public static boolean detectMisplacedCaps(String msg) {
        String[] words = msg.split("\\s+");
        
        for (String word : words) {         
            if (Character.isUpperCase(word.charAt(0))) {               
                for (int i = 1; i < word.length(); i++) {
                    if (!Character.isLowerCase(word.charAt(i))) {
                        return true; 
                    }
                }
            }
        }
        return false; 
    }
}
