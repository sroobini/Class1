
public class FindLeastBT {
	
	public  class Node{
		 int data;
		 Node left;
		 Node right;
		
		public Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	Node root;
	
	// Manually creating a binary tree//
		public void createTree(){
		Node l31 = new Node(4);
		l31.left = new Node(8);
		l31.right = new Node(9);
		
		Node l32 = new Node(5);
		l32.left = new Node(10);
		l32.right = new Node(11);
		
		Node l33 = new Node(6);
		l33.left = new Node(12);
		
		Node l34 = new Node(7);
		l34.left = new Node(13);
		l34.right = new Node(-9);
		
		Node l21 = new Node(2);
		l21.left = l31;
		l21.right = l32;
		
		Node l22 = new Node(3);
		l22.left = l33;
		l22.right = l34;
		
		root = new Node(1);
		root.left = l21;
		root.right = l22;
		
		}
		
		public Node findLeastElement(Node root1){
			Node min = root ;
			Node min1;
			Node min2;
			if(root1 == null || root1.left == null || root1.right == null)
				return root1;
			
			min1 = findLeastElement(root1.left);
			if( min1.data < min.data){
				min = min1;
			}
			min2 = findLeastElement(root1.right);
			if(min2.data < min.data){
				min = min2;
			}
			return min;
		}
		
		public static void main(String[] args){
			FindLeastBT myTree = new FindLeastBT();
			myTree.createTree();
			System.out.println(myTree.findLeastElement(myTree.root).data);
			
		}
	
}
