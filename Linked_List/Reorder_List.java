package TT2.Linked_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}


public class Reorder_List {
    public static void reorderList(ListNode head) {
        ListNode temp = head;
        ListNode preR = head;
        ArrayList<Integer> NA = new ArrayList();
        while (preR != null) {
            NA.add(preR.val);
            preR = preR.next;
        }
        System.out.println(NA);
        int n = NA.size();
        int j = 0;
        for (int i = 1; i <= NA.size(); i++) {
            if (i % 2 != 0) {
                temp.val = NA.get(j);
                j++;
                temp = temp.next;
            } else {
                temp.val = NA.get(n - 1);
                n--;
                temp = temp.next;
            }
        }
        while (head != null) {
            System.out.print(head.val);
            head = head.next;
        }
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
//        class Solution {
//            public void reorderList(ListNode head) {
//                //Find the middle node
//                ListNode slow = head, fast = head, prev = null;
//                while(fast!=null && fast.next!=null){
//                    slow = slow.next;
//                    fast = fast.next.next;
//                }
//
//                //Reverse the 2nd Half of List, make it a separate list
//                ListNode curr = slow.next;
//                slow.next = null;
//                while(curr!=null){
//                    ListNode nextNode = curr.next;
//                    curr.next = prev;
//                    prev = curr;
//                    curr = nextNode;
//                }
//
//                //Merging two Linked Lists
//                ListNode curr1 = head;
//                ListNode curr2 = prev;
//                while(curr1!=null && curr2!=null){
//                    ListNode next1 = curr1.next;
//                    ListNode next2 = curr2.next;
//
//                    curr1.next = curr2;
//                    curr2.next = next1;
//
//                    curr1 = next1;
//                    curr2 = next2;
//                }
//            }
//        }
    }


    public static void main(String[] args) {
        ListNode obj = new ListNode(1);
        obj.next = new ListNode(2);
        obj.next.next = new ListNode(3);
        obj.next.next.next = new ListNode(4);
//        obj.next.next.next.next = new ListNode(5);
        ListNode head = obj;

        while (obj != null) {
            System.out.print(obj.val + " ");
            obj = obj.next;
        }

        reorderList(head);

    }
}
