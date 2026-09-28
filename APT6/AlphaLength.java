import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AlphaLength {
    ListNode makeList(List<String> sortList){
        if(sortList.size() == 0){return null;}
        ListNode workingHead = new ListNode(sortList.get(0).length());
        ListNode list = workingHead;
        for(int i = 1; i < sortList.size(); i++){
            if(sortList.get(i).equals(sortList.get(i-1))){continue;}
            ListNode next = new ListNode(sortList.get(i).length());
            workingHead.next = next;
            workingHead = next;
        }
	    return list;
    }
    public ListNode create(String[] words) {
        List<String> sortList = Arrays.asList(words);
        Collections.sort(sortList);
        return makeList(sortList);
    }
}
