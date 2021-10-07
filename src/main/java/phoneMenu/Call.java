package phoneMenu;

public class Call {
    private long phoneNumber;

    public Call(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Call{" +
//                "callIndex" + index +
                "phoneNumber=" + phoneNumber +
                '}';
    }


}
