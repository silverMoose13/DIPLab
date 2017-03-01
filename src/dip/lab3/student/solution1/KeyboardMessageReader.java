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
public class KeyboardMessageReader implements MessageInput, RandomNumberGeneratorService {

    private Scanner keyboardUserInput;
    private ConsoleMessageWriter newMessage;
    //I want to figure out a way to use the array and matching index to the random
    //number generator instead of just hardcoding messages into the switch statement
    //that way works, but this is preferred over that if possible.
    private String[] messageArray = {"Enter in your favorite color: ", "Enter in a secret message: ",
        "Enter in the vehicle model you currently drive: ", "Are you a morning person or a night owl?: ",
        "Do you prefer to eat breakfast, lunch, or dinner?: "};

    public KeyboardMessageReader() {
        keyboardUserInput = new Scanner(System.in);
        newMessage = new ConsoleMessageWriter();
    }

    @Override
    public final int generateRandomNumber() {
        Random newRandomNumber = new Random();
        int number;

        number = newRandomNumber.nextInt(messageArray.length);
        return number;
    }

    //this method will take in keyboard input from the user
    @Override
    public final String readMessage() {
        int number = generateRandomNumber();

        switch (number) {
            case 0: 
                newMessage.writeMessage("Enter in your favorite color: ");
                break;
            case 1:
                newMessage.writeMessage("Enter in a secret message: ");
                break;
            case 2:
                newMessage.writeMessage("Enter in the vehicle model you currently drive: ");
                break;
            case 3:
                newMessage.writeMessage("Are you a morning person or a night owl?: ");
                break;
            case 4:
                newMessage.writeMessage("Do you prefer to eat breakfast, lunch, or dinner?: ");
                break;
            }
            return keyboardUserInput.nextLine();

                
        }

        /////////////side notes regarding the console message writer class/////////
        //output to console is not the job here in this class
        //so an object of the console message writer class was instantiated
        //would it be better to make a seperate printservices class
        //so that the responsibility doesn't get confused with that class? The only
        //supporting argument I have for not creating a seperate printservices class
        //is that the two print methods between the two classes would be the exact same and
        //take up needless memory due to the redundancy

}
