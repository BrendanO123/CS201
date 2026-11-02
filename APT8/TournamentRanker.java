import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class TournamentRanker {
    HashMap<String, Integer> winCounts;
    HashMap<String, String> lostToMap;
    private int compare(String a, String b){
        if(winCounts.getOrDefault(a, 0) != winCounts.getOrDefault(b, 0)){return winCounts.getOrDefault(a, 0) - winCounts.getOrDefault(b, 0);}
        return compare(lostToMap.get(a), lostToMap.get(b));
    }
    public String[] rankTeams(String[] names, String[] lostTo) {
        winCounts = new HashMap<>();
        lostToMap = new HashMap<>();
        for(int i = 0; i < lostTo.length; i++){
            winCounts.put(lostTo[i], winCounts.getOrDefault(lostTo[i], 0) + 1);
            lostToMap.put(names[i], lostTo[i]);
        }
        List<String> teams = Arrays.asList(names);
        Collections.sort(teams, Comparator.comparing((String a) -> a, this::compare).reversed());
        return teams.toArray(new String[0]);
    }
}
