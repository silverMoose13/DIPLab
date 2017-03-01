package dip.lab3.student.solution1;

/**
 *
 * @author Aaron
 */
//the responsibility of this class is to output the user's message out to the
//console
public class ConsoleMessageOutput implements MessageOutput {

    @Override
    public final void outputMessage(String message) {
        if (message == null || message.isEmpty()) {
            throw new IllegalArgumentException("Error: message must not be empty or null.");
        } else {
            System.out.print(message);
        }
    }

}
