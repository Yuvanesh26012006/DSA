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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1=l1;
        ListNode h2=l2;
        ListNode dummy =new ListNode(-1);
        ListNode current=dummy;
        int carry=0;
        int sum=0;
        while(h1!=null || h2!=null){
            sum=carry;
             if(h1!=null){
                sum+=h1.val;
             }
             if(h2!=null){
                sum+=h2.val;
             }
            ListNode lsum=new ListNode(sum%10);
            carry=sum/10;
            current.next=lsum;
            current=current.next;
            if(h1!=null){
                h1=h1.next;
            }
            if(h2!=null){
                h2=h2.next;
            }
        }
        if(carry!=0){
            ListNode csum=new ListNode(carry);
            current.next=csum;
        }
        return dummy.next;
    }
}