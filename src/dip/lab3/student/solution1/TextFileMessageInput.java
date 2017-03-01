package dip.lab3.student.solution1;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Aaron
 */
//this class was just for practice

//the main responsibility of this class is to read the contents stored in a specific text file
public class TextFileMessageInput implements MessageInput {

    private String fileName;
    private ConsoleMessageOutput newMessage;

    public TextFileMessageInput(String fileName) {
        this.fileName = fileName;
    }

    //new default constructor so to give the user a chance to enter a filename
    public TextFileMessageInput() {
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

    //this method will acquire the filename, open it up, and read from it
    @Override
    public final String inputMessage() throws Exception {
        Scanner keyboard = new Scanner(System.in);

        newMessage.outputMessage("Enter in the file name you would like to read from: ");
        fileName = keyboard.nextLine();

        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext()) {
            String message = inputFile.nextLine();
            newMessage.outputMessage(message);
        }

        inputFile.close();
        return "";
    }

}
