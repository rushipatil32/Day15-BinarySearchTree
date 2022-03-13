package com.blz.binarysearchtree;

public class BinarySearchTree {

	    Node root;
	    public static void main(String[] args) {
	        BinarySearchTree bst = new BinarySearchTree();
	        bst.insertion(56);
	        bst.insertion(30);
	        bst.insertion(70);
	        bst.displayBST(bst.root);
	    }

	    public void insertion(int data){
	        Node n = new Node();
	        n.data = data;
	        n.left = null;
	        n.right = null;

	        if(root == null){   //If tree is empty
	            root = n;
	        } else{
	            Node parent = root;
	            Node current = root;
	            while(current != null){  //Finding Parent Of Node n.
	                parent = current;
	                if(n.data > current.data){
	                    current = current.right;
	                }else{
	                    current = current.left;
	                }
	            }
	            if(n.data > parent.data){
	                parent.right = n;
	            }else{
	                parent.left = n;
	            }
	        }
	    }

	    public void displayBST(Node node) {
	        if (node.left != null) {
	            displayBST(node.left);
	        }
	        System.out.println(node.data);

	        if (node.right != null) {
	            displayBST(node.right);
	        }
	    }
}
