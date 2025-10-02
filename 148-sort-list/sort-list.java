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
    public static ListNode findMiddle(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static ListNode merge(ListNode head1,ListNode head2){
        ListNode h1=head1;
        ListNode h2=head2;
        ListNode h3=new ListNode(-1);
        ListNode dummy=h3;
        while(h1!=null && h2!=null){
            if(h1.val<h2.val){
                dummy.next=h1;
                dummy=h1;
                h1=h1.next;
            }
            else{
                dummy.next=h2;
                dummy=h2;
                h2=h2.next;
            }
        }
       if(h1!=null){
            dummy.next=h1;
       }
       else{
        dummy.next=h2;
       }
        return h3.next;
    }
    public static ListNode sortList(ListNode head) {
     if(head==null || head.next==null){
        return head;
     }
     ListNode middle=findMiddle(head);
     ListNode leftHalf=head;
     ListNode rightHalf=middle.next;
     middle.next=null;
     leftHalf=sortList(leftHalf);
     rightHalf=sortList(rightHalf);
     return merge(leftHalf,rightHalf);
    }
}