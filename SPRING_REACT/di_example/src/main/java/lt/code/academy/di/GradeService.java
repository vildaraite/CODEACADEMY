package lt.code.academy.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GradeService {
    private final MarkDao markDao;
    private final SimpleService service;

    public GradeService(@Qualifier("customMarkDao") MarkDao markDao, SimpleService service) {
        this.markDao = markDao;
        this.service = service;
    }

    public Double getMarkAverage() {
        service.sayHi();
        return markDao.getMarks()
                .stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }
}