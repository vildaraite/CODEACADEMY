package lt.codeacademy.first.project.examples.inheritance.abstractClass.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Person {
    private final String name;
    private final String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public abstract void printInfo();

    @Override
    public String toString() {
        return String.format("name: %s, surname: %s", name, surname);
    }

    public boolean isValuesUnique(List<Person> persons) {
        List<Person> uniquePersons = new ArrayList<>();

        for(Person p : persons) {
            if(uniquePersons.contains(p)){
                return false;
            }
            uniquePersons.add(p);
        }

        return true;

		/*for(Person p: persons) {
			if(!uniquePersons.contains(p)) {
				uniquePersons.add(p);
			}
		}
		return persons.size() == uniquePersons.size();*/
    }

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
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}

