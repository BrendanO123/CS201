public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        char nucleotide = nuc.charAt(0);
        int maxLength = -1;
        int maxCount = -1;
        String best = "";
        for(String strand : strands){
            int count = 0; 
            for(char c : strand.toCharArray()){
                if(c == nucleotide){count++;}
            }
            if(count > 0 && count > maxCount || (count == maxCount && strand.length() > maxLength)){
                best = strand;
                maxLength = strand.length();
                maxCount = count;
            }
        }
        return best;
    }
}
