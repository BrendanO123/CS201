import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class SortByFreqs {
    public String[] sort(String[] data) {
        HashMap<String, Integer> OccurrenceCounts = new HashMap<>();
        for(String str : data){
            OccurrenceCounts.put(str, OccurrenceCounts.getOrDefault(str, 0) + 1);
        }
        List<String> keyList = Arrays.asList(OccurrenceCounts.keySet().toArray(new String[0]));
        Collections.sort(keyList, Comparator.comparing((String str) -> OccurrenceCounts.get(str)).reversed().thenComparing(Comparator.naturalOrder()));
        return keyList.toArray(new String[0]);
    }
}
