import javax.swing.*;
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
     * @param intSt reference to the Stack of Integers
     */
    public DequeuePopHandler(Stack<Integer> intSt)
    {
        super(intSt);
    }

    /**
     * This method implements the abstract method "processRequest", inherited from GeneralHandler class. This method
     * Dequeue/Pop an item from the Queue/Stack respectively, and presents it on via showMessageDialog method of
     * JOptionPane. If the examined Queue/Stack is empty, issues an appropriate message to the user using
     * showInputDialog method of JOptionPane Java swing class (input dialog GUI). Likewise, ALL user messages are
     * performed via showMessageDialog method of JOptionPane Java swing class (message dialog GUI).
     */
    public void processRequest()
    {
        String action = (intQ == null ? "Pop":"Dequeue");
        String type = (intQ == null ? "Stack":"Queue");
        String mssg = String.format("Value %s from %s is: ", action, type);
        Integer add = (type == "Queue" ? intQ.dequeue():intSt.pop());

        if(add == null)
            JOptionPane.showMessageDialog(null,String.format("%s is Empty!!!",type));
        else
            JOptionPane.showMessageDialog(null,mssg+" " + add);
    }
}
