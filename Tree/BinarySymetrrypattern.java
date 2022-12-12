package Tree;
class Node{
	int data;
	Node left,right;
	
	Node(int data){
		this.data=data;
		left=right=null;
	}
}





public class BinarySymetrrypattern {
	
	Node root;
	
	boolean isMirror(Node node1,Node node2) {
		if(node1==null && node2==null) {
			return true;
		}
		if(node1 != null && node2!=null && node1.data== node2.data) {
			return (isMirror(node1.left,node2.right) && isMirror(node1.right,node2.left));
			
		}
		
		
		return false;
	}
	boolean isSymmetric() {
		return isMirror(root,root);
	}
	

	public static void main(String[] args) {
		BinarySymetrrypattern tree=new BinarySymetrrypattern();
         tree.root=new Node(1);
         tree.root.left=new Node(2);
         tree.root.right=new Node(2);
         tree.root.left.left=new Node(3);
         tree.root.right.right=new Node(3);
         tree.root.left.right=new Node(4);
         tree.root.right.left=new Node(4);
         
         boolean output=tree.isSymmetric();
         if(output==true) {
        	 System.out.println("tree is symetrric");
         }else {
        	 System.out.println("no symterry");
         }
         

	}

}
