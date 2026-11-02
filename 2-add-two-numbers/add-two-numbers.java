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
        ListNode fhead=l1;
        ListNode shead=l2;
        ListNode prev=null;
        int carry=0;
        while(fhead!=null&&shead!=null){
            fhead.val=fhead.val+shead.val+carry;
                carry=fhead.val/10;
                fhead.val=fhead.val%10;
                prev=fhead;
                fhead=fhead.next;
                shead=shead.next;  
        }
        //now the case is one head is empty
        if(shead!=null){
            prev.next=shead;
            fhead=prev.next;
        }
        while(fhead!=null&&carry>0){
        
            fhead.val=fhead.val+carry;
            carry=fhead.val/10;
            fhead.val=fhead.val%10;
            prev=fhead;
            fhead=fhead.next;
        }
        if(carry!=0){
            prev.next=new ListNode(carry);
        }
       return l1;
    }
}