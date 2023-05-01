package bytestreams2;

import java.io.Serializable;

public class Student implements Serializable {

    String id;
    String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "id:" + this.id + ", name:" + this.name + '}';
    }

}
