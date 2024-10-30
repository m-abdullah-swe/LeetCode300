public class ListNode {
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
    
        public ListNode removeElements(ListNode head, int val) {
            ListNode temp = new ListNode();
            temp = head;
            while (head != null) {
                if (head.val == val) {
                    temp = head.next;
                } else {
                    temp.next = head.next;
                }
                head = head.next;
                temp.next = head;
            }
            return temp;
        }
    public static void main(String[] args) {
        // Create a new LinkedList
        ListNode node = new ListNode(5);
        node.next = new ListNode(4);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(2);
        node.next.next.next.next = new ListNode(1);
        node.removeElements(node,3);
        int val = 3;
        while (node != null){

            if (node.next != null && node.val== val){
                node.next = node.next.next;
                node = node.next;
                System.out.println("Rem: "+node.val);
            }else {
                System.out.println(node.val);
                node = node.next;
            }
            System.out.println(node.val);
        }
    }
}
