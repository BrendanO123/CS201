import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class ScoreSort {
    public String[] rank(String[] names, ListNode scores) {
        TreeMap<String, Integer> map = new TreeMap<>();
        for(String s : names){
            map.put(s, map.getOrDefault(s, 0) + scores.info);
            scores = scores.next;
        }
        List<String> list = Arrays.asList(map.keySet().toArray(new String[0]));
        Collections.sort(list, Comparator.comparing((s) -> map.get(s)).reversed());
        return list.toArray(new String[0]);
    }
}
