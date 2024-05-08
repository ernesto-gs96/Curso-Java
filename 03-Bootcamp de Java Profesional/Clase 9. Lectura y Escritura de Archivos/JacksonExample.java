import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Person {
    @JsonProperty("name")
    private String name;

    @JsonProperty("age")
    private int age;

    // Standard getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}


public class JacksonExample {
    public static void main(String[] args) {
        // Serialize
        ObjectMapper mapper = new ObjectMapper();
        Person person = new Person();
        person.setName("Alice");
        person.setAge(30);

        try {
            String jsonResult = mapper.writeValueAsString(person);
            System.out.println("Serialized JSON: " + jsonResult);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Deserialize
        ObjectMapper mapper = new ObjectMapper();
        String jsonInput = "{\"name\":\"Alice\",\"age\":30}";

        try {
            Person person = mapper.readValue(jsonInput, Person.class);
            System.out.println("Deserialized person: " + person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
