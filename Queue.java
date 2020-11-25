/**
 * This Class implements the state and behaviour of Queue infrastructure.
 * It inherits from DDLinkedList class.
 * @author Dr. Moshe Deutsch
 */
public class Queue extends DDLinkedList
{
	/**
     * enqueue an element to the Back of the Queue.
     * @param val the integer value to be added to the Back of the Queue.
     */
	public void enqueue(int val)
	{
		addToTail(val);
	}
	
	/**
     * dequeue an element from the Front of the Queue.
     * @return the value of the element dequeued from the Front of the Queue. 
     * If the Queue is empty, returns -1.
     */
	public int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("dequeue::Queue is Empty!");
			return -1;
		}
		
		return removeFromHead();
	}
}