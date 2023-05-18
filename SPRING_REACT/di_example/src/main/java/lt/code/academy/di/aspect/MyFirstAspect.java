package lt.code.academy.di.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyFirstAspect {

    //@Around sitas aspektas, kvieciamas pies metoda ir po jo
    //@Before kvieciamas pries metodo kvietima
    //@After sita kvieciame po metodo kvietimo
    //@AfterReturning isiterpti kai rezultatas nebuvo dar grazintas is kur kviete

    @Around("execution(* lt.code.academy.di.GradeService.getMarkAverage())")
    public Double changeMarkAverage(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Buvo iskviestas pries getMarkAverage");

        Object value = joinPoint.proceed();

        if(value instanceof Double average) {
            System.out.println("Nepakeistas rezultatas " + average);
            return average + 25;
        }

        return 0.0;
    }
}
