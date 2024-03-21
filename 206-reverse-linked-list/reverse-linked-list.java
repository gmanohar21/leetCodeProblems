/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode crr=head,next=null,prev=null;
        while(crr!=null){
            next=crr.next;
             crr.next=prev;
            prev=crr;
            crr=next;
        }
        return prev;
    }
}