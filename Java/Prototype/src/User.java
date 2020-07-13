public class User implements Cloneable {
    private String name;
    private String id;
    private String password;

    public User() {
        name = "이름";
        id = "Id";
        password = "pw";
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
}