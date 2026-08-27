import java.util.HashMap;

public class Encryption {
    public String encrypt(String message){
        HashMap<Character, Character> dict = new HashMap<Character, Character>();
        StringBuilder sb = new StringBuilder();
        char current = 'a';
        for(char c : message.toCharArray()){
            if(dict.containsKey(c)){sb.append(dict.get(c).charValue());}
            else{
                sb.append(current);
                dict.put(c, current);
                current++;
            }
        }
        return sb.toString(); 
    }
}