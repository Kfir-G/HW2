import javax.swing.*;

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
     *
     */
    public void processRequest()
    {
        JFrame errorMssgBox = new JFrame();
        String inputMassg = "Please enter a number to ", errorInputMassg = "is Not numaric, operation aborted!";
        int inputNum=-1; //default val

        while(true){
        try {
            if (intQ != null)
                inputNum = (Integer.parseInt(JOptionPane.showInputDialog(inputMassg + "Enqueue the Queue")));
            else
                inputNum = (Integer.parseInt(JOptionPane.showInputDialog(inputMassg + "Push the Stack")));
        }
        catch (NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(errorMssgBox,inputNum +" " +errorInputMassg);
        } break;}
    }
}
