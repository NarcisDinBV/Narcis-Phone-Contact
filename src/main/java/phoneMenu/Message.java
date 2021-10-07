package phoneMenu;

public class Message {
    private int messageIndex;
    private long phoneNumber;
    public String messageContent;


    public Message(int messageIndex, long phoneNumber, String messageContent) {
        this.messageIndex = messageIndex;
        this.phoneNumber = phoneNumber;
        this.messageContent = messageContent;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    @Override
    public String toString() {
        return "Message{" +
                "number=" + phoneNumber +
                ", messageContent='" + messageContent + '\'' +
                '}';
    }


}

