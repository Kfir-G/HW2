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

    /**
     * This method implements the abstract method "processRequest", inherited from GeneralHandler class. This method
     * display the contents of the Queue/Stack respectively - present it on a GUI message dialog, using
     * showMessageDialog method of JOptionPane Java swing class. Get the contents of the Queue/Stack, simply by using
     * the corresponding toString method of Queue/Stack class (recall: they got it for free from DDLinkedList class.
     */
    public void processRequest()
    {
        JOptionPane.showMessageDialog(null,String.format("%s contents is: %s" ,(intQ!=null? "Queue": "Stack") ,(intQ!=null? intQ.toString():intSt.toString())));
    }
}
