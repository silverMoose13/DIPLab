package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author Aaron
 */

//the responsibilty of this class is to provide the capability
//to intake input from the user using the keyboard

public class KeyboardMessageReader implements MessageReader {

    private Scanner keyboardUserInput;
    private ConsoleMessageWriter newMessage;

    public KeyboardMessageReader() {
        keyboardUserInput = new Scanner(System.in);
        newMessage = new ConsoleMessageWriter();
    }

    //this method will take in keyboard input from the user
    //make it fancy later. Just get it to work first.
    @Override
    public String readMessage() {
        //output to console is not the job here in this class
        //so an object of the console message writer class was instantiated
        
        /////would it be better to make a seperate printservices class
        /////so that the responsibility doesn't get confused? The only
        //supporting argument I have for not creating a seperate printservices class
        //is that the to print methods between the two classes would be the exact same and
        //take up needless memory
        newMessage.writeMessage("Please enter in a message: ");
        return keyboardUserInput.nextLine();
    }

}
