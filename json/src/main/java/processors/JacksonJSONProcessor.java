package processors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Person;

/**
 * Using Jackson API
 */
public class JacksonJSONProcessor implements JSONProcessor {
    public Person parseString(String personJsonObj) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Person person = mapper.readValue(personJsonObj, Person.class);
        return person;
    }

    @Override
    public Person parseFromFile(String personJsonObj) throws Exception {
        return null;
    }

    public String generateJson(Person person) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(person);
    }

    public static void main(String[] args) throws Exception {
        JSONProcessor jsonProcessor = new JacksonJSONProcessor();
        Person person = jsonProcessor.parseString(personJsonObj);
        System.out.println(person.getFirstName() + " " + person.getLastName());
        System.out.println("--------------------");
        System.out.println(jsonProcessor.generateJson(person));
    }
}
