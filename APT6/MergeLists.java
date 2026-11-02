public class MergeLists {
    public ListNode weave (ListNode a, ListNode b) {
        if(a.next == null && b.next == null){
            a.next = b;
            return a;
        }
        ListNode afterMe = weave(a.next, b.next);
        b.next = afterMe;
        a.next = b;
        return a;
    }
}