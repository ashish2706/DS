package myjavaproject;

import java.io.*;
import java.util.*;

import myjavaproject.MergetwoList.Node;

public class RemoveDuplicatefromSortedList {

	public static class Node {
		Node next;
		int data;
	}

	public static class LinkedList {

		Node tail;
		Node head;
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
					System.out.print(ptr.data + " -->");

				ptr = ptr.next;
			}
		}

		public void modifiedList() {
			
			Node ptr1 = head;// points to first node 
			Node ptr2 = head.next;// Initially, points to a node ahead
			
			while(ptr2!=null) {
				if(ptr1.data == ptr2.data) {
					ptr2 = ptr2.next;// if data of ptr1 matches with data of ptr2,
// simply move ptr2 forward					
				}
				else {
					ptr1.next = ptr2;
					ptr1 = ptr2;
					ptr2 =ptr2.next;
				}
				
			}
	// ki jb last me saari value match kre 
	// to us time ptr2 me null aa gya hoga to ptr1 pe present 
	// value ke next me null bhejna padega 		
			//ptr1.next = ptr2;
		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		LinkedList newlist = new LinkedList();
		
		while (true) {
			System.out.println();
			System.out.println("Enter Choice...");
			System.out.println("1. addlast" + " 2. traverse " + " 3. removeduplicate");

			int option = s.nextInt();

			switch (option) {

			case 1:
				System.out.println("Enter the value......");
				int val = s.nextInt();
				newlist.addLast(val);
				break;

			case 2:
				System.out.println("List Content..........");
				newlist.traverse();
				break;

			case 3:
				System.out.println("Modified List..........");
				newlist.modifiedList();
				newlist.traverse();
				break;

			default:
				System.out.println("Wrong choice!!!!");
			}

		}

	}

}
