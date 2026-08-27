import java.util.HashSet;
import java.util.List;
public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        HashSet<String> unique = new HashSet<String>();
        List<String> list1 = List.of(list).stream().filter(str -> str.length() >= minLength && unique.add(str)).toList();
        String[] retList = new String[list1.size()];
        list1.toArray(retList);
        return retList;
    }
}