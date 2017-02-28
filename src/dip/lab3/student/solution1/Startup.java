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

        //Interfaces cannot be instantiated so we need to use the LSP.
        //this Liskov Substitution Princile syntax still seems fuzzy to me on why
        //it is able to work however.
        
        //instantiation of the gui reader and writer objects
        MessageReader newGuiMessageReader = new GuiMessageReader();
        MessageWriter newGuiMessageWriter = new GuiMessageWriter();
        
        MessagingSystem newGuiMessage = new MessagingSystem(newGuiMessageReader, newGuiMessageWriter);
        
        //instantiation of the keyboard reader and console writer objects
        MessageReader newKeyboardMessageReader = new KeyboardMessageReader();
        MessageWriter newConsoleMessageWriter = new ConsoleMessageWriter();

        MessagingSystem newKeyboardToConsoleMessage = new MessagingSystem(newKeyboardMessageReader, newConsoleMessageWriter);
        
        //instantiation of the file writer and reader objects
//        MessageWriter newFileMessageWriter = new FileMessageWriter();
//        MessageReader newFileMessageReader = new FileMessageReader();
//        
//        MessagingSystem newFileMessage = new MessagingSystem(newFileMessageReader, newFileMessageWriter);

        newGuiMessage.generateMessage();
        newKeyboardToConsoleMessage.generateMessage();
//        newFileMessage.generateMessage();

        //these lines below are not critical to the program. I just wanted the program
        //to close out in a more formalized way rather than just closing after outputting
        //the message
        ConsoleMessageWriter newMessage = new ConsoleMessageWriter();
        Scanner keyboard = new Scanner(System.in);

        //think of a creative way to signal the success of the program and close it out
        newMessage.writeMessage("Did the message(es) you entered display properly? (Yes or No) ");
        String userConfirmationInput = keyboard.nextLine();
        
        
        if (userConfirmationInput.equalsIgnoreCase("Yes")) {
            newMessage.writeMessage("\nThe program worked successfully and will now close.\n");
        }
        else if (userConfirmationInput.equalsIgnoreCase("No")){
            newMessage.writeMessage("\nThis program has some issues that need to be fixed.\n");
            newMessage.writeMessage("Notifying administrator...\n");
            newMessage.writeMessage("Complete. Thank you for your feedback!\n");
        }
        else {
            throw new IllegalArgumentException("Error: Improper format for response.");
        }
    }
}
