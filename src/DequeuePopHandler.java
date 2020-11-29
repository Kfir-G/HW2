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
    public void processRequest() //how to do it elegant? @omer?
    {
       if(intQ != null) //for Queue
       {
           if(intQ.isEmpty()) {
               JOptionPane.showMessageDialog(null, "Queue is Empty!!");
               return;  //EXIT
           }
           JOptionPane.showMessageDialog(null,"Value Dequeue from Queue is:"+intQ.dequeue());
       }
       else{    //for Stack
           if(intSt.isEmpty()) {
               JOptionPane.showMessageDialog(null, "Stack is Empty!!");
               return;  //EXIT
           }
           JOptionPane.showMessageDialog(null,"Value Pop from Stack is:"+intSt.pop());
       }
    }
}
