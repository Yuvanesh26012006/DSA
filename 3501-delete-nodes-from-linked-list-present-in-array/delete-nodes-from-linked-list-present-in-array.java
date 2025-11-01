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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy=new ListNode(-1);
        HashSet<Integer> h1=new HashSet<>();
        for(int i:nums){
            h1.add(i);
        }
        dummy.next=head;
        ListNode current=dummy;
        while(current.next!=null){
              if(h1.contains(current.next.val)){
                 current.next=current.next.next;
              }
              else{
                current=current.next;
              }
        }
        return dummy.next;
    }
}