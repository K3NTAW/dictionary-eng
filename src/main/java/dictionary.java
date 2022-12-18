import java.util.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class dictionary {
    public static void main(String[] args) {
        boolean bool = true;
        Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);
        wordbook wordbook = new wordbook();
        HashMap<String, String> data = wordbook.gethishashmap();
        Set<String> keys = data.keySet();
        List<String> keyList = new ArrayList<>(keys);




        while (bool) {
            boolean ranbool = true;
            System.out.println("");
            System.out.println("What do you want to do? search,list or get a random word?");
            System.out.println("write (stop) to finish");
            String word = keyboard.nextLine();
            if (Objects.equals(word, "list")) {
                Collections.sort(keyList);
                for (String key : keyList) {
                    System.out.println(key);
                }
            } else if (Objects.equals(word,"random")) {
                while (ranbool) {
                    Collections.shuffle(keyList);
                    String randomKey = keyList.get(0);
                    String randomValue = data.get(randomKey);
                    System.out.println("Your Word:" + randomKey);
                    System.out.println("Do you want the description? yes/no");
                    String answer = keyboard.nextLine();
                    if (Objects.equals(answer, "yes")) {
                        String description = data.get(randomKey);
                        System.out.println("Description: " + description);
                        ranbool = false;
                    } else {
                    System.out.println("okayy, have fun searching!!");
                    ranbool = false;
                    }
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


