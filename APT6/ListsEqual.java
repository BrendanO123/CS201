public class ListsEqual {
    public int equal (ListNode a1, ListNode a2) {
        for(; a1 != null && a2 != null; a1 = a1.next, a2 = a2.next){
            if(a1.info != a2.info){return 0;}
        }
        if(a1 == null ^ a2 == null){return 0;}
        return 1;
    }
}