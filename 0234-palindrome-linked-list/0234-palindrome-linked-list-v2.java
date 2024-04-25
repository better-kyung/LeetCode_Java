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
    public boolean isPalindrome(ListNode head) {
        ListNode node = head; //node에 head의 값을 복사하여 넣고
        Deque<Integer> deque = new LinkedList<>();

        while (node != null) { //deque에 node의 값들을 넣는다.
            deque.add(node.val);
            node = node.next;
        }

        while (!deque.isEmpty() && deque.size() > 1) { //deque가 비어있지 않고 1개 이상 있을 동안 while
            //deque의 양 끝을 추출
            if (deque.pollFirst() != deque.pollLast()) {
                return false;
            }
        }
        return true;
    }
}