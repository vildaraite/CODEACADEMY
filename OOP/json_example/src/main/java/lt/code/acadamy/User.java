package lt.code.acadamy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL) // idet i ND
public record User (
        // norint pakeisti sita name, dedame @JsonProperty ("ir skliaustuose pakeiciam pavadinima propercio")
        String name,
        String surname,
        String email,
        int age) {


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
