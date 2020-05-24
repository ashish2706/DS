package myjavaproject;

import java.io.*;
import java.util.*;

public class MergetwoList {

	public static class Node {
		Node next;
		int data;
	}

	public static class LinkList {

		Node head;
		Node tail;
		int size;

		public void addLast(int val) {

			Node tempnode = new Node();
			tempnode.data = val;
			tempnode.next = null;
			if (head == null) {
				head = tail = tempnode;
			} else {
				tail.next = tempnode;
				tail = tempnode;
			}
			this.size++;
		}

		public void traverse() {
			Node ptr = head;
			while (ptr != null) {

				if (ptr == tail)
					System.out.print(ptr.data + " --> " + null);

				else
					System.out.print(ptr.data + " -->" );

				ptr = ptr.next;
			}

		}

		public static LinkList mergeLinkList(LinkList list1, LinkList list2) {

			LinkList newList = new LinkList();

			Node ptr1 = list1.head;
			Node ptr2 = list2.head;

			while (ptr1 != null && ptr2 != null) {

				if (ptr1.data < ptr2.data) {
					newList.addLast(ptr1.data);
					ptr1 = ptr1.next;
				} else {
					newList.addLast(ptr2.data);
					ptr2 = ptr2.next;
				}

			}
			while (ptr1 != null) {
				newList.addLast(ptr1.data);
				ptr1 = ptr1.next;
			}

			while (ptr2 != null) {
				newList.addLast(ptr2.data);
				ptr2 = ptr2.next;
			}

			return newList;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		LinkList list1 = new LinkList();
		LinkList list2 = new LinkList();

		System.out.println("How many Integers in list1..");
		int n1 = s.nextInt();

		for (int i = 0; i < n1; i++) {
			list1.addLast(s.nextInt());
		}

		System.out.println("How many Integers in list2...");
		int n2 = s.nextInt();

		for (int i = 0; i < n2; i++) {
			list2.addLast(s.nextInt());
		}

		LinkList merged = LinkList.mergeLinkList(list1, list2);
		merged.traverse();
	}

}
