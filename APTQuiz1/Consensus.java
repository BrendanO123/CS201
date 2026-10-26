import java.util.HashMap;
import java.lang.StringBuilder;

public class Consensus {
    public char electedLetter(String[] words, int index){
        HashMap<Character, Integer> counts = new HashMap<>();
        for(String word : words){
            char c = word.charAt(index);
            counts.put(c, counts.getOrDefault(c, 0).intValue() + 1);
        }
        char favorite = words[0].charAt(index);
        int bestCount = 0;
        for(Character c : counts.keySet()){
            if(
                counts.get(c).intValue() > bestCount || 
                (counts.get(c).intValue() == bestCount && c.charValue() < favorite)
            )
            {
                bestCount = counts.get(c).intValue();
                favorite = c.charValue();
            }
        }
        return favorite;
    }
    public String consensus(String[] words){
        StringBuilder ss = new StringBuilder();
        for(int i = 0; i < words[0].length(); i++){
            ss.append(electedLetter(words, i));
        }
        return ss.toString();
    }
}
