/**
 * This Class implements the state and behaviour of Queue infrastructure.
 * It inherits from DDLinkedList class.
 */
public class Queue <T> extends DDLinkedList <T>
{
	/**
     * enqueue an element to the Back of the Queue.
     * @param val the T value to be added to the Back of the Queue.
     */
	public void enqueue(T val)
	{
		addToTail(val);
	}
	
	/**
     * dequeue an element from the Front of the Queue.
     * @return the value of the element dequeued from the Front of the Queue. 
     * If the Queue is empty, returns null.
     */
	public T dequeue()
	{
		if(isEmpty())
		{
			System.out.println("dequeue::Queue is Empty!");
			return null;
		}
		
		return removeFromHead();
	}
}