
public class LinkedListOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.prepend(0);
		list.print();
		list.deleteWithValue(0);
		list.print();
	}

}
