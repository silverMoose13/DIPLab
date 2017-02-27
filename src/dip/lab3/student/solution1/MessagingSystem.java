package dip.lab3.student.solution1;

/**
 *
 * @author Aaron
 */
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
    
    public final void generateMessage() {
        //this String variable named message is local to this method. It is imperative this
        //occurs this way because we don't want this class to start
        //independently making its own messages. This is the job
        //of the MessageWriter and MessageReader classes to go delegate that
        //work further downstream.
        String message = newReader.readMessage();
        newWriter.writeMessage("The message passed in reads: " + message + "\n");
    }
}
