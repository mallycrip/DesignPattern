public class User {
    private String name;
    private String id;
    private String password;

    public static class Builder {
        private String name;
        private String id = "None";
        private String password = "None";

        public Builder(String name) {
            this.name = name;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    private User(Builder builder) {
        name = builder.name;
        id = builder.id;
        password = builder.password;
    }
}