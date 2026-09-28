public class ListSum {
    public int sum(ListNode list, int thresh) {
        int sum = 0;
        for(; list != null; list = list.next){
            sum += (list.info > thresh ? list.info : 0);
        }
        return sum;
    }
}
