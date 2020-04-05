import lombok.Data;

@Data
public class Test {
    private int test;

    public Test() {
    }

    protected boolean canEqual(Object other) {
        return other instanceof Test;
    }
}
