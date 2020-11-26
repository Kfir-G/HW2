/**
 * This Class implements the state and behaviour of Stack infrastructure.
 * It inherits from DDLinkedList class.
 * @author Dr. Moshe Deutsch
 */
public class Stack<T> extends DDLinkedList
{
	/**
     * push an element to the top of the Stack.
     * @param val the integer value to be added to the top of the Stack.
     */
	public void push(T val)
	{
		addToHead(val);
	}
	
	/**
     * pop an element from the top of the Stack.
     * @return the value of the element popped from the top of the Stack. If the
     * Stack is empty, returns -1.
     */
	public T pop()
	{
		if(isEmpty())
		{
			System.out.println("pop::Stack is Empty!");
			return null;
		}
		
		return removeFromHead();
	}
}