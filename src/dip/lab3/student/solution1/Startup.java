package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author Aaron Gnas
 */
//the purpose of this class is to test the capabilities of the 
//messenger application created. It acheives this by talking to the
//high level class MessengingSystem. This is to 
//make proper use of the principle of least knowledge
//this class has a plug and play aspect to it. I could add more specialized reader/writer
//classes through initialization and it won't break the program. No changes are necessary 
//either. Thus this program is portable
//I currently have two different ways to input and output as the specs require. In addition
//I have a third mode of input and output. That mode is
//for file reading and writing. As it stands this program currently does not function
//It instead throws null pointer exceptions. I believe I have narrowed the problem down
//to the fact that my generateMessage() method reads first and there is no value for a file.
//Unlike the other two forms of input and output I created, this one is a bit tricky because writing happens
//before reading so I will probably need to create a new method in the messenging system class
//to support this.
public class Startup {

    public static void main(String[] args) throws Exception {

        //instantiation of the gui reader and writer objects
        MessageInput newGuiMessageReader = new GuiMessageInput();
        MessageOutput newGuiMessageWriter = new GuiMessageOutput();

        MessagingService serviceOne = new MessagingService(newGuiMessageReader, newGuiMessageWriter);
        serviceOne.generateMessage();

        //instantiation of the keyboard reader and console writer objects
        MessageInput newKeyboardMessageReader = new KeyboardMessageInput();
        MessageOutput newConsoleMessageWriter = new ConsoleMessageOutput();

        MessagingService serviceTwo = new MessagingService(newKeyboardMessageReader, newConsoleMessageWriter);
        serviceTwo.generateMessage();

        //instantiation of the file writer and reader objects
//        MessageWriter newFileMessageWriter = new FileMessageWriter();
//        MessageReader newFileMessageReader = new FileMessageReader();
//        
//        MessagingService serviceThree = new MessagingService(newFileMessageReader, newFileMessageWriter);
//        serviceThree.generateMessage();




        //these lines below are not critical to the program. I just wanted the program
        //to close out in a more formalized way rather than just closing after outputting
        //the message
        ConsoleMessageOutput newMessage = new ConsoleMessageOutput();
        Scanner keyboard = new Scanner(System.in);

        newMessage.outputMessage("\nDid the message(es) you entered display properly? (Yes or No): ");
        String userConfirmationInput = keyboard.nextLine();

        if (userConfirmationInput.equalsIgnoreCase("Yes")) {
            newMessage.outputMessage("\nThe program worked successfully and will now close.\n");
        } else if (userConfirmationInput.equalsIgnoreCase("No")) {
            newMessage.outputMessage("\nThis program has some issues that need to be fixed.\n");
            newMessage.outputMessage("Notifying administrator...\n");
            newMessage.outputMessage("Complete. Thank you for your feedback!\n");
        } else {
            throw new IllegalArgumentException("Error: Improper format for response.");
        }
    }
}
