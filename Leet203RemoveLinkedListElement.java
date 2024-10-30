
public class Leet203RemoveLinkedListElement {
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
    
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0, head); // Dummy node to simplify edge cases
        ListNode current = dummy; // Pointer to traverse the list

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next; // Skip the node
            } else {
                current = current.next; // Move to the next node
            }
        }
        return dummy.next; // Return the real head
    }

    public static void main(String[] args) {
        // Create a new LinkedList
        Leet203RemoveLinkedListElement leet = new Leet203RemoveLinkedListElement();
        ListNode node = leet.new ListNode();
        node.val = 5;
        node.next = leet.new ListNode(4);
        node.next.next = leet.new ListNode(3);
        node.next.next.next = leet.new ListNode(2);
        node.next.next.next.next = leet.new ListNode(1);
        ListNode  result = leet.removeElements(node, 3);

        while(result!=null){
            System.out.println(result.val);
            result= result.next;
        }

        int value = 3;

    }
}
