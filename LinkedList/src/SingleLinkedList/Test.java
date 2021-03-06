package SingleLinkedList;
public class Test {
  
	public static class Node {
		public int value;
		public Node next;
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
	
	// recursive solution
	static Node reverse(Node current, Node previous){   
	    if(current == null) {
    		return null;
    	}
    	if(current.next == null) {
    	 // You've reached the end, this is the new head
    		current.next = previous;
    		return current;
    	}
    	Node reverse = reverse(current.next, current);
    	current.next = previous;
    	return reverse;
	}
	
	// iterative solution
	static Node reverse_itr(Node node) {
		if(node == null) return null;
		Node current = node;
		Node next = node.next;
		current.next = null;
		while(next != null) {
			Node temp = next.next; 
			next.next = current; 
			current = next;
			next = temp;
		}
		return current;
	}
	
	//null <- 1 <- 2 <- 3

	public static void main(String[] args) {
		
		// Maintain pointer to first node
		Node first = new Node(0, null);
		Node current = first;
		int arr[]= {10,7,4,3,2,1};
		for(int i : arr) {
			Node temp = new Node(i, null);
			current.next = temp;
			current = temp;
			System.out.println(temp.value);
		}
		
		Node n = reverse_itr(first);
		System.out.println("reversed list:");
		while(n != null) {
			System.out.println(n.value);
			n = n.next;
			
		}
	}
}