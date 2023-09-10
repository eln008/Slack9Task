package Package.Task1;

import java.util.LinkedList;
import java.util.List;

public class ListNode {
        public List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
            List<Integer> mergedList = new LinkedList<>();
            int i = 0;
            int j = 0;

            while (i < list1.size() && j < list2.size()) {
                if (list1.get(i) < list2.get(j)) {
                    mergedList.add(list1.get(i));
                    i++;
                } else {
                    mergedList.add(list2.get(j));
                    j++;
                }
            }

            while (i < list1.size()) {
                mergedList.add(list1.get(i));
                i++;
            }

            while (j < list2.size()) {
                mergedList.add(list2.get(j));
                j++;
            }

            return mergedList;
        }
}

