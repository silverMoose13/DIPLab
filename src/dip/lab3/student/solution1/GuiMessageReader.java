package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aaron
 */
public class GuiMessageReader implements MessageReader{

    //check out the textbook for some cool validation and error boxes that prompt
    //to try again and are you sure boxes
    @Override
    public String readMessage() {
        String message = JOptionPane.showInputDialog(null, "Please enter in a message: ");
        return message;
    }
    
    
}
