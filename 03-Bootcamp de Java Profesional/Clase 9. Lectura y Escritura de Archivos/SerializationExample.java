import java.io.Serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private transient int age; // The 'transient' keyword means this field will not be serialized

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{name='" + name + '\'' + ", age=" + age + '}';
    }
}


public class SerializationExample {
    public static void main(String[] args) {
        // Serialize
        User user = new User("Alice", 30);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.dat"))) {
            out.writeObject(user);
            System.out.println("Object has been serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.dat"))) {
            User user = (User) in.readObject();
            System.out.println("Object has been deserialized");
            System.out.println(user);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
