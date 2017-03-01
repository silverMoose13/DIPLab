package dip.lab3.student.solution1;

/**
 *
 * @author Aaron
 */
//this class serves as the high level class in the program. It delegates the work
//off to the MessageReader and MessageWriter classes. 
public class MessagingService {

    //reader and writer consider changing name
    private MessageInput reader;
    private MessageOutput writer;

    public MessagingService(MessageInput reader, MessageOutput writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public final MessageInput getReader() {
        return reader;
    }

    public final void setReader(MessageInput reader) {
        if (reader == null) {
            throw new IllegalArgumentException("Error: value must not be null.");
        } else {
        this.reader = reader;
        }
    }

    public final MessageOutput getWriter() {
        return writer;
    }

    public final void setWriter(MessageOutput writer) {
        if (writer == null) {
            throw new IllegalArgumentException("Error: value must not be null.");
        } else {
            this.writer = writer;
        }
    }

    public final void generateMessage() throws Exception {
        //this String variable named message is local to this method. It is imperative this
        //occurs this way because we don't want this class to start
        //independently making its own messages. This is the job
        //of the MessageWriter and MessageReader classes to go delegate that
        //work further downstream.
        String message = reader.inputMessage();

        //I would have liked to add some dialog here along with the message displaying
        //but it when I did, the GUI riddle response matching logic did not work properly
        writer.outputMessage(message);
    }
}
