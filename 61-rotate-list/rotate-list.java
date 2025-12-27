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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0 ){
            return head;
        }
        int n=1;
        ListNode tail=head;
        while(tail.next!=null){
            n++;
            tail=tail.next;
        }
        if(k%n==0){
            return head;
        }
        k=k%n;
        tail.next=head;
        int move=n-k-1;
        ListNode temp=head;
        while(move>0){
            temp=temp.next;
            move--;
        }
        ListNode newHead=temp.next;
        temp.next=null;
        return newHead;

    }
}