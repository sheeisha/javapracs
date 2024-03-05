package pracs1;

//to convert infix to postfix expression

import java.util.*;

public class infixtopostfix {
	
	static int Prec(char ch) {
		
		switch(ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '3':
			return 3;
			
		}
		return -1;
	}
	
	static String infixToPostfix(String exp) {
		
		//empty string for result
		String result = new String("");
		Stack<Character> stack=new Stack<Character>();
		//scan left to right
		for(int i=0; i<exp.length(); ++i) {
			
			char c=exp.charAt(i);
			//if char=operand,output
			if(Character.isLetterOrDigit(c))
				result +=c;
			//if char='(', push it to stack
			else if (c=='(')
				stack.push(c);
			else if(c==')')
			{
				while(!stack.isEmpty()&&stack.peek()!='(')
					result+=stack.pop();
				if(!stack.isEmpty()&&stack.peek()!='(')
					return "invalid"; //invalid expression
				else //we got '(' so pop and discard
					stack.pop();
			}
			else //operator encountered
			{
				while(!stack.isEmpty()&& Prec(c)<=Prec(stack.peek())) {
					if(stack.peek()=='(')
						return "invalid expression";
					result +=stack.pop();
				}
				stack.push(c);
			}
		}//end of for loop
		
		//pop all operators from stack
		while(!stack.isEmpty()) {
			if(stack.peek()=='(')
				return "invalid exp";
			result+=stack.pop();
		}//end while
		return result;
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String exp="";
		System.out.println("enter: ");
		exp=in.nextLine();
		System.out.println(infixToPostfix(exp));
	}
}
