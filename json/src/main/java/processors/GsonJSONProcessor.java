package processors;

import model.Person;
import com.google.gson.Gson;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Using GSON library
 */
public class GsonJSONProcessor implements JSONProcessor {
    @Override
    public Person parseString(String personJsonObj) throws Exception {
        Gson gSon = new Gson();
        Person person = gSon.fromJson(personJsonObj, Person.class);
        return person;
    }

    public Person parseFromFile(String fileName) throws Exception {

        Gson gSon = new Gson();
        BufferedReader br = new BufferedReader(new FileReader(getFileFromURL()));
        Person person = null;
        if (br != null) {
            person = gSon.fromJson(br, Person.class);
        }
        return person;

    }

    @Override
    public String generateJson(Person person) throws Exception {
        Gson gSon = new Gson();
        return gSon.toJson(person);
    }

    private File getFileFromURL() {
        URL url = this.getClass().getClassLoader().getResource("staging/persons.json");
        File file = null;
        try {
            file = new File(url.toURI());
        } catch (URISyntaxException e) {
            file = new File(url.getPath());
        } finally {
            return file;
        }
    }

    public static void main(String[] args) throws Exception {


        JSONProcessor jsonProcessor = new GsonJSONProcessor();
        Person person = jsonProcessor.parseFromFile("person.json");
        // Person person = jsonProcessor.parseString(personJsonObj);
        System.out.println(person.getFirstName() + " " + person.getLastName());
        System.out.println("--------------------");
        System.out.println(jsonProcessor.generateJson(person));


    }
}
