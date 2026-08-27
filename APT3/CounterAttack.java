import java.util.HashMap;

public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        HashMap<String, Integer> counts = new HashMap<String, Integer>();
        String[] strWords = str.split("\\s");
        for(String strWord : strWords){
            if(counts.containsKey(strWord)){counts.replace(strWord, counts.get(strWord).intValue() + 1);}
            else{counts.put(strWord, 1);}
        }
        int[] retList = new int[words.length];
        for(int i = 0; i < retList.length; i++){
            if(counts.containsKey(words[i])){retList[i] = counts.get(words[i]).intValue();}
            else{retList[i] = 0;}
        }
        return retList;
    }
}