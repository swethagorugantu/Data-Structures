
public class Node {
	Node left, right;
	int data;
	public Node(int data) {
		this.data=data;
	}

	public void insert(int value) {
		if(value<=data) {
			if(left==null) {
				left=new Node(value);
			}
			else {
				left.insert(value);
			}
		}
		else {
			if(right==null) {
				right=new Node(value);
			}
			
			else {
				right.insert(value);
			}
		}
	}
	
	public boolean contains(int value) {
		if (value==data) {
			return true;
		}
		
		else if (value<data) {
			if (left==null) {
				return false;
			}
			else {
				return left.contains(value);
			}
		}
		
		else {
			if(right==null) {
				return false;
			}
			else {
				return right.contains(value);
			}
		}
	}
	
	public void printInOrder() {
		if(left!=null) {
			left.printInOrder();//1
		}
		System.out.println(data);//2
		if(right!=null) {
			right.printInOrder();//3
		}
		
		//in-order 1 2 3
		//pre-order 2 1 3
		//post order 1 3 2
	}
}
