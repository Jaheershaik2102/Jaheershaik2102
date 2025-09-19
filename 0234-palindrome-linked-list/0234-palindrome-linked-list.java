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
class Solution{
    public boolean isPalindrome(ListNode head){
        ListNode slow=head,fast=head;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        ListNode curr=slow,prev=null,future =null;
        while(curr!=null){
            future =curr.next;
            curr.next=prev;
            prev=curr;
            curr=future;
        }
        ListNode fh =head,sh=prev;
        while(sh!=null){
            if(fh.val!=sh.val)
               return false;
            fh=fh.next;
            sh=sh.next;
        }
        return true;
    }
}

    
    

    