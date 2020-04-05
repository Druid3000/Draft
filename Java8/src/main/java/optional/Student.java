package optional;

import lombok.NonNull;

import java.util.Optional;

public class Student {

    private int id;
    private String group = null;

    Student(int id) {
        this.id = id;
    }

    public Student(int id, @NonNull String group) {
        this.id = id;
        this.group = group;
    }

    Optional<String> getGroup() {
        return Optional.ofNullable(group);
    }
}
