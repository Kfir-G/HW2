/**
 * This Class implements the state and behaviour of basic doubly linked list infrastructure
 * @author Dr. Moshe Deutsch
 */
public class DDLinkedList
{
	private ListElement head, tail;
	
	/**
     * Add an element to the head of the list
     * @param val the integer value to be added to the head of the list
     */
	protected void addToHead(int val)
	{
		ListElement newElm = new ListElement(val, head);
		
		if(head != null)
			head.setPrev(newElm);
		else
			//If list was empty befor addition
			tail = newElm;
			
		head = newElm;
	}
	
	/**
     * Add an element to the tail of the list
     * @param val the integer value to be added to the tail of the list
     */
	protected void addToTail(int val)
	{
		ListElement newElm = new ListElement(val, null, tail);
		
		if(tail != null)
			tail.setNext(newElm);
		else
			//If list was empty befor addition
			head = newElm;
			
		tail = newElm;
	}
	
	/**
     * Removes an element from the head of the list
     * @return the value of the element removed, or -1 if the list is empty. 
     */
	protected int removeFromHead()
	{
		if(head == null)
			return -1;
		
		int ret = head.getVal();
		head = head.getNext();
		
		if(head == null)
			tail = head;
		else
			head.setPrev(null);
		
		return ret;
	}
	
	/**
     * Removes an element from the tail of the list
     * @return the value of the element removed, or -1 if the list is empty. 
     */
	protected int removeFromTail()
	{
		if(tail == null)
			return -1;
		
		int ret = tail.getVal();
		tail = tail.getPrev();
		
		if(tail == null)
			head = tail;
		else
			tail.setNext(null);
		
		return ret;
	}
	
	/**
     * Add an already allocated element to the list, before a given element. 
     * @param newElm the allocated element to be added to the list
     * @param beforeElm the existing element to add newElm before it.
     * If beforeElm == NULL, means add after tail
     */
	protected void addElm(ListElement newElm, ListElement beforeElm)
	{
		//Covering all Extreme cases first!
		
		//Case List is empty
		if(head == null && tail == null)
		{
			System.out.println("addElm::List is Empty!");
			return;
		}
		
		//Case the new element should be added before the head
		if (beforeElm == head)
		{
			newElm.setNext(head);
			head.setPrev(newElm);

			head = newElm;

			return;
		}
		
		//Case the new element should be added after the tail
		if (beforeElm == null)
		{
			tail.setNext(newElm);
			newElm.setPrev(tail);

			tail = newElm;

			return;
		}
		
		//General case - addind somewhere in the middle

		newElm.setNext(beforeElm);
		newElm.setPrev(beforeElm.getPrev());

		beforeElm.getPrev().setNext(newElm);
		
		beforeElm.setPrev(newElm);
	}
	
	/**
     * Display ALL the elements in the list. Notice the use of the reference to
     * tmp to the ListElement in the call to System.out.println. Since this call
     * expects a String argument, if it gets a reference object (rather than a
     * primitive type), it automatically invokes its "toString" method.
     */
	public void display()
	{
		ListElement tmp; 
		
		for(tmp = head; tmp != null; tmp = tmp.getNext())
			System.out.print(tmp + " ");
		
		//Moving the cursor to next line (println of empty String)
		System.out.println("");
	}
	
	/**
     * Indicates whether or not the list is empty.
     * @return true if the list is empty; otherwise, false. 
     */
	public boolean isEmpty()
	{
		return (head == null && tail == null);
	}
}
		
/**
 * This Class implements the state and behaviour of a list element to hold
 * an "int" data, but also the "prev" and "next" references. All the attributes
 * have "private" access modifiers - ListElement is an ADT! and it is accessed
 * only by its methods!
 * @author Dr. Moshe Deutsch
 */
class ListElement
{
	private int val;
	private ListElement next;
	private ListElement prev;
	
	/**
	 * ListElement no-argument constructor, initializes val data to 0 and 
	 * "next", "prev" references to null. 
	 */
	public ListElement()
	{
		this(0, null, null); //invokes constructor with 3 arguments
	}
	
	/**
	 * ListElement constructor
	 * @param val the value of to be held by the ListElement
	 */
	public ListElement(int val)
	{
		this(val, null, null); //invokes constructor with 3 arguments
	}
	
	/**
	 * ListElement constructor
	 * @param val the value of to be held by the ListElement
	 * @param next the reference to the elements next ListElement
	 */
	public ListElement(int val, ListElement next)
	{
		this(val, next, null);  //invokes constructor with 3 arguments
	}
	
	/**
	 * ListElement constructor
	 * @param val the value of to be held by the ListElement
	 * @param next the reference to the element's next ListElement
	 * @param prev the reference to the element's previous ListElement
	 */
	public ListElement(int val, ListElement next, ListElement prev)
	{
		this.val = val;
		this.next = next;
		this.prev = prev;
	}
	
	/**
	 * get method for the internal data value.
	 * @return the internal data value heald by this ListElement.
	 */
	public int getVal()
	{

		return val;
	}
	
	/**
	 * get method for the next ListElement reference.
	 * @return the reference to the next ListElement in the list.
	 */
	public ListElement getNext()
	{
		return next;
	}
	
	/**
	 * get method for the previous ListElement reference.
	 * @return the reference to the prev ListElement in the list.
	 */
	public ListElement getPrev()
	{
		return prev;
	}
	
	/**
	 * set method for the next ListElement reference.
	 * @param next the new reference to be updated as the next ListElement
	 * referenced from this element.
	 */
	public void setNext(ListElement next)
	{
		this.next = next;
	}
	
	/**
	 * set method for the prev ListElement reference.
	 * @param prev the new reference to be updated as the previous ListElement
	 * referenced from this element.
	 */
	public void setPrev(ListElement prev)
	{
		this.prev = prev;
	}
	
	/**
	 * Implementation of the toString method for this object. The toString
	 * method is defined as an empty method in Object class (the root of EVERY
	 * inheitance hierarchy in Java - see Java API documentation). Every class
	 * can override it to implement its specific conversion to String. 
	 * It is invoked automatically in context of String arguments or string
	 * operations (such as concatenation).
	 * @return the String representation of the internal integer value held by 
	 * this ListElement.
	 */
	public String toString()
	{
		return "" + val;
		//could also use the Integer Wrapper-Class, like so: 
		//Integer.toString(val);
	}
}