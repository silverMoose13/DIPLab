package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aaron
 */
//the responsbility of this class it to take a gui message and output it
//using a show message dialog box

public class GuiMessageWriter implements MessageWriter{

    @Override
    public final void writeMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
}
