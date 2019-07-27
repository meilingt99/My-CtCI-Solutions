// Meiling Thompson
// CtCI Prob 2.2: Return Kth to Last

/** public class LinkedListNode {
	public int val;
	public LinkedListNode next;
	public LinkedListNode( int v, LinkedListNode n ) {
		val = v;
		next = n;
	}
} **/

/** Thought Process:
 * 	First element is called 1
 *  Kth from the end is length - k (if last element is element length)
 *  e.g. linked list of length 3, 1 from the end is element 2
 */
import java.util.*;
public class Prob2 {
	
	public static int findLength(SinglyLinkedListNode head) {
		if( head == null ) {
			return 0;
		}
		else {
			return 1 + findLength(head.next);
		}
	}
	
	public static int returnKth(SinglyLinkedListNode head, int k) {
		int listLength = findLength(head);
		SinglyLinkedListNode nodeHold = head;
		int count = 1;
		while(count < listLength - k) {
			count++;
			nodeHold = nodeHold.next;
		}
		return nodeHold.value;
	}
	
	public static void main( String[] args ) {
		SinglyLinkedListNode node1 = new SinglyLinkedListNode(3,null);
		SinglyLinkedListNode node2 = new SinglyLinkedListNode(4, node1);
		SinglyLinkedListNode node3 = new SinglyLinkedListNode(10, node2);
		SinglyLinkedListNode node4 = new SinglyLinkedListNode(2, node3);
		SinglyLinkedListNode node5 = new SinglyLinkedListNode(7, node4);
		int k1 = 3; //element returned should be 2
		int k2 = 0; //element returned should be 3
		int k3 = 4; //element returned should be 7
		SinglyLinkedListNode holder = node5;
		while(holder != null) {
			System.out.println(holder.value);
			holder = holder.next;
		}
		System.out.println(returnKth(node5,k1));
		System.out.println(returnKth(node5,k2));
		System.out.println(returnKth(node5,k3));
	}
}