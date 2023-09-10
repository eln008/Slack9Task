package Package.Task1;

import Package.Task1.ListNode;

public class Main {
    public static void main(String[] args) {
        /*1*/
             ListNode listNode = new ListNode();

                List<Integer> list1 = new LinkedList<>();
                list1.add(1);
                list1.add(2);
                list1.add(4);

                List<Integer> list2 = new LinkedList<>();
                list2.add(1);
                list2.add(3);
                list2.add(4);

                List<Integer> result = listNode.mergeSortedLists(list1, list2);

                System.out.println(result);






            }
        }