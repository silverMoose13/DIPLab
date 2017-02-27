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
//classes and it won't break the program. No changes are necessary. This program in essence
//is portable.
public class Startup {

    public static void main(String[] args) {

        //these come from the interfaces and can't have object instantition
        //remember this.
        //this Liskov Substitution Princile syntax still seems fuzzy to me on why it works
        
        //instantiation of the gui reader and writer objects
        MessageReader newGuiMessageReader = new GuiMessageReader();
        MessageWriter newGuiMessageWriter = new GuiMessageWriter();
        
        MessagingSystem newGuiMessage = new MessagingSystem(newGuiMessageReader, newGuiMessageWriter);
        
        //instantiation of the keyboard reader and console writer objects
        MessageReader newKeyboardMessageReader = new KeyboardMessageReader();
        MessageWriter newConsoleMessageWriter = new ConsoleMessageWriter();

        MessagingSystem newKeyboardToConsoleMessage = new MessagingSystem(newKeyboardMessageReader, newConsoleMessageWriter);
        
        
        newGuiMessage.generateMessage();
        newKeyboardToConsoleMessage.generateMessage();

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
