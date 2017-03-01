package dip.lab3.student.solution1;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Aaron
 */
//this class was just for practice

//this responsibility of this class get the text file name and write one or
//multiple messages to that file.
public class TextFileMessageOutput implements MessageOutput {

    private String fileName;
    private String userInput;
    private ConsoleMessageOutput newMessage;
    private Scanner keyboard;

    public TextFileMessageOutput(String fileName) {
        this.fileName = fileName;
        newMessage = new ConsoleMessageOutput();
        keyboard = new Scanner(System.in);
    }

    //new default constructor so to give the user a chance to enter a filename
    public TextFileMessageOutput() {
    }

    public final String getFileName() {
        return fileName;
    }

    public final void setFileName(String fileName) {
        if (fileName == null || fileName.isEmpty()) {
            throw new IllegalArgumentException("Error: filename must not be empty or null.");
        } else if (!(fileName.endsWith(".txt"))) {
            throw new IllegalArgumentException("Error: filename must not be empty or null.");
        }
        this.fileName = fileName;
    }

    public final String getUserInput() {
        return userInput;
    }

    public final void setUserInput(String userInput) {
        if (userInput == null || userInput.isEmpty()) {
            throw new IllegalArgumentException("Error: filename must not be empty or null.");
        }
        this.userInput = userInput;
    }

    //this method will prompt the user enter a message. It will then take
    //the user's input and write it to the file
    @Override
    public final void outputMessage(String message) throws Exception {
        PrintWriter outputFile = new PrintWriter(getFileName());

        do {
            newMessage.outputMessage("Enter a message to be stored in the "
                    + "file named " + getFileName());

            message = keyboard.nextLine();

            newMessage.outputMessage("Would you like to write another message to "
                    + "the file named " + getFileName() + "? (Yes or No) ");
            
            userInput = keyboard.nextLine();

            if (userInput.equalsIgnoreCase("Yes") || userInput.equalsIgnoreCase("No")) {
                throw new IllegalArgumentException("Error: improper input.");
            }
        } while (userInput.equalsIgnoreCase("Yes"));

        outputFile.close();
    }

}
