import java.util.*;
public class Tree {
	Class Node{
		int val;
		Node right;
		Node left;
	}
private Node root;
Scanner sc=new Scanner(System.in);
public Tree() {
	this.root=createNode();
}
private Node createNode();{
	int item=sc.nextInt();
	Node nn=new Node();
	nn.val=item;
	
	System.out.println("Want left");
	boolean lf=sc.nextBoolean();
	if(lf)=nn.left=createNode();


	System.out.println("Want right");
	boolean rf=sc.nextBoolean();
	if(rf)=nn.right=createNode();
	
	return nn;
	
}
public void display() {
	display(root);
}
private display(Node temp) {
	if(temp==null) return;
	String s=""+temp.val;
	
	if(temp.left!=null) temp.left.val+"<--"+s;
	else .+"<--"+s;
	
	if(temp.right!=null) s+"-->"+temp.right.val;
	else s+"-->"+.;
	System.out.println(s);
	display(temp.left);
	display(temp.right);
}

	public static void main(String[] args) {
		Tree t=new Tree();
		
		t.display();
	}

}
