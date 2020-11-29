import javax.swing.*;
public class DisplayHandler extends GeneralHandler
{
    /**
     * DisplayHandler constructor, initializes a new DisplayHandler with a reference to a Queue of Integers
     * (the Stack reference will be initialized to null by default) - passed via the super constructor.
     * @param intQ reference to the Queue of Integers
     */
    public DisplayHandler(Queue<Integer> intQ)
    {
        super(intQ);
    }

    /**
     * DisplayHandler overloaded constructor, initializes a new DisplayHandler with a reference to a Stack of Integers
     * (the Queue reference will be initialized to null by default) - passed via the super constructor.
     * @param intSt  reference to the Stack of Integers
     */
    public DisplayHandler(Stack<Integer> intSt)
    {
        super(intSt);
    }


    public void processRequest()
    {

    }
}
