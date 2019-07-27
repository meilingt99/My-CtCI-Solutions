import java.util.Set;

// Meiling Thompson
// CtCI Prob 2.1: Remove Dubs

/** public class LinkedListNode {
	public int val;
	public LinkedListNode next;
	public LinkedListNode( int v, LinkedListNode n ) {
		val = v;
		next = n;
	}
} **/

/** Thought Process:
 * Possible cases: repeated elements are next to each other, repeated element is at the end, 
 */
import java.util.*;
public class Prob1 {
	
	public static SinglyLinkedListNode removeDups(SinglyLinkedListNode head) {
		Set<Integer> values = new HashSet<Integer>();
		SinglyLinkedListNode hold = head;
		values.add(head.value);
		while(hold != null && hold.next != null) {
			if(values.contains((hold.next).value)) {
				hold.next = (hold.next).next;
				hold = hold.next;
			}
			else {
				values.add((hold.next).value);
				hold = hold.next;
			}
		}
		return head;
	}
	
	public static void main( String[] args ) {
		SinglyLinkedListNode node1 = new SinglyLinkedListNode(3,null);
		SinglyLinkedListNode node2 = new SinglyLinkedListNode(4, node1);
		SinglyLinkedListNode node3 = new SinglyLinkedListNode(10, node2);
		SinglyLinkedListNode node4 = new SinglyLinkedListNode(4, node3);
		SinglyLinkedListNode node5 = new SinglyLinkedListNode(4, node4);
		SinglyLinkedListNode holder = node5;
		while(holder != null) {
			System.out.println(holder.value);
			holder = holder.next;
		}
		holder = removeDups(node4);
		System.out.println();
		while(holder != null) {
			System.out.println(holder.value);
			holder = holder.next;
		}
	}
}