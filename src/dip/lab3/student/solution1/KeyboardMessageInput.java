package dip.lab3.student.solution1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Aaron
 */
//the responsibilty of this class is to provide the capability
//to intake input from the user using the keyboard
//It accomplishes this with the help of implementing two interfaces. The RNG interface
//creates a random number that will match up with the bank of statements. The other interface
//sends over the messageReader() method so that the message can be input/read.
public class KeyboardMessageInput implements MessageInput, RandomNumberGeneratorService {

    private Scanner keyboardUserInput;
    private ConsoleMessageOutput newMessage;

    public KeyboardMessageInput() {
        keyboardUserInput = new Scanner(System.in);
        newMessage = new ConsoleMessageOutput();
    }

    @Override
    public final int generateRandomNumber() {
        Random newRandomNumber = new Random();
        int number;

        number = newRandomNumber.nextInt(5);
        return number;
    }

    //this method will take in keyboard input from the user
    @Override
    public final String inputMessage() {
        int number = generateRandomNumber();

        switch (number) {
            case 0: 
                newMessage.outputMessage("Enter in your favorite color: ");
                break;
            case 1:
                newMessage.outputMessage("Enter in a secret message: ");
                break;
            case 2:
                newMessage.outputMessage("Enter in the vehicle model you currently drive: ");
                break;
            case 3:
                newMessage.outputMessage("Are you a morning person or a night owl?: ");
                break;
            case 4:
                newMessage.outputMessage("Do you prefer to eat breakfast, lunch, or dinner?: ");
                break;
            }
            return keyboardUserInput.nextLine();      
        }

}
