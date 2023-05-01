/**
 * @author Evgenii Zhuravel created on 09.09.2022
 * @version 1.0
 */
public class PalindromeLinkedList {

    public static void main(String[] args) {
        ListNode second5 = new ListNode(1);
        ListNode second4 = new ListNode(2, second5);
        ListNode second3 = new ListNode(1, second4);
        ListNode second2 = new ListNode(2, second3);
        ListNode second = new ListNode(2, second2);
        ListNode head = new ListNode(1, second);
        System.out.println("Result false: " + isPalindrome(head));

        head = new ListNode(1, null);
        System.out.println("Result true: " + isPalindrome(head));

        ListNode fourth = new ListNode(1);
        ListNode third = new ListNode(2, fourth);
        second = new ListNode(2, third);
        head = new ListNode(1, second);
        System.out.println("Result true: " + isPalindrome(head));

        third = new ListNode(1);
        second = new ListNode(2, third);
        head = new ListNode(1, second);
        System.out.println("Result true: " + isPalindrome(head));
    }

    public static boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }

        ListNode middle = findMiddle(head);

        middle = reverseList(middle.next);

        while (middle != null) {
            if (head.val != middle.val) {
                return false;
            }

            head = head.next;
            middle = middle.next;
        }

        return true;
    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    private static ListNode findMiddle(ListNode head) {
        ListNode middle = head;
        ListNode forward = head;

        while (forward.next != null && forward.next.next != null) {
            middle = middle.next;
            forward = forward.next.next;
        }

        return middle;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
