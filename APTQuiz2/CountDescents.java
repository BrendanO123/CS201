public class CountDescents {
    public int count(ListNode list) {
        int count = 0;
        while(list != null && list.next != null){
            if(list.info > list.next.info){count++;}
            list = list.next;
        }
        return count;
    }
}
