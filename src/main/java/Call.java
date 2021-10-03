public class Call {
    private long phoneNumber;

    public Call(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Call{" +
                "phoneNumber=" + phoneNumber +
                '}';
    }
}
