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
    public static ListNode reverse(ListNode temp){
        ListNode prev=null;
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
       if(head==null|| head.next==null) return true;
       ListNode slow=head;
       ListNode fast=head;
       while(fast.next!=null && fast.next.next!=null){
             slow=slow.next;
             fast=fast.next.next;
       }
       ListNode second=reverse(slow.next);
       ListNode first=head;
       while(second!=null){
            if(first.val!=second.val){
                reverse(second);
                return false;
            }
            first=first.next;
            second=second.next;
       }
       reverse(second);
       return true;
    }
}