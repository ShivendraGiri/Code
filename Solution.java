package Solution.java;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

  class Node{
	
	int n; 
	Node left;
	Node right;
	 Node (int n)
	{
	this.n=n;
	this.left = null;
	this.right = null;
	
	}
	public class Solution
	{
		static void inOrder(Node root)
		{
			if(root == null)
				return ;
			inOrder(root.left);
			System.out.print(root.n+" ");
			inOrder(root.right);
		}
		static Node insert(Node root , int i, int arr[] , int n)
		{
		if(i<n)
		{
			root=new Node(arr[i]);
			root.left=insert(root.left,2*i+1,arr,n);
			root.right = insert(root.right,2*i+2,arr,n);
		}
		return root;
		}
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Node root = null;
			root = insert(root,0,arr,n);
			inOrder(root);
			
		}
	}
  }


