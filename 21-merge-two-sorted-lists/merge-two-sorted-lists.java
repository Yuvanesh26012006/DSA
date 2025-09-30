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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode dummyHead=dummy;
        ListNode head1=list1;
        ListNode head2=list2;
        while(head1!=null && head2!=null){
            if(head1.val<head2.val){
                dummyHead.next=head1;
                dummyHead=head1;
                head1=head1.next;
            }
            else{
                dummyHead.next=head2;
                dummyHead=head2;
                head2=head2.next;
            }
        }
        if(head1!=null){
            dummyHead.next=head1;
        }
        else{
            dummyHead.next=head2;
        }
        return dummy.next;
    }
}