package dip.lab3.student.solution1;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Aaron
 */

//this class demonstrates the ability of writing messages to a file.
public class FileMessageWriter implements MessageWriter{

    private String fileName;
    private String userInput;
    private ConsoleMessageWriter newMessage;
    private Scanner keyboard;
    
    public FileMessageWriter(String fileName) {
        this.fileName = fileName;
        newMessage = new ConsoleMessageWriter();
        keyboard = new Scanner(System.in);
    }
    
    //new default constructor so to give the user a chance to enter a filename
    public FileMessageWriter() {}

    public final String getFileName() {
        return fileName;
    }

    public final void setFileName(String fileName) {
        //set validation to contain ".txt"
        this.fileName = fileName;
    }

    public final String getUserInput() {
        return userInput;
    }

    public final void setUserInput(String userInput) {
        //set validation
        this.userInput = userInput;
    }
    
    //this method will take the user's input and write it to the file
    @Override
    public final void writeMessage(String message) throws Exception {
        PrintWriter outputFile = new PrintWriter(getFileName());
        
        do {
            newMessage.writeMessage("Enter a message to be stored in the "
                    + "file named " + getFileName());
            
            message = keyboard.nextLine();
            
            newMessage.writeMessage("Would you like to write another message to "
                    + "the file named " + getFileName() + "? (Yes or No) " );
        } while (userInput.equalsIgnoreCase("Yes"));
          
        outputFile.close();
    }
    
}
