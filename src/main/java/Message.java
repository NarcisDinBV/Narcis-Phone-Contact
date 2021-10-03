import java.util.ArrayList;
import java.util.List;

public class Message {
    private long number;
    private String messageContent;


    public Message(long number, String messageContent) {
        this.number = number;
        this.messageContent = messageContent;
    }

    public long getNumber() {
        return number;
    }


    @Override
    public String toString() {
        return "Message{" +
                "number=" + number +
                ", messageContent='" + messageContent + '\'' +
                '}';
    }
}

