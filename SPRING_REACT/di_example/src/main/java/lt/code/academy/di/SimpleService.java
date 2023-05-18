package lt.code.academy.di;

import org.springframework.stereotype.Service;

@Service
public class SimpleService {
    private final AnotherService anotherService;

    public SimpleService(AnotherService anotherService){
        this.anotherService =anotherService;
    }

    public void sayHi() {
        System.out.println("Mane sukure jeeee!");
        anotherService.anotherServiceMethod();
    }
}