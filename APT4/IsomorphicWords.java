import java.util.HashMap;
public class IsomorphicWords {
    public boolean isIsomorphic(String a, String b){
        if(a == null || b == null || a.length() != b.length()){return false;}
        HashMap<Character, Character> encoding = new HashMap<Character, Character>();
        for(int i = 0; i < a.length(); i++){
            if(encoding.containsKey(a.charAt(i))){
                if(b.charAt(i) != encoding.get(a.charAt(i)).charValue()){return false;}
            }
            else{
                if(encoding.containsValue(b.charAt(i))){return false;}
                else{
                    encoding.put(a.charAt(i), b.charAt(i));
                }
            }
        }
        return true;
    }
    public int countPairs(String[] words) {
        int sum = 0;
        for(int i = 0; i< words.length; i++){
            for(int j = i+1; j < words.length; j++){
                if(isIsomorphic(words[i], words[j])){sum++;}
            }
        }
        return sum;
    }
}