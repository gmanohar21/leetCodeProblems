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
   public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer, ListNode> map = new HashMap<>();
        int prefixSum = 0;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        map.put(0, dummy);
        ListNode cur = head;
        while(cur != null) {
            prefixSum += cur.val;
            if(!map.containsKey(prefixSum)) {
                map.put(prefixSum, cur);
            } else {
                ListNode temp = map.getOrDefault(prefixSum, null);
                ListNode temp2 = temp.next;
                int sum = prefixSum;
                while(temp2 != cur) {
                    sum += temp2.val;
                    map.remove(sum);
                    temp2 = temp2.next;
                }

                temp.next = cur.next;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}