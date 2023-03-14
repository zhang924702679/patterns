package reflection.demo;

public class TestVO extends TestBase{

    private String type;

    private String count;

    public TestVO() {
    }

    public TestVO(String type, String count) {
        this.type = type;
        this.count = count;
    }

    public TestVO(String id, String type, String count) {
        super(id);
        this.type = type;
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "TestVO{" +
                "type='" + type + '\'' +
                ", count='" + count + '\'' +
                '}';
    }
}
