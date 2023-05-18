package lt.codeacademy.first.project.examples.files.task;

import java.util.Objects;

public record Payment(int id, int sum, int receiverId, int senderId) implements Comparable<Payment> {

    @Override
    public boolean equals(Object o) {
        if(this == o)
        {
            return true;
        }
        if(o == null || getClass() != o.getClass())
        {
            return false;
        }
        Payment payment = (Payment) o;
        return id == payment.id && sum == payment.sum && receiverId == payment.receiverId && senderId == payment.senderId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sum, receiverId, senderId);
    }

    @Override
    public int compareTo(Payment o) {
        if(sum == o.sum) {
            if(id == o.id){
                return 0;
            }
            return id > o.id ? 1 : -1;
        }
        return sum > o.sum ? -1 : 1;
    }
}