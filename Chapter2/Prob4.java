public class Prob4 {
	public static SinglyLinkedListNode partition( int part, SinglyLinkedListNode head ) {
		SinglyLinkedListNode firstLess = null;
		SinglyLinkedListNode lastLess = null;
		SinglyLinkedListNode firstGreater = null;
		SinglyLinkedListNode lastGreater = null;
		SinglyLinkedListNode current = head;
		while( current != null ) {
			if( current.value < part ) {
				System.out.println("Less:" +  current.value);
				if( lastLess == null ) {
					lastLess = current;
					firstLess = current;
				}
				else {
					lastLess.next = current;
					lastLess = current;
				}
			}
			else {
				System.out.println("Greater:" + current.value);
				if( lastGreater == null ) {
					lastGreater = current;
					firstGreater = current;
				}
				else {
					lastGreater.next = current;
					lastGreater = current;
				}
			}
			current = current.next;
		}
		lastLess.next = firstGreater;
		lastGreater.next = null;
		return firstLess;
	}
	
	public static void main( String[] args ) {
		SinglyLinkedListNode node1 = new SinglyLinkedListNode(1,null);
		SinglyLinkedListNode node2 = new SinglyLinkedListNode(2, node1);
		SinglyLinkedListNode node3 = new SinglyLinkedListNode(10, node2);
		SinglyLinkedListNode node4 = new SinglyLinkedListNode(5, node3);
		SinglyLinkedListNode node5 = new SinglyLinkedListNode(8, node4);
		SinglyLinkedListNode node6 = new SinglyLinkedListNode(5, node5);
		SinglyLinkedListNode node7 = new SinglyLinkedListNode(3, node6);
		SinglyLinkedListNode holder = node7;
		while(holder != null) {
			System.out.println(holder.value);
			holder = holder.next;
		}
		holder = partition(5,node7);
		System.out.println();
		while(holder != null) {
			System.out.println(holder.value);
			holder = holder.next;
		}
	}
}