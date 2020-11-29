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
        int inputNum =-1;

        try {
            inputNum = (Integer.parseInt(JOptionPane.showInputDialog("Please enter a number to " + "%s", (intQ != null ? "Enqueue the Queue" : "Push the Stack"))));
        }
        catch (NullPointerException exN) {
            return; //EXIT- user push Cancel
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, inputNum + " " + "is Not numaric, operation aborted!");
        }

        if(intQ !=null)
            intQ.enqueue(inputNum);
        else
            intSt.push(inputNum);

        JOptionPane.showInputDialog("%s operation of "+inputNum+"successfully!",(intQ!=null ? "Enqueue":"Push"));
    }
}
