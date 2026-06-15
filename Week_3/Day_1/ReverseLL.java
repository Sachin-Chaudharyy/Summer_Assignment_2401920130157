class Solution {
  public ListNode reverseList(ListNode head) {
    ListNode temp;
    if(head == null || head.next == null) {
      return head;
    }
    ListNode prev = head;
    ListNode curr = head.next;
    while(curr != null) {
      temp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = temp;
    }
    head.next = null;
    head = prev;
    return head;
  }
}
