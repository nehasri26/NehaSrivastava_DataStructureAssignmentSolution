package driver;
import service.Node;
import service.Tree;

public class Q2MainClass {

	public static void main(String[] args) {

		//Create a tree
		Tree tree = new Tree();
		tree.rootNode = new Node(50);
		tree.rootNode.left = new Node(30);
		tree.rootNode.right = new Node(60);
		tree.rootNode.left.left = new Node(10);
		tree.rootNode.right.left= new Node(55);

		//Convert a BTS to skewed tree by doing in order traversal.
		tree.convertBTSToSkewedTree(tree.rootNode);
	}

}
