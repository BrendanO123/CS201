import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class SortedFreqs {
    public int[] freqs(String[] data) {
        HashMap<String, Integer> OccurrenceCounts = new HashMap<>();
        for(String str : data){
            OccurrenceCounts.put(str, OccurrenceCounts.getOrDefault(str, 0) + 1);
        }
        List<String> keyList = Arrays.asList(OccurrenceCounts.keySet().toArray(new String[0]));
        Collections.sort(keyList);
        int[] ret = new int[keyList.size()];
        int i = -1;
        for(String str : keyList){
            ret[++i] = OccurrenceCounts.get(str);
        }
        return ret;
    }
}
