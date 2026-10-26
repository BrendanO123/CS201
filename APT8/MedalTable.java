import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class MedalTable {
    private class MedalCounts{
        public int goldCount = 0;
        public int silverCount = 0;
        public int bronzeCount = 0;

        public MedalCounts winGold(){
            goldCount++;
            return this;
        }
        public MedalCounts winSilver(){
            silverCount++;
            return this;
        }
        public MedalCounts winBronze(){
            bronzeCount++;
            return this;
        }
    }
    public String[] generate(String[] results) {
        HashMap<String, MedalCounts> countryResults = new HashMap<>();
        for(String event : results){
            String[] array = event.split("\\s");
            countryResults.put(array[0], countryResults.getOrDefault(array[0], new MedalCounts()).winGold());
            countryResults.put(array[1], countryResults.getOrDefault(array[1], new MedalCounts()).winSilver());
            countryResults.put(array[2], countryResults.getOrDefault(array[2], new MedalCounts()).winBronze());
        }
        List<String> keyList = Arrays.asList(countryResults.keySet().toArray(new String[0]));

        Collections.sort(keyList, 
            Comparator.comparing((String str) -> countryResults.get(str).goldCount)
            .thenComparing((String str) -> countryResults.get(str).silverCount)
            .thenComparing((String str) -> countryResults.get(str).bronzeCount).reversed()
            .thenComparing(Comparator.naturalOrder())
        );

        StringBuilder ss;
        String[] ret = new String[keyList.size()];
        int i = -1;
        for(String country : keyList){
            ss = new StringBuilder();
            ss.append(country);
            ss.append(" ").append(countryResults.get(country).goldCount);
            ss.append(" ").append(countryResults.get(country).silverCount);
            ss.append(" ").append(countryResults.get(country).bronzeCount);
            ret[++i] = ss.toString();
        }
        return ret;
    }
}
