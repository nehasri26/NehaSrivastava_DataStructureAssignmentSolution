package service;


public class Tree {
	public Node rootNode;
	
	public void convertBTSToSkewedTree(Node root) 
	{
		if (root == null)return;
		else 
		{
			convertBTSToSkewedTree(root.left);
			System.out.print(root.data + " ");
			convertBTSToSkewedTree(root.right);
		}
	}
}
