package myjavaproject;

import java.util.*;
import java.io.*;

public class Introduction_01 {

// Node class:- for making a node having two property, data to store value of the node and next to store the reference to next node..
	public static class Node {
		int data;
		Node next;
	}

// we will make a class LinkList, it will contain all the data members and the function which linked list perform
	
	public static class LinkList {

		Node head;  // head keeps track of the very first node of list
		Node tail;  // tail keeps track of the last node of list
		int size;   // size is for the length of list

// to add at first position..............................................................
// working in a constant time ..........................................................
		void addFirst(int val) {

			Node tempnode = new Node();
			tempnode.data = val;
			tempnode.next = null;

			if (this.head == null) {
				this.head = this.tail = tempnode;
			}

			else {

				tempnode.next = head;
				head = tempnode;
			}

			this.size++;
		}

// to add at last position......................................................
// if we do not use tail as a property in node, complexity of this function would have been order of order of (N), where N be the size of list 	

		void addLast(int val) {

			Node tempnode = new Node();
			tempnode.data = val;
			tempnode.next = null;

			if (this.head == null) {
				this.head = this.tail = tempnode;
			}

			else {
				this.tail.next = tempnode;
				this.tail = tempnode;
			}

			this.size++;
		}

// to add at any location..........................................................
// this function in worst case might take order of (N) time		
		void addAnyLoc(int val, int idx) {
			if (idx < 0 || idx > this.size) {
				System.out.println("Index is not valid");
				return;
			}
			Node tempnode = new Node();
			tempnode.data = val;
			tempnode.next = null;

			if (idx == 0) {
				tempnode.next = this.head;
				head = tempnode;
			} else if (idx == size) {
				this.tail.next = tempnode;
				this.tail = tempnode;
			} else {
				Node ptr = head;
				int i = 0;
				while (i < idx - 1) {
					ptr = ptr.next;
					i++;
				}
				tempnode.next = ptr.next;
				ptr.next = tempnode;
			}
			this.size++;
		}

// to delete form first location.................................................
		void deleteFirst() {
			if (this.head == null) {
				System.out.println("Nothing to delete!!!");
				return;
			} else {
				System.out.println("Deleted element is -->" + this.head.data + " from index = " + "0");
				this.head = head.next;
				this.size--;
			}
		}

// to delete from last location..................................................
		void deleteLast() {

			if (this.head == null) {
				System.out.println("Nothing to delete!!!");
				return;
			}
			Node ptr = head;

			while (ptr.next != this.tail) {
				ptr = ptr.next;
			}
			System.out.println("Deleted Element is -- >" + ptr.next.data + " from last");
			ptr.next = null;
			this.tail = ptr;

			this.size--;
		}

// to delete from any location...................................................
		void deleteAnyLoc(int idx) {

			if (idx < 0 || idx >= size) {
				System.out.println("Wrong Index!!!");
				return;
			}

			else if (this.head == null) {
				System.out.println("Nothing to delete!!!!");
			}

			else if (idx == 0) {
				System.out.println("Deleted Element is --> " + this.head.data + " from index = " + idx);
				this.head = this.head.next;
				this.size--;
			} else {
				Node ptr = head;
				int i = 0;
				while (i <= idx - 2) {
					ptr = ptr.next;
					i++;
				}
				System.out.println("Deleted Element is -- >" + ptr.next.data + " from index = " + idx);
				ptr.next = ptr.next.next;
				this.size--;

			}
		}

// to traverse the list................................................................................
		void traverse() {

			if (head == null)
				return;

			Node ptr = head;
			while (ptr != null) {
				if (ptr != tail)
					System.out.print(ptr.data + " --> ");

				else
					System.out.println(ptr.data + " --> " + null);
				ptr = ptr.next;
			}
			System.out.println();
		}

// to get the size of list..........................................................
		int getsize() {
			return this.size;
		}

// to search a given element in list........................Recursive...................... 
		void searchRecursive(Node ptr, int val) {

			if (head == null) {
				System.out.println("List is Empty!!!!!");
				return;
			}
			if (ptr == null) {
				System.out.println("Element not found " + val);
				return;
			}

			if (ptr.data == val) {
				System.out.println("Element found " + ptr.data);
				return;
			}

			searchRecursive(ptr.next, val);
		}

// to search a given element in list ...........................Iterative...........
		void searchIterative(int val) {

			if (head == null) {
				System.out.println("List is Empty!!!");
				return;
			}
			Node ptr = head;
			while (ptr != null) {
				if (ptr.data == val) {
					System.out.println("Element found " + ptr.data);
					return;
				}

				ptr = ptr.next;
			}
			System.out.println("Not Found " + val);
		}

// to get the middle of list ...................................................
		int middle() {

			Node ptr1 = head;
			Node ptr2 = head;

			if (head == null) {
				return -1;
			}

			else if (head != null) {
				while (ptr2.next != null && ptr2.next.next != null) {
					ptr2 = ptr2.next.next;
					ptr1 = ptr1.next;
				}
			}

			return ptr1.data;
		}

// to get Nth node from last...........................................................
		int getNthfromlast(int nth) {
			Node ptr1 = head;
			Node ptr2 = head;

			int count = 0;
			if (nth > size) {
				return -1;
			}

			if (head != null) {
				while (count < nth) {

//					if (ptr2 == null) {
//						return -1;
//					}
					ptr2 = ptr2.next;
					count++;
				}
				while (ptr2 != null) {
					ptr1 = ptr1.next;
					ptr2 = ptr2.next;
				}
			}
			return ptr1.data;
		}

// to reverse the LinkList........ 3 pointers approach.............................
		void reverse() {

			if (size <= 1) {
				return;
			}

			Node prev = null;
			Node current = head;
			tail = head;
			Node nextnode = head;

			while (current != null) {
				nextnode = current.next;
				current.next = prev;
				prev = current;
				current = nextnode;
			}
			head = prev;
		}

// get the data at given index of list...........................................
		int getdataAtindex(int index) {

			if (head == null)
				return 0;

			else if (index < 0 || index >= size) {
				System.out.println("Invalid index!!!!!");
				return -1;
			}

			else {
				Node ptr = head;
				for (int i = 0; i < index; i++) {
					ptr = ptr.next;
				}

				return ptr.data;
			}
		}

// get the node at given index of list..............................................
		Node getnodeAt(int pos) {
			Node ptr = head;
			for (int i = 0; i < pos; i++) {
				ptr = ptr.next;
			}
			return ptr;
		}

// reverse list without touching the link between two nodes, i.e, reverse using data ...........................................
// like we reverse the array, same we do here, using getNodeAt(idx) function...
		
		void reverseData() {

			int left = 0;
			int right = size - 1;

			while (left <= right) {

				Node temp1 = getnodeAt(left);
				Node temp2 = getnodeAt(right);

				int temp = temp1.data;
				temp1.data = temp2.data;
				temp2.data = temp;

				left++;
				right--;
			}
		}

	}

// main function......................................................................
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
// we make an object of LinkList class, which will have all the data members of LinkList class and all its functions
		LinkList temp = new LinkList();

		System.out.println("Enter your choice");
		System.out.println(" 1. addFirst" + " 2. addLast" + " 3. addAnyLoc" + " 4 . deleteFirst" + " 5 .deleteLast"
				+ " 6. deleteAnyloc" + " 7 . Traverse" + " 8 . SizeofList" + " 9. Search Recursive"
				+ " 10. Search Iterative" + " 11. Middle_of_List " + " 12. Nth node from last "
				+ " 13. Reverse_Using_Link " + "14. Get_Node_At_Index " + "15. Reverse_Using_Data ");

		while (true) {
			int option = s.nextInt();

			switch (option) {

			case 1:
				System.out.println("Enter the value");
				int val1 = s.nextInt();
				temp.addFirst(val1);
				break;

			case 2:
				System.out.println("Enter the value");
				int val2 = s.nextInt();
				temp.addLast(val2);
				break;
					
			case 3:
				System.out.println("Enter the value");
				int val3 = s.nextInt();
				System.out.println("Enter the index");
				int idx = s.nextInt();
				temp.addAnyLoc(val3, idx);
				break;

			case 4:
				temp.deleteFirst();
				break;

			case 5:
				temp.deleteLast();
				break;
					
			case 6:
				System.out.println("Enter the index from where to delete");
				int idx1 = s.nextInt();
				temp.deleteAnyLoc(idx1);
				break;

			case 7:
				temp.traverse();
				break;
					
			case 8:
				System.out.println(temp.getsize());
				break;

			case 9:
				System.out.println("Enter the element to search...");
				int value = s.nextInt();
				temp.searchRecursive(temp.head, value);
				break;

			case 10:
				System.out.println("Enter the element to search...");
				int value1 = s.nextInt();
				temp.searchIterative(value1);
				break;

			case 11:
				int mid = temp.middle();
				if (mid != -1)
					System.out.println("Middle is == " + mid);
				else
					System.out.println("List is Empty");
				break;

			case 12:
				System.out.println("Enter which node from last!!!");
				int nth = s.nextInt();
				System.out.println(temp.getNthfromlast(nth));
				break;

			case 13:
				System.out.println("Original Link List is:-----");
				temp.traverse();
				System.out.println("Reversed Link List is:-----");
				temp.reverse();
				temp.traverse();
				break;

			case 14:
				System.out.println("Get node of which index!!!");
				int index = s.nextInt();
				System.out.println(temp.getdataAtindex(index));
				break;

			case 15:
				System.out.println("Original Link List is:-----");
				temp.traverse();
				System.out.println("Reversed Link List is:-----");
				temp.reverseData();
				temp.traverse();
				break;

			default:
				System.out.println("Entered wrong value.. Try again!!!");
			}

		}
 
	}

}
