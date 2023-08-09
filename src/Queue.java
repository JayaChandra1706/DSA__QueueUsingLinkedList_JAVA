import java.util.Scanner;
public class Queue {
	 private Scanner scan=new Scanner(System.in);
	    class Node{
	        int data;
	        Node link;
	        public Node(int data){
	             this.data=data;
	             this.link=null;
	        }
	    }
	Node first=null;        
	    public void insert(){
	        System.out.print("Enter Element to Insert:");
	        int ele=scan.nextInt();
	        Node newNode=new Node(ele);
	        System.out.println();
	        if(first==null){
	            first=newNode;
	            System.out.println("Insertion is Succesful");
	        }else {
	            newNode.link=first;
	            first=newNode;
	            System.out.println("Insertion is completed");
	        }
	    }
	    public void delete(){
	        Node temp=first;
	        if(first==null){
	            System.out.println("Deletion is not possible");
	        }else if(first.link==null){
	            System.out.println("Deleted Element is "+first.data);
	            first=null;
	        }else{
	            while(temp.link.link!=null){
	                temp=temp.link;
	            }
	            System.out.println("Element Deleted is "+temp.link.data);
	            temp.link=null;  
	        }  
	    }
	    public void display(){
	        Node temp=first;
	        while(temp != null){
	            System.out.println(temp.data);
	            temp=temp.link;
	        }
	    } 
}
