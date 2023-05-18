package lt.code.academy.di.repository;
import lt.code.academy.di.MarkDao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Primary
@Repository
public class NewInternalMarkDao implements MarkDao
{
    @Override
    public List<Double> getMarks() {
        return List.of(2.0, 10.0, 3.9);
    }
}
