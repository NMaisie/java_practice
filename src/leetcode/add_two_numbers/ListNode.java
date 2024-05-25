package leetcode.add_two_numbers;

public class ListNode implements Comparable<ListNode>{
    int val;
    ListNode next;
    ListNode() {
    }
    ListNode(int val) {
        this.val = 0 <= val && val <= 9 ? val : 0;
    }
    ListNode(int val, ListNode next) {
        this(val);
        this.next = next;
    }

    ListNode(int[] vals){
        if(vals.length > 0){
            this.val = vals[0];
            ListNode next = this;
            for(int i = 1; i < vals.length; i++){
                next.next = new ListNode(vals[i]);
                next = next.next;
            }
        }
    }

    @Override
    public int compareTo(ListNode o) {
        return Integer.compare(this.val, o.val);
    }

    @Override
    public String toString() {
        if (this.next == null) return String.valueOf(this.val);
        return String.format("%d -> %s", this.val, this.next);
    }
}
