package optional;

import lombok.NonNull;

import java.util.Optional;

public class Student {

    private int id;
    private String group = null;

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, @NonNull String group) {
        this.id = id;
        this.group = group;
    }

    public Optional<String> getGroup() {
        return Optional.ofNullable(group);
    }
}
