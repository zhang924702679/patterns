package reflection.demo;

public class TestDO extends TestBase{

    private String type;

    public TestDO() {
    }

    public TestDO(String type) {
        this.type = type;
    }

    public TestDO(String id, String type) {
        super(id);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TestDO{" +
                "type='" + type + '\'' +
                '}';
    }
}
