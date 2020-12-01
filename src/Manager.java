import javax.swing.*;
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
	private IntQueueStackHandler handlers [];

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
		st = new Stack<>();
		q = new Queue<>();
		initHandlers();
		displayMenu();
	}

	/**
	 * private method to init the handlers array and to allocate the
	 * corresponding menu object to each appropriate cell
	 */
	private void initHandlers(){
		handlers = new IntQueueStackHandler[menuOptions.length];

		handlers[0] = new EnqueuePushHandler(q);
		handlers[1] = new DequeuePopHandler(q);
		handlers[2] = new DisplayHandler(q);
		handlers[3] = new EnqueuePushHandler(st);
		handlers[4] = new DequeuePopHandler(st);
		handlers[5] = new DisplayHandler(st);
		handlers[6] = new ExitHandler();
	}



	/**
	 * displays and handles the user choices interactively.
	 * using the handlers array.
	 */
	private void displayMenu()
	{
		Scanner sc = new Scanner(System.in);
		int input = 1;

		while(true)
		{
			System.out.println("Please Enter your choice:");

			//"For Each" Loop - see:
			//http://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
			for(String str : menuOptions)
				System.out.println(str);

			input = sc.nextInt();
			if(input < 0 && input > 7)
				JOptionPane.showMessageDialog(null, input +"invalid choice please try again", "Massage",JOptionPane.ERROR_MESSAGE);
			else
				handlers[input-1].processRequest();
		}
	}
	
	/**
	 * static main method simply defines and initializes a new manager object.
	 * This would invoke its constructor, which then invokes the displayMenu
	 * to handle the user choices.
	 */
	public static void main (String[] args)
	{
		Manager manager = new Manager();
	}
}
	