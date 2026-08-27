import java.util.HashSet;

public class SimpleWordGame {
    public int points(String[] player, String[] dictionary) {
        HashSet<String> usedWords = new HashSet<String>();
        HashSet<String> dict = new HashSet<String>();
        for(String word : dictionary){dict.add(word);}

        int score = 0;
        for(String word : player){
            if(dict.contains(word) && usedWords.add(word)){score += word.length() * word.length();}
        }
        return score;
    }
}