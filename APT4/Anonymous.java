import java.util.HashMap;

public class Anonymous {
    public HashMap<Character, Integer> toCountMap(String a){
        HashMap<Character, Integer> countsA = new HashMap<Character, Integer>();
        char[] aChars = a.trim().toLowerCase().toCharArray();
        for(char c : aChars){
            if(countsA.containsKey(c)){countsA.replace(c, countsA.get(c).intValue()+1);}
            else{countsA.put(c, 1);}
        }
        return countsA;
    }
    public int howMany(String[] headlines, String[] messages) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(String headline : headlines){sb.append(headline);}
        HashMap<Character, Integer> letterBank = toCountMap(sb.toString());

        for(String message : messages){
            HashMap<Character, Integer> messageCount = toCountMap(message);
            boolean writable = true;
            for(char c : messageCount.keySet()){
                if(!letterBank.containsKey(c) || letterBank.get(c).intValue() < messageCount.get(c).intValue()){
                    writable = false;
                    break;
                }
            }
            if(writable){count++;}
        }
        return count;
    }
}