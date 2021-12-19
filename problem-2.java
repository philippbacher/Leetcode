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
        long n1 = getNumber(l1);
        long n2 = getNumber(l2);
        long result = n1 + n2;
        ListNode solution = new ListNode();
        ArrayList<Integer> digitList = new ArrayList<Integer>();
        while (result > 0) {
            digitList.add((int)(result % 10));
            result = result / 10;
        }

        ListNode next = solution;
        int idx = 0;
        for(int a : digitList){
            idx++;
            next.val = a;
            if(idx == digitList.size()) next.next = null;
            else {
                next.next = new ListNode();
                next = next.next;
            }
        }

        return solution;
    }

    public long getNumber(ListNode l1){
        String value = "";
        while(true){
            value = value + Integer.toString(l1.val);
            l1 = l1.next;
            if(l1 == null) break;
        }
        return  Long.parseLong(new StringBuilder(value).reverse().toString());
    }
}