public class DequeuePopHandler extends GeneralHandler
{
    /**
     * DequeuePopHandler constructor, initializes a new DequeuePopHandler with a reference to a Queue of Integers
     * (the Stack reference will be initialized to null by default) - passed via the super constructor.
     * @param intQ reference to the Queue of Integers
     */
    public DequeuePopHandler(Queue<Integer> intQ)
    {
        super(intQ);
    }

    /**
     * EnqueuePushHandler overloaded constructor, initializes a new EnqueuePushHandler with a reference to a Stack of
     * Integers (the Queue reference will be initialized to null by default) - passed via the super constructor.
     * @param intSk reference to the Stack of Integers
     */
    public DequeuePopHandler(Stack<Integer> intSk)
    {
        super(intSk);
    }

    public void processRequest()
    {

    }
}
