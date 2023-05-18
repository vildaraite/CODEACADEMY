package lt.code.academy.data;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentResult extends Student {

    private int result;


    public StudentResult(int id, String name, String surname, int result) {
        super(id, name, surname);
        this.result = result;
    }
}

