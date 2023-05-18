package lt.code.academy;

import java.io.Serializable;

public class Payment implements Serializable {
    private Sender sender;
    private Receiver receiver;

    public Payment(){}

    public Payment(Sender sender, Receiver receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public Sender getSender() {
        return sender;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "sender=" + sender +
                ", receiver=" + receiver +
                '}';
    }
}