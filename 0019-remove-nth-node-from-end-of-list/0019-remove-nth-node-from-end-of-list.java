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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int cout=0;
        while(temp!=null)
        {
           
            temp=temp.next;
            cout++;
        }
        if(n==cout)
        {
           head=head.next;
           return head;
        }
        int find=cout-n;
        ListNode prev=head;
        for(int i=1;i<find;i++)
        {
             prev=prev.next;
        }
        prev.next=prev.next.next;
        return head;

    }
}