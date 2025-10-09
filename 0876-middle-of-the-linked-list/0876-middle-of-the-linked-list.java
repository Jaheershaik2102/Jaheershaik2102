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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int counter=0;
        int middle;
        while(temp!=null){
            counter++;
            temp=temp.next;
        }
         middle=(counter/2)+1;
         temp=head;
         while(temp!=null){
            middle=middle-1;
            if(middle==0)
            break;
            temp=temp.next;
         }
              return temp;      
    }
     
}