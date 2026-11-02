class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a = l1;
        ListNode b =l2;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry = 0;
        while(a!=null || b!=null)
        {
            int d1 = 0,d2 = 0;
            if(a!=null) d1 = a.val;
            if(b!=null) d2 = b.val;
            int sum = d1 + d2 + carry;
            int val = sum % 10;
            carry = (int)(sum/10);
            temp.next = new ListNode(val);
            temp = temp.next;
            if(a!=null) a = a.next;
            if(b!=null) b = b.next;
        }
        if(carry!=0) temp.next = new ListNode(carry);
        return dummy.next;
        
    }
}