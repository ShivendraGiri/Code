package Solution.java;
import java.io.;
import java.util.*;
public class List_link {
class Node{
	String data;
	Node next;
	
	Node(String data){
		this.data = data;
		this.next = null;
	}
	
 }
public void addFirst(String data) {
	Node newNode =  Node(data);
	if(head == null)
	{
		head= newNode;
		return ;
	}
	new Node.next = head;
	head = newNode;
}
   public  addLast(String data) {
	Node newNode =  Node(data);
	if(head == null)
	{
		head= newNode;
		return ;
	}
	Node currNode = head;
	while(currNode.next != null) {
		System.out.println(currNode.data + " ->");
		currNode = currNode.next;
	}
	System.out.print(NUL);
}
public static  void main(String args[]) {
	

	List_link list = new List_link();
	list.addFirst = new Link_list("a");
	list.addFirst("is");
	list.printList)();
	
	list.addLast("list");
	list.printList();
	
	list.addFirst("This");
	list.print.List();
}
}
	
	
}
