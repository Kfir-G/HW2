public abstract class GeneralHandler implements IntQueueStackHandler
{
    protected Queue<Integer> intQ;
    protected Stack<Integer> intSt;

    /**
     * GeneralHandler constructor, initializes a new GeneralHandler with a reference to a Queue of Integers
     * @param intQ the integer value to be added to the Back of the Queue
     */
    public GeneralHandler(Queue<Integer> intQ)
    {
        this. intQ = intQ;
    }

    /**
     *overloaded constructor, initializes a new GeneralHandler with a reference to a Stack of Integers
     * @param intSt the int value to be added to the top of the Stack.
     */
    public GeneralHandler(Stack<Integer> intSt)
    {
        this.intSt = intSt;
    }

    public  abstract void processRequest();
}
