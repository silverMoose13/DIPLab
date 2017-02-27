package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aaron
 */
public class GuiMessageWriter implements MessageWriter{

    @Override
    public void writeMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
}
