
public class LinkedList {
	Node head;
	
	public void append(int data) {
		if(head==null) {
			head=new Node(data);
			return;
		}
		Node current=head; //starts off at the current node i.e head of linked list
		while(current.next != null) {
			current=current.next;//get to the end of linked list
		}
		
		current.next=new Node(data); //create the node
		
		
	}

	public void prepend(int data) {
		Node newHead=new Node(data);
		newHead.next=head;
		head=newHead;
	}
	
	public void deleteWithValue(int data) {
		if (head==null) return;
		
		if(head.data==data) {
			head=head.next;
			return;
		}
		Node current=head;
				while(current.next!=null) {
					if(current.next.data==data) {
						 current.next=current.next.next;
						 return;
					}
					
					current=current.next;
				}
	}
	
	public void print() {
		Node tmp=head;
		while(tmp!=null) {
			System.out.println(tmp.data);
			tmp=tmp.next;
		}
		//System.out.println("null");
	}
}
