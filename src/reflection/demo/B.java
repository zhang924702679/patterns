package reflection.demo;

public class B extends A{

    private String id;

    public B() {
    }

    public B(String id) {
        this.id = id;
    }

    public B(String name, String id) {
        super(name);
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
        return "B{" +
                "id='" + id + '\'' +
                '}';
    }
}
