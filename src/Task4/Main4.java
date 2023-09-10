package Task4;

public class Main4 {
    public static void main(String[] args) {
                ListNode head1 = new ListNode(1);
                head1.next = new ListNode(2);
                head1.next.next = new ListNode(3);
                head1.next.next.next = new ListNode(3);
                head1.next.next.next.next = new ListNode(4);
                head1.next.next.next.next.next = new ListNode(4);
                head1.next.next.next.next.next.next = new ListNode(5);

                System.out.print("Исходный список: ");
                printList(head1);

                ListNode solution = new ListNode();

                head1 = solution.deleteDuplicates(head1);

                System.out.print("Список после удаления дубликатов: ");
                printList(head1);
            }

            private static void printList(ListNode head) {
                while (head != null) {
                    System.out.print(head.val + " ");
                    head = head.next;
                }
                System.out.println();
            }
}
