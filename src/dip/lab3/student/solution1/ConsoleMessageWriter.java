package dip.lab3.student.solution1;

/**
 *
 * @author Aaron
 */

//the responsibility of this class is to output the user's message out to the
//console
public class ConsoleMessageWriter implements MessageWriter{

    //keep it simple now. make it fancy later. Going for functionality.
    @Override
    public void writeMessage(String message) {
        System.out.print(message);
    }
    
    
    
}
