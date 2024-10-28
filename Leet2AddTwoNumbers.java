import org.w3c.dom.Node;

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Leet2AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String s1 = listToString(l1);
        String s2 = listToString(l2);
        int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
        System.err.println("S1 " + s1);
        System.err.println("S2 " + s2);
        System.err.println("Sum " + sum);
        return stringToList(sum + "");
    }

    String listToString(ListNode l) {
        StringBuilder sb = new StringBuilder();
        while (l != null) {
            sb.append(l.val);
            l = l.next;
        }
        sb.reverse();
        return sb.toString();
    }

    ListNode stringToList(String s) {
        // StringBuilder sb = new StringBuilder();
        // sb.append(s);
        // sb.reverse();
        System.err.println("String  :" + s);
        ListNode dummy = new ListNode();

        for (int i = s.length()-1; i > 0; i--) {
            dummy.next = new ListNode(s.charAt(i));
            
        }
        return dummy;
    }

    public static void main(String[] args) {
        Leet2AddTwoNumbers solution = new Leet2AddTwoNumbers();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        System.err.println(solution.addTwoNumbers(l1, l2).next.val);
        // }

    }
}