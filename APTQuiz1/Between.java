import java.util.ArrayList;
public class Between {
    public String[] sandwiched(String[] words, int low, int high) {
        ArrayList<String> returned = new ArrayList<>();
        for(String word : words){
            if(low <= word.length() && word.length() <= high){returned.add(word);}
        }
        String[] helper = new String[returned.size()];
        return returned.toArray(helper);
    }
}
