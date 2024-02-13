package LinkedListParam;

import static java.lang.System.*;

public class ListFunHouse {
    // this method will print the entire list on the screen
    public static void print(ListNode list) {
        while (list != null) {
            System.out.print(list.getValue() +" ");
            list = list.getNext();
        }
        System.out.println();
    }

    // this method will return the number of nodes present in list
    public static int nodeCount(ListNode list) {
        int count = 0;
        while (list != null) {
            count += 1;
            list = list.getNext();
        }
        return count;
    }

    // this method will create a new node with the same value as the first nodeand
    // add this
    // new node to the list. Once finished, the first node will occur twice.
    public static void doubleFirst(ListNode list) {

        list.setNext(new ListNode(list.getValue(), list.getNext()));

    }

    // this method will create a new node with the same value as the last node
    // andadd this
    // new node at the end. Once finished, the last node will occur twice.
    public static void doubleLast(ListNode list) {
        int lengthList = nodeCount(list);
        for (int i = 0; i < lengthList - 1; i++) {
            list = list.getNext();

        }
        list.setNext(new ListNode(list.getValue(), list.getNext()));

    }

    // method skipEveryOther will remove every other node
    public static void skipEveryOther(ListNode list) {
        list.setNext(null);
    }
//this method will set the value of every xth node in the list
    public static void setXthNode(ListNode list, int x, Comparable value) {
        int count = 1;

        while (list != null) {
            if (count != x) {
                list = list.getNext();
            } else {
                list.setValue(value);
                list = list.getNext();
            }
            count++;
        }
    }

    // this method will remove the xth node in the list
    public static void removeXthNode(ListNode list, int x) {
        int count = 1;
        ListNode curr = list;
        ListNode prev = null;

        while (curr.getNext() != null) {
            if (count % x == 0) {
                prev.setNext(curr.getNext());
            }

            prev = curr;
            curr = curr.getNext();
            count++;
        }

        curr = null;
    }
}