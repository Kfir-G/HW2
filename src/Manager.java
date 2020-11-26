import java.util.*;
import java.lang.*;
import java.util.Scanner;
/**
 * This Class implements the state and behaviour of the Manager
 * @author Dr. Moshe Deutsch
 */
public class Manager
{
	private Queue<Integer> q;
	private Stack<Integer> st;

	//Initializing an array on definition.
	//This implicitly performs new on the array to allocate space for the array
	// and new for every String object whose reference is held within the 
	//corresponding array cell.
	private String [] menuOptions = {"1. Enqueue", "2. Dequeue", "3. Display Queue",
	                                 "4. Push", "5. Pop", "6. Display Stack", "7. Exit"};
	/**
	 * Manager no-argument constructor, initializes a new Stack object and a new
	 * Queue object.
	 */
	public Manager()
	{
		st = new Stack();
		q = new Queue();
		
		displayMenu();
	}

	/**
	 * displays and handles the user choices interactively.
	 */
	private void displayMenu()
	{
		Scanner sc = new Scanner(System.in);
		int input = 1;

		while(input != menuOptions.length)
		{
			System.out.println("Please Enter your choice:");

			//"For Each" Loop - see:
			//http://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
			for(String str : menuOptions)
				System.out.println(str);

			input = sc.nextInt();
			switch(input)
			{
			case 1:
				System.out.println("Please Enter a number:");
				q.enqueue(sc.nextInt());
				break;

			case 2:
				System.out.println("Dequeued: " + q.dequeue());
				break;

			case 3:
				System.out.println("Queue Contents:" + q);
				break;

			case 4:
				System.out.println("Please Enter a number:");
				st.push(sc.nextInt());
				break;

			case 5:
				System.out.println("Popped: " + st.pop());
				break;

			case 6:
				System.out.println("Stack Contents:" + st);
				break;

			case 7:
				break;

			default:
				System.out.println(input + " is an invalid choice! Please try again.");
			}
		}
	}
	
	/**
	 * static main method simply defines and initializes a new manager object.
	 * This would invoke its constructor, which then invokes the displayMenu
	 * to handle the user choices.
	 */
	public static void main(java.lang.String[] args)
	{
		Manager mngr = new Manager();
	}
}
	