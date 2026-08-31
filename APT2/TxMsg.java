import java.util.HashSet;

public class TxMsg {
    public String getMessage(String original) {
        char[] constants = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
        HashSet<Character> constantsSet = new HashSet<Character>();
        for(char c : constants){constantsSet.add(c);}

        String[] words = original.toLowerCase().split("\\s");
        StringBuilder sb = new StringBuilder();
        for(String word : words){

            boolean vowelOnly = true;
            for(char c : constants){
                if(word.indexOf(c) != -1){
                    vowelOnly = false;
                    break;
                }
            }
            if(vowelOnly){
                sb.append(word);
                sb.append(' ');
                continue;
            }

            boolean previousWasConstant = false;
            for(char c : word.toCharArray()){
                if(constantsSet.contains(c)){
                    if(!previousWasConstant){
                        sb.append(c);
                    }
                    previousWasConstant = true;
                }
                else{previousWasConstant = false;}
            }
            sb.append(' ');
        }
        return sb.toString().trim();
    }
}