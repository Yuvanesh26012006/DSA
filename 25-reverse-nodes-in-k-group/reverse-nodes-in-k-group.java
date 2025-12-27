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
    public static ListNode FindKthNode(ListNode current,int k){
        k--;
        while(current!=null && k>0){
            current=current.next;
            k--;
        }
        return current; 
    }
    public static void reverse(ListNode current){
        ListNode prev=null;
        while(current!=null){
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
    }
    public static  ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode kthNode=FindKthNode(temp,k);
            if(kthNode==null){
                if(prev!=null){
                    prev.next=temp;
                }
                break;
            }
            ListNode next=kthNode.next;
            kthNode.next=null;
            reverse(temp);
            if(temp==head){
                head=kthNode;
            }
            else{
                prev.next=kthNode;
            }
            prev=temp;
            temp=next;
        }
        return head;
    }
}