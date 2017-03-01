package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aaron
 */
//the responsbility of this class it to take a gui message and output it
//using a show message dialog box

public class GuiMessageOutput implements MessageOutput{

    
    @Override
    public final void outputMessage(String message) {
        
        //this line is really just to show that the message displays properly on its own
        JOptionPane.showMessageDialog(null, message);
        
        //just adding a little fun into the mix here
        JOptionPane.showMessageDialog(null, message + " eh? Let's see if you are right...");
        
        if (message.equalsIgnoreCase("Tulips")) {
            JOptionPane.showMessageDialog(null, "Correct! Nice job!");
        }
        else {
            JOptionPane.showMessageDialog(null, "Incorrect...try again some other time!");
        }
    }
    
}
