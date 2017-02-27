package dip.lab3.student.solution1;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Aaron
 */
//the main responsibility of this class is to read the contents stored in a specific file
public class FileMessageReader implements MessageReader {

    private String fileName;
    private ConsoleMessageWriter newMessage;

    public FileMessageReader(String fileName) {
        this.fileName = fileName;
    }
    
    //new default constructor so to give the user a chance to enter a filename
    public FileMessageReader() {}

    public final String getFileName() {
        return fileName;
    }

    public final void setFileName(String fileName) {
        this.fileName = fileName;
    }

    //this method will acquire the filename, open it up, and read from it
    @Override
    public final String readMessage() throws Exception {
        Scanner keyboard = new Scanner(System.in);

        newMessage.writeMessage("Enter in the file name you would like to read from: ");
        fileName = keyboard.nextLine();

        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext()) {
            String message = inputFile.nextLine();
            newMessage.writeMessage(message);
        }
        
        inputFile.close();
        return "";
    }

}
