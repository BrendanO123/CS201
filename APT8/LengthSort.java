import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class LengthSort {
    public String[] rearrange(String[] values){
        List<String> list = Arrays.asList(values);
        Collections.sort(list, Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
        return list.toArray(values);
    }
}
