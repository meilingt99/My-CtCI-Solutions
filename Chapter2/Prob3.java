public class Prob3 {
	
	public static void deleteMiddle( SinglyLinkedListNode mid ) {
		mid.value = mid.next.value;
		mid.next = mid.next.next;
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
		deleteMiddle(node3);
		holder = node5;
		System.out.println("New List: ");
		while(holder != null) {
			System.out.println(holder.value);
			holder = holder.next;
		}
	}
}