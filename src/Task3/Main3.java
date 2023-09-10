package Task3;

public class Main3 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Исходный список: ");
        printList(head);

        int n = 2;

        RemoveNthNodeFromEnd solution = new RemoveNthNodeFromEnd();

        head = solution.removeNthFromEnd(head, n);

        System.out.print("Список после удаления " + n + "-го узла с конца: ");
        printList(head);
    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}

