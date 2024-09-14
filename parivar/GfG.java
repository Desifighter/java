package parivar;
//{ Driver Code Starts
	import java.math.BigInteger;
import java.util.*;
import java.util.Formatter.BigDecimalLayoutForm;

	class StackNode {
		int data;
		StackNode next;
		StackNode(int a) {
			data = a;
			next = null;
		}
	}
	
	class GfG {
	
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while (t > 0) {
				MyStack obj = new MyStack();
				int Q = sc.nextInt();
				while (Q > 0) {
					int QueryType = 0;
					QueryType = sc.nextInt();
					if (QueryType == 1) {
						int a = sc.nextInt();
						obj.push(a);
					} else if (QueryType == 2) {
						System.out.print(obj.pop() + " ");
					}
					Q--;
				}
				System.out.println("");
				t--;
			}
		}
	}
	
	// } Driver Code Ends
	
	
	class MyStack 
	{
		// class StackNode {
		//     int data;
		//     StackNode next;
		//     StackNode(int a) {
		//         data = a;
		//         next = null;
		//     }
		// }   
		StackNode top = null;
		
		//Function to push an integer into the stack.
		void push(int a) 
		{
			// Add your code here
			StackNode newNode = new StackNode(a);
			if (top==null) {
				top = newNode;
				return;
			}

			StackNode currNode = top;
			while (currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next = newNode;
		}
		
		//Function to remove an item from top of the stack.
		int pop() 
		{
			// Add your code here
			if (top==null) {
				return -1;
			}

			StackNode currNode = top;
			while (currNode.next != null) {
				currNode = currNode.next;
			}
			//currNode.next = newNode;
			int temp = currNode.data;
			
			BigInteger j = new BigInteger("7");
			return temp;	
		}
	}
	