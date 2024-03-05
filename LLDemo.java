package pracs1;


import java.io.InputStream;
import java.util.*;
class LLNode {
	
	private int data;
	private LLNode next; //data type of next is LLNode
	
	public int getData() {
		return data; //getter
	}
	public void setData(int data) {
		this.data = data; //setter
	}
	public LLNode getNext() {
		return next;
	}
	public void setNext(LLNode next) {
		this.next = next;
	}
	
	public LLNode(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.next = null;		
	}	
	
}// end of node


class lldemo {
	
	static LLNode createLL(LLNode head, int data) { //head is start pointer here if its null we add data to it
		LLNode h = head;
		LLNode p =h;
		LLNode q = h;
		LLNode newNode = null;
		
		if(h==null) {
			h = new LLNode(data);
		}
		
		else {
			while(p!=null) {
				q=p;
				p=p.getNext();
			}
			
			newNode = new LLNode(data);
			q.setNext(newNode); // connect q's 'next' to newNode
		}
		
		return h;
	}
	
	
	
	static LLNode alterLL(LLNode head, int data, int pos) {
		LLNode h = head;
		LLNode p =h;
		LLNode q = h;
		LLNode newNode =new LLNode(data);
		
		if(pos==1) {
			newNode.setNext(h);
			return newNode;
		}
		for(int i=1; i<pos;i++) {
			p=p.getNext();
		}
		for(int j=1; j<pos-1; j++) {
			q=q.getNext();
		}
		newNode.setNext(p);
		q.setNext(newNode);
		
		
		
		return h;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("how many nodes you want ? ");
		int n = sc.nextInt();
		
		LLNode head = null;
		LLNode p= null;
		LLNode q = null;
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter the data : ");
			int data = sc.nextInt();
			LLNode x = createLL(head, data);
			if(i==0) {
				head = x;
				p =x;
				q=x;
			}
					
		}
		display(head);
		System.out.println("enter the new data: ");
		int nd=sc.nextInt();
		System.out.println("enter the new position: ");
		int np=sc.nextInt();
		LLNode ghg=alterLL(head,nd,np);
		display(ghg);
		System.out.println("enter the data after which: ");
		int dp=sc.nextInt();
		int pos=check(head,dp);
		System.out.println(pos);
		System.out.println("enter the data: ");
		int ddd=sc.nextInt();
		LLNode ghg=alterLL(head,ddd,pos+1);
		display(ghg);
		System.out.println("enter pos ");
		int pos=sc.nextInt();
		System.out.println("enter the new data: ");
		int nd=sc.nextInt();
		change(head,nd,pos);
		display(head);
		
	}
	
	static void display(LLNode head) {
		LLNode p=head;
		LLNode q = null;
		while(p!=null) {
			
			q=p; //one node behind p
			System.out.print("-->" + q.getData());
			p = p.getNext();
			}
	}
	static int check(LLNode head, int data) {
		LLNode p=head;
		LLNode q = null;
		int count=1;
		while(p!=null) {
			
			q=p; //one node behind p
			if(p.getData()==data) {
				return count;
			}
			p = p.getNext();
			count++;
			}
		return count;
	}
	static void change(LLNode head, int data, int pos) {
		LLNode p=head;
		LLNode q = null;
		for(int i=1; i<pos;i++) {
			p=p.getNext();
		}
		p.setData(data);
		
	}

}