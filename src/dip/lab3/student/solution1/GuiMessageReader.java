package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aaron
 */
//the responsibility of this class is to show a gui input dialog box prompting the
//user to enter a message
public class GuiMessageReader implements MessageReader{

    //below I have a riddle for the input dialog that pops up
    @Override
    public final String readMessage() {
        String message = JOptionPane.showInputDialog(null, "Solve the riddle:\n"
                + "What kind of " + "flower exists on your face?");
        return message;
    }
    
    
}
