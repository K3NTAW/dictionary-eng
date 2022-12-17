import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;



public class dictionary {
    public static void main(String[] args) {
        wordbook wordbook = new wordbook();
        HashMap<String, String> data = wordbook.gethishashmap();


        Set<String> keys = data.keySet();

        Scanner keyboard = new Scanner(System.in);
        boolean bool = true;


        while (bool) {
            System.out.println("");
            System.out.println("Do you wanna search a word or list all the words in the dictionary? list/search");
            String word = keyboard.nextLine();
            if (Objects.equals(word, "list")) {
                for (String key : keys) {
                    System.out.println(key);
                }
            } else if (Objects.equals(word, "search")) {
                System.out.println("Wich word do you wanna search?");
                String searchword = keyboard.nextLine();
                if (data.containsKey(searchword)) {
                    String des = data.get(searchword);
                    System.out.println("Word: " + searchword);
                    System.out.println("Description: " + des);
                } else {
                    System.out.println("No word found");
                }
            } else if (Objects.equals(word, "stop")) {
                bool = false;
            }
        }
    }
}















