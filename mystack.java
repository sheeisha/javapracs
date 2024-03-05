package pracs1;

//to create user defined stack Data Structure

import java.util.*;

public class mystack {
	private int maxsize;
	private long[] stackArray;
	private int top;
	
	public mystack(int s) {
		maxsize=s;
		stackArray=new long[maxsize];
		top=-1;
	}
	public void push(long j) {
		stackArray[++top]=j;
	}
	public long pop() {
		long y=stackArray[top];
		--top;
		return y;
	}
	public long peek() {
		return stackArray[top];
	}
	public boolean isEmpty() {
		return (top==-1);
	}
	public boolean isFull() {
		return (top==maxsize-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--demo--");
		Scanner in=new Scanner(System.in);
		System.out.println("enter the total elements of a stack: ");
		int max=in.nextInt();
		mystack st=new mystack(max);
		
		for(int i=0; i<max; i++) {
			System.out.println("enter element "+(i+1)+": ");
			long v=in.nextInt();
			st.push(v);
		}
		
		//get data from stack
		
		while (!st.isEmpty()) {
			long value=st.pop();
			System.out.println(value);
			System.out.println(" ");
		}
		System.out.println("");
	}

}
