import java.util.Collections;
import java.util.HashMap;


public class BigWord {
    public String most(String[] sentences) {
        int max = 0;
        String commonWord = "";
        HashMap<String, Integer> counts = new HashMap<String, Integer>();
        for(String sentence : sentences){
            String[] strWords = sentence.toLowerCase().split("\\s");
            for(String strWord : strWords){
                if(counts.containsKey(strWord)){counts.replace(strWord, counts.get(strWord).intValue() + 1);}
                else{counts.put(strWord, 1);}
                if(counts.get(strWord).intValue() > max){
                    max = counts.get(strWord).intValue();
                    commonWord = strWord;
                }
            }
        }
        return commonWord;
    }
}