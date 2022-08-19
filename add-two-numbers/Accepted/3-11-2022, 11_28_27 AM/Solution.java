// https://leetcode.com/problems/add-two-numbers

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
    ListNode dummyHead = new ListNode(0);
    ListNode p = l1, q = l2, curr = dummyHead;
    int carry = 0;
    while (p != null || q != null) {
        int x = (p != null) ? p.val : 0;
        int y = (q != null) ? q.val : 0;
        int sum = carry + x + y;
        carry = sum / 10;
        curr.next = new ListNode(sum % 10);
        curr = curr.next;
        if (p != null) p = p.next;
        if (q != null) q = q.next;
    }
    if (carry > 0) {
        curr.next = new ListNode(carry);
    }
    return dummyHead.next;
}
        /*
        ArrayList<Integer> al1=new ArrayList<Integer>();
        ArrayList<Integer> al2=new ArrayList<Integer>();
        ArrayList<Integer> al=new ArrayList<Integer>();
        int max= (al1.size()>al2.size())?al1.size():al2.size();
        while(l1!=null){
            al1.add(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            al2.add(l2.val);
            l2=l2.next;
        }
        int carry=0;
        int z=max-1;
        int[] sol=new int[max];
        for(int i=0;i<max;i++){
            int k=0,a=0,b=0;
            if((al1.size()-i-1)>=0){
                a= (int)al1.get(al1.size()-i-1);    
            }
            System.out.println(al2.size()-i-1);
            if((al2.size()-i-1)>=0){
                b= (int)al2.get(al2.size()-i-1);    
            }
            carry= carry+a+b;
            if(carry>9){
                k= carry%10;
                carry= carry/10;
            }
            else{
                k= carry;
                carry=0;
            }
            sol[z]=k;
            z--;
        }

        ListNode ll= new ListNode(0);
        ListNode temp = ll;
        for(int w=max-1;w>=0;w--){
            ll.next= new ListNode(sol[w]);
            ll=ll.next;
        }
        return temp.next; 
        */
    }