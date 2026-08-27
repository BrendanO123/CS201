import java.util.HashMap;

public class Common {
    public HashMap<Character, Integer> toCountMap(String a){
        HashMap<Character, Integer> countsA = new HashMap<Character, Integer>();
        char[] aChars = a.trim().toLowerCase().toCharArray();
        for(char c : aChars){
            if(countsA.containsKey(c)){countsA.replace(c, countsA.get(c).intValue()+1);}
            else{countsA.put(c, 1);}
        }
        return countsA;
    }
    public int count (String a, String b) {
        HashMap<Character, Integer> countsA = toCountMap(a);
        HashMap<Character, Integer> countsB = toCountMap(b);

        int dupeCount = 0;
        for(char c : countsA.keySet()){
            if(countsB.containsKey(c)){dupeCount += Math.min(countsB.get(c).intValue(), countsA.get(c).intValue());}
        }
        return dupeCount;
    }
}