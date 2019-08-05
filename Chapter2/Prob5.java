import java.util.*;
public class Prob5 {
	
	public static SinglyLinkedListNode sumLists( SinglyLinkedListNode lst1, SinglyLinkedListNode lst2, int rem ) {
		if( lst1 == null ) {
			if( lst2 == null ) {
				return null;
			}
			else {
				if(lst2.value + rem > 9) {
					return new SinglyLinkedListNode((lst2.value + rem) % 10, new SinglyLinkedListNode(1,null));
				}
				else {
					return new SinglyLinkedListNode(lst2.value + rem, null);
				}
			}
		}
		else if( lst2 == null ) {
			if( lst1.value + rem > 9 ) {
				return new SinglyLinkedListNode((lst1.value + rem) % 10, new SinglyLinkedListNode(1,null));
			}
			else {
				return new SinglyLinkedListNode(lst1.value + rem, null);
			}
		}
		else {
			if( lst1.value + lst2.value + rem > 9 ) {
				return new SinglyLinkedListNode((lst1.value + lst2.value + rem) % 10, sumLists(lst1.next, lst2.next, 1));
			}
			else {
				return new SinglyLinkedListNode(lst1.value + lst2.value + rem, sumLists(lst1.next, lst2.next, 0));
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int len1 = in.nextInt();
		int len2 = in.nextInt();
		int counter = 1;
		SinglyLinkedListNode head1 = new SinglyLinkedListNode(in.nextInt(),null);
		SinglyLinkedListNode hd1 = head1;
		while( counter < len1 ) {
			head1.next = new SinglyLinkedListNode(in.nextInt(),null);
			head1 = head1.next;
			counter++;
		}
		SinglyLinkedListNode current = hd1;
		while(current != null) {
			System.out.print(current.value + " ");
			current = current.next;
		}
		System.out.println();
		counter = 1;
		SinglyLinkedListNode head2 = new SinglyLinkedListNode(in.nextInt(),null);
		SinglyLinkedListNode hd2 = head2;
		while( counter < len2 ) {
			head2.next = new SinglyLinkedListNode(in.nextInt(),null);
			head2 = head2.next;
			counter++;
		}
		current = hd2;
		while(current != null) {
			System.out.print(current.value + " ");
			current = current.next;
		}
		System.out.println();
		SinglyLinkedListNode newHead = sumLists(hd1,hd2,0);
		while(newHead != null) {
			System.out.println(newHead.value + " ");
			newHead = newHead.next;
		}
	}
}