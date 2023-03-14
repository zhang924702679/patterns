package reflection.demo;

public class TestBase {

    private String id;

    public TestBase() {
    }

    public TestBase(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TestBase{" +
                "id='" + id + '\'' +
                '}';
    }
}
