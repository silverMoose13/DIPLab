package dip.lab3.student.solution1;

/**
 *
 * @author Aaron
 */

//this class serves as the high level class in the program. It delegates the work
//off to the MessageReader and MessageWriter classes. 
public class MessagingSystem {

    private MessageReader newReader;
    private MessageWriter newWriter;
    
    public MessagingSystem (MessageReader newReader, MessageWriter newWriter) {
        this.newReader = newReader;
        this.newWriter = newWriter;
    }

    public final MessageReader getNewReader() {
        return newReader;
    }

    public final void setNewReader(MessageReader newReader) {
        this.newReader = newReader;
    }

    public final MessageWriter getNewWriter() {
        return newWriter;
    }

    public final void setNewWriter(MessageWriter newWriter) {
        this.newWriter = newWriter;
    }
    
    ////////
    ////////
    // I will probably need a new method here since in the case of the file. Writing happens
    //first and then reading so the method below can't be used for that
    ////////
    ////////
    
    public final void generateMessage() throws Exception {
        //this String variable named message is local to this method. It is imperative this
        //occurs this way because we don't want this class to start
        //independently making its own messages. This is the job
        //of the MessageWriter and MessageReader classes to go delegate that
        //work further downstream.
        String message = newReader.readMessage();
        newWriter.writeMessage("The message passed in reads: " + message + "\n");
    }
}
