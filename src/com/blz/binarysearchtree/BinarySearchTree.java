package com.blz.binarysearchtree;

public class BinarySearchTree {
	 Node root;
	    public static void main(String[] args) {
	    	BinarySearchTree  bst = new BinarySearchTree();
	        int[] nodeData = {56, 30, 70, 22, 40, 11, 3, 16, 60, 95, 65, 63, 67};
	        for (int data : nodeData) {
	            bst.insertion(data);
	        }
	        bst.displayBST(bst.root);
	        bst.search(bst.root,63);
	    }

	    public void insertion(int data){
	        Node n = new Node();
	        n.data = data;
	        n.left = null;
	        n.right = null;

	        if(root == null){
	            root = n;
	        } else{
	            Node parent = root;
	            Node current = root;
	            while(current != null){
	                parent = current;
	                if(n.data>current.data){
	                    current = current.right;
	                }else{
	                    current = current.left;
	                }
	            }
	            if(n.data> parent.data){
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

	    public void search(Node node, int data) {
	        if (node.data == data)
	            System.out.println(data + " present");
	        else if (node.data < data && node.right != null)
	            search(node.right, data);
	        else if (node.data > data && node.left != null)
	            search(node.left, data);
	        else
	            System.out.println(data + " not present");
	    }
}	    