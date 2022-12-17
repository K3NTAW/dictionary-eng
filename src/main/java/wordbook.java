import java.util.HashMap;

public class wordbook {
    HashMap<String, String> eng = new HashMap<>();

    public wordbook () {
        this.eng = new HashMap<>();
     eng.put("diminuitive","small");
     eng.put("hello","A greeting");
    }

    public HashMap<String, String> gethishashmap () {
        return this.eng;
    }
}