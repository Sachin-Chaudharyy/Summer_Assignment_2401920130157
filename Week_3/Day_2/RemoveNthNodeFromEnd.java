class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        if(n == size){
            return head.next;
        }
        temp = head;
        n = size - n;
        while(n > 1){
            temp = temp.next;
            n--;
        }
        temp.next = temp.next.next;
        return head;
    }
}
