package driver;
import java.util.Scanner;
import java.util.Stack;

public class Q1MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//Take inputs.
		//Number of floors
		System.out.println("Enter the total number of floors in the building");
		int N = sc.nextInt();
		int[] order = new int[N];
		for(int i=0;i<N;i++) 
		{
			System.out.print("Enter the floor size given on day : ");
			System.out.println(i+1);
			order[i] = sc.nextInt();			
		}
		Stack<Integer> stk= new Stack<>();
		int expectedFloor = N;
		
		System.out.println("The order of construction is as follows");
		for(int i=0;i<N;i++) {
			
			if(order[i] == expectedFloor) // if expected floor arrives
			{
				System.out.print("Day:");
				System.out.println(i+1);
				System.out.print(order[i]);
				expectedFloor--;
				
				while(!stk.isEmpty() ) {
					if(stk.peek() == expectedFloor) // if top element in the stack is the expected floor, pop and print
					{
						System.out.print(" ");
						System.out.print(stk.pop());
						expectedFloor--;
					}
					else
					{
						break;
					}
					
				}
				System.out.println();
			}
			else //if expected floor does not arrive add floor to queue
			{
				stk.push(order[i]);
				System.out.print("Day:");
				System.out.println(i+1);
				System.out.println();
			}
		}
		
	}

}
