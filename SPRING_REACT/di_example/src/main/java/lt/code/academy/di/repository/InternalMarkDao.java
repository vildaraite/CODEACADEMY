package lt.code.academy.di.repository;

import lt.code.academy.di.MarkDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InternalMarkDao implements MarkDao {

    @Override
    public List<Double> getMarks() {
        return List.of(9.0, 4.5, 6.9, 7.5, 9.5, 4.7);
    }
}
