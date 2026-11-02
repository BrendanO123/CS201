import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class SyllableSorting {
    // LLM method for making list<string> comparable
    private int compareLists(List<String> a, List<String> b) {
        int n = Math.min(a.size(), b.size());
        for (int i = 0; i < n; i++) {
            int c = a.get(i).compareTo(b.get(i));
            if (c != 0) return c;
        }
        return Integer.compare(a.size(), b.size());
    }
    protected  class SyllableDecomposition{
        public List<String> unsorted;
        public List<String> sorted;
        SyllableDecomposition(String word){
            unsorted = decomposeSyllables(word);
            sorted = new ArrayList<>(unsorted);
            Collections.sort(sorted);
        }
    }
    private List<String> decomposeSyllables(String word){
        List<String> syllables = new ArrayList<>();
        Matcher matcher = Pattern.compile("[^aeiou]+[aeiou]+").matcher(word);
        while (matcher.find()) {
            syllables.add(matcher.group());
        }
        return syllables;
    }
    public String[] sortWords(String[] words) {
        HashMap<String, SyllableDecomposition> syllableDecompositions = new HashMap<>();
        for(String word : words){syllableDecompositions.put(word, new SyllableDecomposition(word));}
        List<String> wordList = Arrays.asList(words);
        Collections.sort(
            wordList, 
            Comparator.comparing((String word) -> syllableDecompositions.get(word).sorted, this::compareLists)
            .thenComparing((String word) -> syllableDecompositions.get(word).unsorted, this::compareLists)
        );
        return wordList.toArray(new String[0]);
    }
}
