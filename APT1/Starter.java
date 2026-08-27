import java.util.HashSet;

public class Starter {
    public int begins(String[] words, String first) {
        HashSet<String> validWords = new HashSet<String>();
        char starter = first.charAt(0);
        int count = 0;
        for(String word : words){
            if(word.charAt(0) == starter){
                if(validWords.add(word)){count++;}
            }
        }
        return count;
    }
}
