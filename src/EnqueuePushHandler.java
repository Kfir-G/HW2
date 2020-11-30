import javax.swing.*;
import  java.awt.*;

public class EnqueuePushHandler extends GeneralHandler
{
    /**
     * EnqueuePushHandler constructor, initializes a new EnqueuePushHandler with a reference to a Queue of Integers
     * (the Stack reference will be initialized to null by default) - passed via the super constructor.
     * @param intQ reference to the Queue of Integers
     */
    public EnqueuePushHandler(Queue<Integer> intQ)
    {
        super(intQ);
    }

    /**
     * EnqueuePushHandler overloaded constructor, initializes a new EnqueuePushHandler with a reference to a Stack of
     * Integers (the Queue reference will be initialized to null by default) - passed via the super constructor.
     * @param intSt reference to the Stack of Integers
     */
    public EnqueuePushHandler(Stack<Integer> intSt)
    {
        super(intSt);
    }

    /**
     *This method implements the abstact method "processRequest", inherited from GeneralHandler class.
     * This method acquires input from the user via showInputDialog method of JOptionPane Java swing class
     * (input dialog GUI). validate the input and if valid puts it in the Queue/Stack respectively. ALL user messages
     * are performed via showMessageDialog method of JOptionPane Java swing class (message dialog GUI), and ALL inputs
     * are performed via showInputDialog method of JOptionPane Java swing class (input dialog GUI).
     */
    public void processRequest() {
        String action = (intQ == null ? "Push":"Enqueue");
        String type = (intQ == null ? "Stack":"Queue");
        String mssg = String.format("Please enter a number to %s the %s", action, type);
        String add = JOptionPane.showInputDialog(mssg);

        try{
            if(intQ == null)
                intSt.push(Integer.parseInt(add));
            else
                intQ.enqueue(Integer.parseInt(add));

            JOptionPane.showMessageDialog(null,""+action+" opertarion of "+add+" successfully complted");
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "" + add + " is Not numeric, opertarion aborted!");
        }
    }
}
