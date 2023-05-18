package lt.code.academy.eshop.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lt.code.academy.eshop.validator.annotation.FieldsComparator;

import java.lang.reflect.Field;

public class CompareFieldsValidator implements ConstraintValidator<FieldsComparator, Object> {
    private String firstFieldName;
    private String secondFieldName;

    @Override
    public void initialize(FieldsComparator constraintAnnotation)
    {
        firstFieldName = constraintAnnotation.first();
        secondFieldName = constraintAnnotation.second();
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext)
    {
        Object first = getValue(o, firstFieldName);
        Object second = getValue(o, secondFieldName);

        return first != null && first.equals(second);
    }

    private Object getValue(Object o, String fieldName) {
        try {
            Class<?> objectClass = o.getClass();
            Field field = objectClass.getDeclaredField(fieldName);
            field.setAccessible(true);

            return field.get(o);
        } catch(Exception e){
            //TODO log
        }

        return null;
    }
}