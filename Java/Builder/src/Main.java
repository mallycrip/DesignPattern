public class Main {
    public static void main(String[] args) {
        User user = new User
            .Builder("이름")
            .id("Id")
            .password("P@ssword")
            .build();    
    }
}